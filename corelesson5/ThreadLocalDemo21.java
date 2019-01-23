package corelesson5;
import java.lang.reflect.Constructor;

public class ThreadLocalDemo21 {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					UserService us =
							UserService.getInstance();
					System.out.println(Thread
							.currentThread().getName()
							+ "  " + us);
					A a1 = new A();
					B b1 = new B();
					a1.print();
					b1.print();
				}
			}).start();
			/*同一個線程同一個對象，通過反射無效*/
		}
		System.out.println("==========================");
		Class<UserService> c = UserService.class;
		try {
			Constructor<UserService> cs = c
					.getDeclaredConstructor(new Class[] {});
			cs.setAccessible(true); //private 設置訪問方式
			UserService us1 = cs.newInstance(new Object[] {});
			UserService us2 = cs.newInstance(new Object[] {});
			System.out.println(us1 == us2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static class A {
		public void print() {
			UserService us = UserService.getInstance();
			System.out.println("from A   "
					+ Thread.currentThread().getName()
					+ "..." + us);
		}
	}
	static class B {
		public void print() {
			UserService us = UserService.getInstance();
			System.out.println("from B    "
					+ Thread.currentThread().getName()
					+ "..." + us);
		}
	}
}
