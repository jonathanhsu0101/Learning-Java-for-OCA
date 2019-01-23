package lesson1;

public class ClassDemo11 {
	public static void main(String[] args) {
		Point11 p1 = new Point11(8,8);
		Point11 p2 = p1;
		System.out.println(p1.x);
		p2.x = 20;
		System.out.println(p1.x);
	}
}
class Point11{
	double x, y;
	Point11(double a, double b){
		x = a;
		y = b;
	}
	Point11(){}
	double getDistance() {
		return Math.sqrt(x*x+y*y);
	}
	void showLocation() {
		System.out.println("點的座標("+x+":"+y+")");
	}
}