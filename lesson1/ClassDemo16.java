package lesson1;

public class ClassDemo16 {
	public static void main(String[] args) {
		Person16 p1 = new Person16();
		Person16 p2 = new Person16();
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person16.diqiu);
		p1.diqiu = 2;
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person16.diqiu);
		Person16.diqiu = 10;
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person16.diqiu);
	}
}
class Person16{
	int age;
	String name; //每個人都有自己的年齡、名字
	int h = 175;//每個人都有自己的身高，初始值都是175
	//表示地球 ---> 整數1代表地球
	//int diqiu = 1;//這樣代表每個人都擁有一個自己的地球，與現實生活不符 ---> 錯
	static int diqiu = 1;//所有人共用一個地球
	
}