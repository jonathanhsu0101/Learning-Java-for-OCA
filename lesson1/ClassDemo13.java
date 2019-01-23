package lesson1;

public class ClassDemo13 {
	public static void main(String[] args) {
		//this的一種用法，參數名和成員名一樣
		Person13 p1 = new Person13(30,175,100,"zhangsan");
	}
}
class Person13{
	int age; double h, w; String name;
	Person13(int age, double h, double w, String name){
		//這種情況下this不能省略
		this.age = age;
		this.h = h;
		this.w = w;
		this.name = name;
	}
}
class Point13{
	double x, y;
	Point13(double x, double y){
		this.x = x;
		this.y = y;
	}
	Point13(){}
	double getDistance() {
		return Math.sqrt(x*x+y*y);
	}
	void showLocation() {
		System.out.println("點的座標("+x+":"+y+")");
	}
}