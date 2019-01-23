/*			4.4 構造函數重載
 */
package chapter5;

public class ClassDemo9
{
	public static void main(String[] args)
	{
		Point2 p1 = new Point2(); //調用無參數的構造函數
		p1.showLocation();
		Point2 p2 = new Point2(6, 8); //調用兩個參數的構造函數
		p2.showLocation();
	}
}

class Point2
{
	double x, y;
	Point2 (double a, double b)
	{
		x = a;
		y = b;
	}
	Point2 () {}
	double getDistance()
	{
		return Math.sqrt(x*x + y*y);
	}
	void showLocation()
	{
		System.out.println(x+", "+y);
	}
}