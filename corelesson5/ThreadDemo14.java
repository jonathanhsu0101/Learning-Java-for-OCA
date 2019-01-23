package corelesson5;
import java.util.Random;

public class ThreadDemo14 {
	public static void main(String[] args) {
		FlagSend send = new FlagSend();
		FlagRec rec = new FlagRec(send);
		Thread t1 = new Thread(send);
		Thread t2 = new Thread(rec);
		t1.start();
		t2.start();
	}
}

class FlagSend implements Runnable {
	int theValue;
	boolean flag;
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			while (flag) {
				Thread.yield();
			}
			theValue = new Random().nextInt(1000);//製造食物
			System.out.println("send value is :" + theValue);
			flag = true; //自己去等待，讓食客去吃
		}
	}
}

class FlagRec implements Runnable {
	private FlagSend flagSend;
	public FlagRec(FlagSend flagsend) {
		super();
		this.flagSend = flagsend;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			while (!flagSend.flag) {
				Thread.yield();
			}
			System.out.println("receive value is :"
					+ flagSend.theValue);
			flagSend.flag = false;
		}
	}
}