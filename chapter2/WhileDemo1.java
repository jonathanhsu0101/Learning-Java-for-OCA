// 求 1 到 100 的和
package chapter2;

public class WhileDemo1
{
	public static void main(String[] args)
	{
		int sum = 0;
		int i = 1;
		while (i <= 100)
		{
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
