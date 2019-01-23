/*  吃包子
 * 
 * continue 是結束本次循環，進行下一次循環 (去第三個表達式)
 * break 是結束循環，直接跳出 for 循環，繼續下面的語句
 */
package chapter2;

public class ForDemo8
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			if (i == 5)
			{
				System.out.println("第"+i+"個包子掉地上了");
				continue;  // 結束本次循環，進行下一次循環 (去第三個表達式)
			}
			if (i == 8)
			{
				System.out.println("第"+i+"個包子又掉地上了");
				break;  // 心情不好，都不想吃了  --->  跳出循環
			}
			System.out.println("我在吃第"+i+"個包子");
		}
		System.out.println("吃完早飯了!");
	}
}
