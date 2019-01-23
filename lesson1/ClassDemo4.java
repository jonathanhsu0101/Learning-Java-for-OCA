package lesson1;

public class ClassDemo4 {
	public static void main(String[] args) {
		Person4 p1 = new Person4(175, 180, "zhangsan"); //自動調用了構造函數
		System.out.println(p1.name + "," + p1.h + "," + p1.w);
		p1.eat();
		p1.walk();
		System.out.println("==============================");
		Person4 p2 = new Person4(170, 176, "lisi");
		System.out.println(p2.name + "," + p2.h + "," + p2.w);
		p2.eat();
		p2.walk();
	}
}

class Person4 {
	double h, w;
	String name;
	//成員函數可以訪問其他成員
	Person4(double a, double b, String c) {
		System.out.println("構造函數被調用");
		h = a;
		w = b;
		name = c;
	}
	void eat() {
		System.out.println(name + " is eating....");
	}
	void walk() {
		System.out.println(name + " is walking...");
	}
}