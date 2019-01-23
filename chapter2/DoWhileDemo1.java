/*    do while 循環
 *
 *    do
 *    {循環體} while (條件);
 *    循環體首先會執行一次
 */

// 求 1 到 100 的和
package chapter2;

public class DoWhileDemo1
{
	public static void main(String[] args)
	{
		int sum = 0, i = 1;
		do
		{
			sum += i;
			i++;
		}
		while (i <= 100);
		System.out.println(sum);
		
		/*
		 * 雙色球題目：6 顆藍球，1 顆紅球
		 * do
		 * {   取藍球  }
		 *  while (條件：判斷藍球是否已經取出，如果已取出則繼續循環，不能重複)
		 */
		
		int sum1 = 0, j = 1;
		do
		{
			sum1 = sum1 + j;
			j++;
			if (j>100) break;
		}
		while (true);
		System.out.println(sum1);
	}
}
