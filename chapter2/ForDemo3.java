// 求1到100之間奇數的和
package chapter2;

public class ForDemo3
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 1; i <= 100; i++)
		{
			if (i%2 == 1)
			{
				sum += i;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i = 1; i <= 100; i+=2)
		{
			sum += i;
		}
		System.out.println(sum);
	}
}
