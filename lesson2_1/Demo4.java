package lesson2_1;

public class Demo4 {
	public static void main(String[] args) {
		B b = new B(); //控制台如何輸出？ 
	}
}
class A{
	static {
		System.out.println("aa......");//靜態定義初始化塊
	}
	{
		System.out.println("bb.......");//定義初始化塊
	}
	A(){
		System.out.println("cc.......");//構造函數
	}
}
class B extends A{
	static {
		System.out.println("dd.......");
	}
	{
		System.out.println("ee......");
	}
	B(){
		System.out.println("ff.......");
	}
}