package lesson2_1;

public class Demo6 {
	public static void main(String[] args) {
		Circle6 c = new Circle6(5,5,10);
		c.printLocation();
	}
}
class Shape6 {
	Point6 location;
	Shape6(Point6 location) {
		this.location = location;
	}
	Shape6(double x, double y) {
		this(new Point6(x, y));
	}
	double getArea() {
		return 0;
	}
	double getLength() {
		return 0;
	}
	void printLocation() {
		System.out.println("我的位置是：" + location.x + "," + location.y);
	}
}
class Circle6 extends Shape6 {
	double r;
	Circle6(Point6 location, double r) {
		super(location);
		this.r = r;
	}
	Circle6(double x, double y, double r) {
		this(new Point6(x, y), r);
	}
	double getArea() {
		return 3.14 * r * r;
	}
	double getLength() {
		return 2 * 3.14 * r;
	}
	/*void printLocation() {
		System.out.println("我的位置是："+location.x+","+location.y+"半徑是："+r);
	}*/
	void printLocation() {
		super.printLocation(); //調用父類的 printLocation 方法
		System.out.println("半徑是："+r);
	}
}

class Point6 {
	double x, y;
	Point6() {}
	Point6(double x, double y) {
		this.x = x;
		this.y = y;
	}
	double getDistance() {
		return Math.sqrt(x * x + y * y);
	}
	double getDistance(Point6 other) {
		return Math.sqrt((this.x - other.x) * (this.x - other.x)
				+ (this.y - other.y) * (this.y - other.y));
	}
}