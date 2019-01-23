package lesson1;

public class ClassDemo18 {
	public static void main(String[] args) {
		Test.f(); //靜態的方法可以直接用「類名.」調用
	}
}
class Test{
	//static int i = 11;
	static int i;
	static {
		i = 11;
		System.out.println("hello");
	}
	static void f() {
		System.out.println("world");
	}
}