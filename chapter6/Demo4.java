/*		1.2 子類和父類的初始化順序：
 * 				1 父類靜態初始化塊 ---> 子類靜態初始化塊
 * 					跟創建對象無關，只要用到類就會先加載其靜態屬性
 *					，並且只加載一次
 *				2 父類定義初始化塊 ---> 父類構造函數
 *				3 子類定義初始化塊 ---> 子類構造函數
 */
package chapter6;

public class Demo4
{
	public static void main(String[] args)
	{
		B b = new B();
		System.out.println("=============");
		B b1 = new B();
	}
}

class A
{
	static
	{
		System.out.println("aa..."); //靜態定義初始化塊
	}
	{
		System.out.println("bb...");//定義初始化塊
	}
	A()
	{
		System.out.println("cc...");//構造函數
	}
}

class B extends A
{
	static
	{
		System.out.println("dd...");
	}
	{
		System.out.println("ee...");
	}
	B()
	{
		System.out.println("ff...");
	}
}