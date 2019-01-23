package lesson2_1;

public class Demo2 {
	public static void main(String[] args) {
		Circle2 c = new Circle2(new Point2(10, 10), 10);
		c.printLocation();
		System.out.println(c.getArea());
		System.out.println("========================");
		Rectangle2 r = new Rectangle2(new Point2(10,10),10,10);
		r.printLocation();
		System.out.println(r.getArea());
	}
}

class Shape2 {
	Point2 location;
	Shape2(Point2 location) {
		this.location = location;
	}
	Shape2(double x, double y) {
		this(new Point2(x, y));
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

class Rectangle2 extends Shape2 {
	double w, h;
	Rectangle2(Point2 location, double w, double h){
		super(location);
		this.w = w;
		this.h = h;
	}
	Rectangle2(double x, double y, double w, double h){
		this(new Point2(x, y), w, h);
	}
	double getArea() {
		return w * h;
	}
	double getLength() {
		return 2 * (w + h);
	}
}

class Circle2 extends Shape2 {
	double r;
	Circle2(Point2 location, double r) {
		super(location);// 調用了父類的構造函數
		this.r = r;
	}
	Circle2(double x, double y, double r) {
		this(new Point2(x, y), r);
	}
	double getArea() {
		return 3.14 * r * r;
	}
	double getLength() {
		return 2 * 3.14 * r;
	}
}

class Point2 {
	double x, y;
	Point2() {}
	Point2(double x, double y) {
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