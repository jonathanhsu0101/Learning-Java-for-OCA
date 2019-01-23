package lesson2_2;

public class Shape {
	private Point location;
	public Shape(Point location) {
		this.location = location;
	}
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	public double getArea() {return 0;}
	public double getLength() {return 0;}
	public void printLocation() {
		System.out.println("圖形的位置："+location.getX()+","+location.getY());
	}
	public void printData() {
		System.out.println(location.getX()+","+location.getY());
	}
}
