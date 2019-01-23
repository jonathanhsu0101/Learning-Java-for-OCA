package corelesson5;
public class ThreadDemo11 {
	public static void main(String[] args) {
		final Output output = new Output();
		final Output output1 = new Output();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					output.print3("hello");
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					output.print2("WORLD");
				}
			}
		}).start();
	}
}

class Output {
	public void print(String name) {
		synchronized (this) {
			for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i));
			}
			System.out.println();
		}
	}
	//測試普通方法的鎖對象到底是哪個對象 ---> 當前對象
	public synchronized void print1(String name) {
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
	}
	//靜態對象的鎖對象是類類型Output.class
	public static synchronized void print2(String name) {
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
	}
	public void print3(String name) {
		synchronized (Output.class) {
			for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i));
			}
			System.out.println();
		}
	}
}