/*  1. 繼承中，子父類的構造函數的問題
 * 		1.1 子類必須調用父類的構造函數 (構造函數是不被繼承的)
 * 				如果沒有寫調用，那子類的構造函數默認會調用
 * 				父類的無參數的構造函數
 * 				 (該句默認就寫在子類構造函數的第一句) ---> super();
 * 				如果要顯示的調用，就要寫 super(參數列表)
 * 				而且該句必須在子類構造函數的第一句
 * 				需要給父類的構造函數傳遞參數
 */
package chapter6;

public class Demo2
{
	public static void main(String[] args)
	{
		Circle2 c = new Circle2(new Point2(10,10),10);
		c.printLocation();
		System.out.println(c.getArea());
		System.out.println("======================");
		Rectangle2 r = new Rectangle2(new Point2(10,10),10,10);
		r.printLocation();
		System.out.println(r.getArea());
	}
}

class Shape2
{
	Point2 location;
	Shape2(){}
	Shape2(Point2 location)
	{
		this.location = location;
	}
	Shape2(double x, double y)
	{
		this(new Point2(x, y));
	}
	double getArea()
	{
		return 0;
	}
	double getLegnth()
	{
		return 0;
	}
	void printLocation()
	{
		System.out.println("我的位置是："+location.x+", "+location.y);
	}
}

class Rectangle2 extends Shape2
{
	double w, h;
	Rectangle2(Point2 location, double w, double h)
	{
		super(location);
		this.w = w;
		this.h = h;
	}
	Rectangle2(double x, double y, double w, double h)
	{
		this(new Point2(x, y), w, h);
	}
	/*Rectangle(double x, double y, double w, double h)
	{
		super(); //默認等價於已經寫了
		this.location = new Point (x, y);
		this.w = w;
		this.h = h;
	}*/
	double getArea()
	{
		return w * h;
	}
	double getLength()
	{
		return 2 * (w + h);
	}
}

class Circle2 extends Shape2
{
	double r;
	Circle2(Point2 location, double r)
	{
		super(location); //調用了父類的構造函數
		this.r = r;
	}
	Circle2(double x, double y, double r)
	{
		this(new Point2(x, y), r);
	}
	/*Circle2(Point2 location, double r)
	{
		this.location = location;
		this.r = r;
	}
	Circle2 (double x, double y, double r)
	{
		this(new Point2(x, y), r);
	}*/
	double getArea()
	{
		return 3.14 * r * r;
	}
	double getLength()
	{
		return 3.14 * r * 2;
	}
}

class Point2
{
	double x, y;
	Point2(){}
	Point2(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	double getDistance()
	{
		return Math.sqrt(x*x + y*y);
	}
	double getDistance(Point2 other)
	{
		return Math.sqrt((x - other.x)*(x - other.x) + (y - other.y)*(y - other.y));
	}
}