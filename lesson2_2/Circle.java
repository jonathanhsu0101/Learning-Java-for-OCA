package lesson2_2;

public class Circle extends Shape{
	/*java中的繼承是全部繼承，即使private也繼承
	 * private繼承過來之後不能直接訪問，只能通過
	 * 繼承過來的父類的非private函數訪問
	*/
	private double r;
	public Circle(Point location, double r) {
		super(location);
		this.r = r;
	}
	public double getArea() {
		return 3.14 * r * r;
	}
	public double getLength() {
		return 2 * 3.14 * r;
	}
	public boolean contains(Point p) {
		return this.getLocation().getDistance(p) <= r;
	}
	@Override
	public void printData() {
		super.printData();
		System.out.println("半徑是："+r);
	}
}
