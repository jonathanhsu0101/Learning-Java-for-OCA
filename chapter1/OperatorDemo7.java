package chapter1;

public class OperatorDemo7
{
	public static void main(String[] args)
	{
		int a = 10;
		a += 20;  // 等於 a = a + 20
		System.out.println(a);
		a *= 10;  //  等於 a = a * 10
		System.out.println(a);
		a /= 10;  //  等於 a = a / 10
		System.out.println(a);
		a %= 10; // 等於 a = a % 10
		System.out.println(a);
		
		int b = 20;
		b += 5.5;  // 不等於 b = b + 5.5  ----> 等於 b = (int)(b + 5.5) 
		System.out.println(b);
		/*
		 * 有這樣的面試題目：
		 * short s1 = 1;
		 * 1. s1 = s1 + 1;
		 * 2. s1 += 1;
		 * 哪個對?  哪個錯?
		 * 
		 * 1默認是int，能自動轉換成 short
		 * s1 = s1 + 1中，1為int類型，s1為short類型，加起來結果為int
		 * int 賦值給 short s1 所以錯誤
		 * 
		 * 而 s1 += 1 ----> (short)(s1 + 1)
		 * short 賦值給 short s1 所以正確
		 */
		short s1 = 1;
		s1 = (short) (s1 + 1);
		s1 += 1;
	}
}
