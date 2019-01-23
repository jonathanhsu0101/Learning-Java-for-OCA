package lesson3;

public class Demo12 {
	public static void main(String[] args) {
		Outer1 outer1 = new Outer1();
		outer1.test3();
		
		System.out.println("=========================");
		//因為是Inner是靜態的，屬於類，不屬於對象，可以這樣創建
		Outer1.Inner inner = new Outer1.Inner();
		inner.innertest();
		System.out.println("==========================");
		inner.innertest2();
	}
}
class Outer1{
	public void test1() {
		System.out.println("hello");
	}
	public static void test2() {
		System.out.println("world");
	}
	public void test3() {
		Inner inner = new Inner(); //在成員方法中直接使用靜態內部類
		inner.innertest();
	}
	static class Inner{ //靜態內部類 ---> 等價於靜態成員
		public void innertest() {
			System.out.println("innertest1");
		}
		//靜態內部類中不能訪問外部類的非靜態成員 ---> 靜態的只能訪問靜態的
		public void innertest2() {
			test2();
		}
	}
}