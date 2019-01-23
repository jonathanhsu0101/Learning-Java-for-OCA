package lesson1;

public class ClassDemo3 {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 10;
		System.out.println(p1.getDistance());
		p1.showLocation();
	}
}
class Point{
	double x, y;
	double getDistance() {
		return Math.sqrt(x*x + y*y);
	}
	void showLocation() {
		System.out.println(x+":"+y);
	}
}