// while 特殊結構
package chapter2;

public class WhileDemo4
{
	public static void main(String[] args)
	{
		int sum = 0;
		int i = 1;
		while (true)  // 等於 for (;;)
		{
			sum = sum + i;
			i++;
			if (i > 100) break;  // 跳出 while 迴圈
		}
		System.out.println(sum);
		
		/* 
		while (true)  // 無限循環
		{
			System.out.println("hello");
		}
		*/
		i = 1;
		while (i++ > 100);  // 空循環體，和後面無關
		System.out.println("hello");
	}
}
