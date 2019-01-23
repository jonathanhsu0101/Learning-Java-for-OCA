package lesson1;

public class ClassDemo15 {
	public static void main(String[] args) {
		Point15 p1 = new Point15(10,10);
		Point15 other = new Point15(5,5);
		//System.out.println(p1.getDistance(other));
		Circle15 c1 = new Circle15(p1,10);
		System.out.println(c1.contain(other));
		System.out.println(c1.contain(6, 6));
		Circle15 c2 = new Circle15(10,10,10);
		System.out.println(c2.contain(20, 20));
	}
}
class Circle15{
	Point15 center;
	double r;
	//寫構造函數
	Circle15(Point15 center, double r){
		this.center = center;
		this.r = r;
	}
	//創建如下的構造函數
	Circle15(double x, double y, double r){
		//this.center = new Point15(x, y);
		//this.r = r;
		this(new Point15(x,y),r);//調用重載中的另外一個構造函數，且必須放在第一句
	}
	//寫行為：求面積、求周長、是否包含一個點
	double getArea() {return 3.14*r*r;}
	double getLength() {return 3.14*r*2;}
	//圓是否包含點p ---> p到圓心的距離 <= r 就在圓內，否則在圓外
	boolean contain(Point15 p) {
		//求p到center的距離
		return center.getDistance(p) <= r;
	}
	boolean contain(double x, double y) {
		//return center.getDistance(new Point15(x,y)) <= r;
		return contain(new Point15(x,y));
	}
}
class Point15{
	double x, y;
	Point15(){}
	Point15(double x, double y){
		this.x = x;
		this.y = y;
	}
	//點到圓心的距離
	double getDistance() {return Math.sqrt(x*x+y*y);	}
	//一個點到另外一個點的距離
	//思考：這個函數將來要被一個點對象調用，求的就是那個點和other點之間的距離
	double getDistance(Point15 other) {
		return Math.sqrt((this.x-other.x)*(this.x-other.x)
				+(this.y-other.y)*(this.y-other.y));
	}
}