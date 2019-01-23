package chapter1;

public class OperatorDemo5
{
	public static void main(String[] args)
	{
		int a = 10, b = 20;
		boolean f1 = a >= 5 && a <= 20;

		f1 = a++ > 10 && b-- < 10;
		 /* 計算第一個表達式
		 * a++>10條件成立嗎?   不成立  --> 第一個表達式為false，a變成11
		 * 第二個表達式不計算(短路)  --> b還是20      f1為false    */
		System.out.println(f1+" ,a="+a+" ,b="+b);
		
		a = 10;	b = 20;
		boolean f2 = a++ >= 10 && b-- < 10;
		 /* 計算第一個表達式
		 * a++>=10條件成立嗎?   成立  --> 第一個表達式為true，a變成11
		 * 第二個表達式為false --> b變成19      f2為false      */
		System.out.println(f2+" ,a="+a+" ,b="+b);
		
		int c = 20, d = 30;
		boolean f3 = c++ >= 20 || d-- >= 10;
		 /* 計算第一個表達式
		 * c++>=20條件成立嗎?   成立  --> 第一個表達式為true，c變成21
		 * 第二個表達式不計算(短路)  --> d還是30     f3為true   */
		System.out.println(f3+" ,c="+c+" ,d="+d);
		
		c = 20;   d = 30;
		boolean f4 = c++ > 20 || d-- >= 10;
		 /* 計算第一個表達式
		 * c++>20條件成立嗎?   不成立  --> 第一個表達式為false，c變成21
		 * 第二個表達式為true  --> d變成29     f4為true    */
		System.out.println(f4+" ,c="+c+" ,d="+d);

		c = 20;   d = 30;
		boolean f5 = ++c > 20 || d-- >= 10;
		 /* 計算第一個表達式
		 * ++c>20條件成立嗎?   成立  --> 第一個表達式為true，c變成21
		 * 第二個表達式不計算(短路)  --> d還是30     f5為true   */
		System.out.println(f5+" ,c="+c+" ,d="+d);
		System.out.println(!f5);     // !f5 為 false
	}
}
