package corelesson5;
/*
 * 面試題：
				先A線程運行10次，然後B線程運行20次，
				如此反覆50次
			理解：	A線程生產者		生產食物需要循環10次
							B線程消費者		消費食物需要循環20次
			改進：A 10次  B 20次  C 30次    如此50次
 */
public class ThreadDemo18 {
	public static void main(String[] args) {
		final Business1 bus = new Business1();
		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 50; i++) {
					bus.a();
				}
			}
		}).start();;
		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 50; i++) {
					bus.b();
				}
			}
		}).start();;
		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 50; i++) {
					bus.c();
				}
			}
		}).start();;
	}
}

class Business1 {
	int flag=1;
	public void a() {
		synchronized (this) {
			while (flag!=1) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for (int i = 1; i <= 10; i++) {
				System.out.println(
						"A線程循環" + i + "次");
			}
			flag = 2;
			this.notifyAll();
		}
	}
	public void b() {
		synchronized (this) {
			while (flag!=2) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for (int i = 1; i <= 20; i++) {
				System.out.println(
						"B線程循環" + i + "次");
			}
			flag = 3;
			this.notifyAll();
		}
	}
	public void c() {
		synchronized (this) {
			while (flag!=3) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for (int i = 1; i <= 30; i++) {
				System.out.println(
						"C線程循環" + i + "次");
			}
			flag = 1;
			this.notifyAll();
		}
	}
}