package chapter1;

public class OperatorDemo3
{
	public static void main(String[] args)
	{
		int a = 15;
		int b = ++a + 2;
		System.out.println(b);
		System.out.println("====================================");
		
		// c--表達式的值是16
		// --c表達式的值是15
		// 但是c的值總要減1
		int c = 16;
		int d = c--;
		System.out.println("d="+d+" c="+c);
		int e = 16;
		int f = --e;
		System.out.println("f="+f+" e="+e);
		
		int x = 30;
		x = ++x;
		/*
		 * 1. ++x表達式的值是31
		 * 2. x要加1，所以x也是31
		 * 3. 然後再把++x的值賦給x (是31)
		 */
		System.out.println("x="+x);
		
		x = 30;
		x = x++;
		/*
		 * 1. x++表達式的值是30
		 * 2. x要加1，所以x也是31
		 * 3. 然後再把x++的值賦給x (是30)
		 */
		System.out.println("x="+x);
	}
}
