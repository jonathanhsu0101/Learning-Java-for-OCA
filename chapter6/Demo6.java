/*	
 * 				1.3.2 訪問權限必須不是private，子類可以放大 (後續講解)
 * 				1.3.3 『super.方法』調用父類被重寫前的方法 (如果不重寫，直接調用即可)
 *  總結：
 *  			super關鍵字
 *  			super(參數列表)  ----> 調用父類的構造函數
 *  														(必須在子類構造函數的第一句)
 *  			super.函數  ----> 從子類重寫父類的方法中，調用父類重寫前的方法
 */
package chapter6;

public class Demo6
{
	public static void main(String[] args)
	{
		Circle6 c = new Circle6(5,5,10);
		c.printLocation();
	}
}

class Shape6
{
	Point6 location;
	Shape6(){}
	Shape6(Point6 location)
	{
		this.location = location;
	}
	Shape6(double x, double y)
	{
		this(new Point6(x, y));
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

class Rectangle6 extends Shape6
{
	double w, h;
	Rectangle6(Point6 location, double w, double h)
	{
		super(location);
		this.w = w;
		this.h = h;
	}
	Rectangle6(double x, double y, double w, double h)
	{
		this(new Point6(x, y), w, h);
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

class Circle6 extends Shape6
{
	double r;
	Circle6(Point6 location, double r)
	{
		super(location);
		this.r = r;
	}
	Circle6(double x, double y, double r)
	{
		this(new Point6(x, y), r);
	}
	double getArea()
	{
		return 3.14 * r * r;
	}
	double getLength()
	{
		return 3.14 * r * 2;
	}
	/*void printLocation()
	{
		System.out.println("我的位置是："+location.x+", "+location.y+"  半徑是："+r);
	}*/
	void printLocation()
	{
		super.printLocation();
		System.out.println("半徑是："+r);
	}
}

class Point6
{
	double x, y;
	Point6(){}
	Point6(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	double getDistance()
	{
		return Math.sqrt(x*x + y*y);
	}
	double getDistance(Point6 other)
	{
		return Math.sqrt((x - other.x)*(x - other.x) + (y - other.y)*(y - other.y));
	}
}