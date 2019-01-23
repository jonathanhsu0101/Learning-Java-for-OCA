/*  5. 內存分配
 * 			5.1 創建對象過程的內存分配問題
 * 					堆、棧、方法區 ---> 類的信息都存放於此
 * 			5.2 對象和引用
 */
package chapter5;

public class ClassDemo11
{
	public static void main(String[] args)
	{
		// 區分對象、引用
		Point3 p1 = new Point3(8, 8); // p1 引用了一個點的實例
		Point3 p2 = new Point3(10, 10);
		p2 = p1; // p2 指向(引用)了 p1 指向(引用)的實例對象
		System.out.println(p1.x);
		p2.x = 20; // p1和p2指向了同一個對象
		System.out.println(p1.x);
	}
}

class Point3
{
	double x, y;
	Point3 (double a, double b)
	{
		x = a;
		y = b;
	}
	Point3 () {}
	double getDistance()
	{
		return Math.sqrt(x*x + y*y);
	}
	void showLocation()
	{
		System.out.println(x+", "+y);
	}
}