package corelesson5;
public class ThreadDemo6 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		for (int i = 1; i <= 10; i++) {
			try {
				t1.sleep(10000); //不是t1，而是main去睡10秒
				//完全等價於 Thread.sleep(10000); (靜態寫法)
				//建議不要這樣寫
				//哪個線程執行到sleep，哪個線程就去sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("world");
		}
	}
}

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}