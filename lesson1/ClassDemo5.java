package lesson1;

public class ClassDemo5 {
	public static void main(String[] args) {
		Point5 p1 = new Point5(10,10);
		Point5 p2 = new Point5(6,8);
		System.out.println(p1.x+","+p1.y);
		p1.showLocation();
		p2.showLocation();
		System.out.println(p1.getDistance());
		System.out.println(p2.getDistance());
	}
}
class Point5{
	double x, y;
	Point5(double a, double b){
		x = a;
		y = b;
	}
	double getDistance() {
		return Math.sqrt(x*x+y*y);
	}
	void showLocation() {
		System.out.println("點的座標("+x+":"+y+")");
	}
}