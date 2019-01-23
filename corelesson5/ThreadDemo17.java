package corelesson5;

public class ThreadDemo17 {
	public static void main(String[] args) {
		Send send = new Send();
		Rec rec = new Rec(send);
		Thread t1 = new Thread(send);
		Thread t2 = new Thread(rec);
		t1.start();
		t2.start();
	}
}

class Send implements Runnable {
	boolean flag;
	int theValue;
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			synchronized (this) {
				while (flag) {
					try {
						this.wait(); 
						//wait 會釋放同步的鑰匙
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				for (int j = 1; j <= 10; j++) {
					System.out.println("A線程循環" + j
							+ "次");
				}
				flag = true;
				//喚醒食客
				this.notify();
			}
		}
	}
}

class Rec implements Runnable {
	private Send send;
	public Rec(Send send) {
		super();
		this.send = send;
	}
	@Override
	public void run() {
		//不知道生產者生產多少食物
		//，生產多少消費多少
		for (int i = 1; i <= 50; i++) {
			synchronized (send) {
				while (!send.flag) {
					try {
						send.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				for (int j = 1; j <= 20; j++) {
					System.out.println("B線程循環" + j
							+ "次");
				}
				send.flag = false;
				send.notify();
			}
		}
	}
}