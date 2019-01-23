package corelesson5;
import java.util.Random;

public class ThreadDemo15 {
	public static void main(String[] args) {
		WaitSend send = new WaitSend();
		WaitRec rec = new WaitRec(send);
		Thread t1 = new Thread(send);
		Thread t2 = new Thread(rec);
		//把t2設成守護線程，當程序只有守護線程運行時，
		//程序自動結束
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}
}

class WaitSend implements Runnable {
	boolean flag;
	int theValue;
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			synchronized (this) {
				while (flag) //需要用while存在中斷和虛假喚醒
				{
					try {
						this.wait(); //wait 會釋放同步的鑰匙
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//生產食物
				theValue = new Random().nextInt(1000);
				System.out.println(
						"send value is :" + theValue);
				//自己去等待
				flag = true;
				//喚醒食客
				this.notify();
			}
		}
	}
}

class WaitRec implements Runnable {
	private WaitSend send;
	public WaitRec(WaitSend send) {
		super();
		this.send = send;
	}
	@Override
	public void run() {
		//不知道生產者生產多少食物，生產多少消費多少
		while (true) {
			synchronized (send) {
				while (!send.flag) {
					try {
						send.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//消費食物
				System.out.println("receive value is :"
						+ send.theValue);
				//自己去等待
				send.flag = false;
				send.notify();
			}
		}
	}
}