package lesson3;

public class Demo10 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.a();
		A2 a2 = new A2();
		a2.b();
	}
}

interface TT {
	void a();
	void b();
	void c();
	void d();
	void e();
}
/*
 * 接口設計太多，太肥胖 ---> 接口被汙染了 class A1 implements TT { public void a() {
 * System.out.println("aa...."); } public void b() {} public void c() {} public
 * void d() {} public void e() {} // 方法只要有{}就叫有實現 }
 * 
 * class A2 implements TT { public void a() {} public void b() {
 * System.out.println("bb...."); } public void c() {} public void d() {} public
 * void e() {} }
 */

abstract class TTAdapter implements TT {
	public void a() {}
	public void b() {}
	public void c() {}
	public void d() {}
	public void e() {}
} // 這個類沒有必要有任何對象，所以適配器類可以直接聲明成 abstract

class A1 extends TTAdapter {
	public void a() {
		System.out.println("a....");
	}
}

class A2 extends TTAdapter {
	public void b() {
		System.out.println("b.....");
	}
}