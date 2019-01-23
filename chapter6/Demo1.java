/* 繼承：就是把代碼拿過來用嘛
 * 
 *  繼承：主要是代碼的複用（設計中意義會更多）
 * 				繼承的關鍵字 extends
 * 				java 的繼承是全部繼承，除構造函數之外
 * 
 * 		例：class Circle extends Shape
 * 				Circle 這個類就是 Shape 的子類
 * 				Shape 類就稱為 Circle 的父類
 */
package chapter6;

public class Demo1
{
	public static void main(String[] args)
	{
		Circle c = new Circle(10,10,10);
		System.out.println(c.getArea());
		c.printLocation();
		
		Rectangle r = new Rectangle(10,10,10,10);
		r.printLocation();
	}
}

class Shape
{
	Point location;
	double getArea()
	{
		return 0; //這只是模擬，我們還不知道如何求面積
	}
	double getLegnth()
	{
		return 0; //也只是模擬，一定有這個動作
	}
	void printLocation()
	{
		System.out.println("我的位置是："+location.x+", "+location.y);
	}
}
class Rectangle extends Shape
{
	double w, h;
	Rectangle(double x, double y, double w, double h)
	{
		this.location = new Point (x, y);
		this.w = w;
		this.h = h;
	}
	double getArea()
	{
		return w * h;
	}
	double getLength()
	{
		return 2 * (w + h);
	}
}
class Circle extends Shape
{
	double r;
	Circle(Point location, double r)
	{
		this.location = location;
		this.r = r;
	}
	Circle (double x, double y, double r)
	{
		this(new Point(x, y), r);
	}
	double getArea()
	{
		return 3.14 * r * r;
	}
	double getLength()
	{
		return 3.14 * r * 2;
	}
}
class Point
{
	double x, y;
	Point(){}
	Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	double getDistance()
	{
		return Math.sqrt(x*x + y*y);
	}
	double getDistance(Point other)
	{
		return Math.sqrt((x - other.x)*(x - other.x) + (y - other.y)*(y - other.y));
	}
}