/* 案例：初始化的時候，形參的變量名可以和成員一樣。
 * 				成員前面加上 this 來區分
 */
 package chapter5;

public class ClassDemo13
{
	public static void main(String[] args)
	{
		Person5 p1 = new Person5(30, 175, 100, "張三");
	}
}

class Person5
{
	int age; double h, w; String name;
	Person5(int age, double h, double w, String name)
	{
		//這種情況下 this 不能省略
		this.age = age;
		this.h = h;
		this.w = w;
		this.name = name;
	}
}
class Point5
{
	double x, y;
	// this 的一種用法，參數名可以和成員名一樣
	Point5 (double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	Point5 () {}
	double getDistance()
	{
		return Math.sqrt(x*x + y*y);
	}
	void showLocation()
	{
		System.out.println("點的座標("+x+", "+y+")");
	}
}