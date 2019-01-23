package lesson3;

public class Demo5 {
	public static void main(String[] args) {
		//
	}
}
class P{
	public final void test() {
		a();
		b();
		c();
	}
	void a() {}
	void b() {}
	void c() {}
}
/*class P1 extends P{
	public void test() { //無法改寫
		c();
		b();
		a();
	}
}
final class Q{
	
}
class Q1 extends Q{  //無法繼承
	
}*/