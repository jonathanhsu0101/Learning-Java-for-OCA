// 求1!+2!+....+10!=?
package chapter2;

public class ForDemo6
{
	public static void main(String[] args)
	{
		long sum = 0;
		long t = 1;
		for (int i = 1; i <= 10; i++)
		{
			t *= i;
			// 循環第一次進入就是1的階乘
			//         第二次進入就是2的階乘
			//          ..........
			sum += t;
			// 累計階乘
		}
		System.out.println(sum);
	}
}
