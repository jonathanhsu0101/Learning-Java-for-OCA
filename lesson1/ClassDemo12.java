package lesson1;

public class ClassDemo12 {
	public static void main(String[] args) {
		Point12 p1 = new Point12(10,10);
		p1.showLocation();
		
		Point12 p2 = new Point12(20,20);
		p2.showLocation();
	}
}
class Point12{
	double x, y;
	Point12(double a, double b){
		this.x = a;
		this.y = b;
	}
	Point12(){}
	double getDistance() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	void showLocation() {
		System.out.println("點的座標("+this.x+":"+this.y+")");
	}
}