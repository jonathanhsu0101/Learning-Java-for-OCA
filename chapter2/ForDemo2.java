/*
 * 求1到100的和
 * 累計求和   變量存放最終的和
 * int sum = 0;
 * 第一次累計1，第二次累計2，........第一百次累計100
 * 總共累計100次
 */
package chapter2;

public class ForDemo2
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 1; i <= 100; i++)
		{
			sum += i;  // sum = sum + i;
		}
		System.out.println(sum);
		
		int sum1 = 0;
		for (int i = 100; i >=1; i--)
		{
			sum1 += i;
		}
		System.out.println(sum1);
	}
}
