package lesson2_1;

public class Demo1 {
	public static void main(String[] args) {
		Circle1 c = new Circle1(10,10,10);
		System.out.println(c.getArea());
		c.printLocation();
		
		Rectangle1 r = new Rectangle1(10,10,10,10);
		r.printLocation();
	}
}
class Shape1{
	Point1 location;
	double getArea() {return 0;} //這只是一個模擬，我們現在並不知道如何求面積
	double getLength() {return 0;} //也是一個模擬，一定有這個動作存在
	void printLocation() {
		System.out.println("我的位置是："+location.x+","+location.y);
	}
}
class Rectangle1 extends Shape1{
	double w,h;
	Rectangle1(double x, double y, double w, double h){
		super(); //不寫也默認有寫
		this.location = new Point1(x, y);
		this.w = w;
		this.h = h;
	}
	double getArea() {
		return w*h;
	}
	double getLength() {
		return 2*(w+h);
	}
}
class Circle1 extends Shape1{
	double r;
	Circle1(Point1 location, double r){
		this.location = location;
		this.r = r;
	}
	Circle1(double x, double y, double r){
		this(new Point1(x, y), r);
	}
	double getArea() {return 3.14*r*r;}
	double getLength() {return 2*3.14*r;}
}
class Point1{
	double x, y;
	Point1(){}
	Point1(double x, double y){
		this.x = x;
		this.y = y;
	}
	double getDistance() {return Math.sqrt(x*x+y*y);	}
	double getDistance(Point1 other) {
		return Math.sqrt((this.x-other.x)*(this.x-other.x)
				+(this.y-other.y)*(this.y-other.y));
	}
}