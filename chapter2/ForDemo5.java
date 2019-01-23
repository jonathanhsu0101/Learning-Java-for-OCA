// 求 n的階乘 n!
package chapter2;
import java.util.Scanner;

public class ForDemo5
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入數字：");
		int n = s.nextInt();
		// n! = 1*2*3*.....*n     n! = (n-1)! * n
		
		long t = 1;
		for (int i = 1; i<=n; i++)
		{
			t *= i;  // t = t * i;
		}
		System.out.println(n+"的階乘是"+t);
	}
}
