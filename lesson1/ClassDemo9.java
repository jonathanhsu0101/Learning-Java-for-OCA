package lesson1;

public class ClassDemo9 {
	public static void main(String[] args) {
		Point9 p1 = new Point9();
		p1.showLocation();
		Point9 p2 = new Point9(6,8);
		p2.showLocation();
	}
}
class Point9{
	double x, y;
	Point9(double a, double b){
		x = a;
		y = b;
	}
	Point9(){}
	double getDistance() {
		return Math.sqrt(x*x+y*y);
	}
	void showLocation() {
		System.out.println("點的座標("+x+":"+y+")");
	}
}