/*  函數的遞歸
 * 
 * 寫一個函數計算 n!
 */
package chapter3;

public class FunDemo10
{
	public static void main(String[] args)
	{
		System.out.println(jiecheng(5));
		System.out.println(jiecheng1(5));
	}
	
	public static long jiecheng(int n)
	{
		int t = 1;
		for (int i = 1; i <= n; i++)
		{
			t *= i;
		}
		return t;
	}

	// 階乘定義：n! = (n-1)! * n
	public static long jiecheng1(int n)
	{
		if (n == 1)
			return 1;
		else
			return jiecheng1(n-1) * n;
			// 遞歸就是自己調用自己
			// 利用棧先進後出的原理
	}
}
