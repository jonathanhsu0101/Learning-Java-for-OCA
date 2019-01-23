/*			4.4 構造函數重載
 */
package chapter5;

public class ClassDemo8
{
	public static void main(String[] args)
	{
		Person2 p1 = new Person2(175, 180, "張三");  //自動調用構造函數
		Person2 p2 = new Person2();  // 創建使用默認值的對象
		Person2 p3 = new Person2(165, 175); // 調用帶兩個參數的構造函數
	}
}

class Person2
{
	double h, w;
	String name;
	Person2(double a, double b, String c)
	{
		h = a;
		w = b;
		name = c;
	}
	Person2(double a, double b)
	{
		System.out.println("調用兩個參數的構造函數");
		h = a;
		w = b;
	}
	Person2()
	{
		System.out.println("調用無參數的構造函數");
	}
	void eat()
	{
		System.out.println(name+" is eating...");
	}
	void walk()
	{
		System.out.println(name+" is walking...");
	}
}