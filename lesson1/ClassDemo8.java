package lesson1;

public class ClassDemo8 {
	public static void main(String[] args) {
		Person8 p1 = new Person8(175,180,"zhangsan");
		Person8 p2 = new Person8();//創建使用默認值的對象
		Person8 p3 = new Person8(165,175);
	}
}
class Person8{
	double h, w;
	String name;
	Person8(double a, double b, String c){
		h = a;
		w = b;
		name = c;
	}
	Person8(double a, double b){
		System.out.println("調用帶兩個參數的構造函數");
		h = a;
		w = b;
	}
	Person8(){
		System.out.println("調用無參數的構造函數");
	}
	//成員函數可以訪問其他成員
	void eat() {
		System.out.println(name+" is eating....");
	}
	void walk() {
		System.out.println(name+" is walking...");
	}
}