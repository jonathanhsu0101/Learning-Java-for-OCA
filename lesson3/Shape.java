package lesson3;

public abstract class Shape {
	private Point location;
	public Shape() {}
	public Shape(Point location) {
		this.location = location;
	}
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	public abstract double getArea();
	public abstract double getLength();
	public abstract void draw();
	public void printLocation() {
		System.out.println("圖形的位置："+location.getX()+","+location.getY());
	}
	public void printData() {
		System.out.println(location.getX()+","+location.getY());
	}
}
