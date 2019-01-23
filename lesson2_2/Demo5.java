package lesson2_2;

public class Demo5 {
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.f());
		System.out.println(d.g());
	}
}
class C{
	public int i = 27;
	public int f() {
		return g();
	}
	private int g() { //把private換成public試試結果
		return i;
	}
}
class D extends C{
	public int i = 47;
	public int g() {
		return i; //子類中直接訪問的 i 都是子類自己聲明的
		//父類繼承的 i 必須通過父類繼承的方法訪問，或者super
//		return super.i;
	}
}