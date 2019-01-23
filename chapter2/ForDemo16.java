// for(;;);    for 循環的特例

package chapter2;

public class ForDemo16
{
	public static void main(String[] args)
	{
		int i;
		for (i = 2; i <= 100; i++);
		System.out.println(i);  // 不是循環體
		System.out.println("=========================================");
		
		int sum = 0;
		int j = 1;  // 省略第1個表達式
		for (;;)   //  原本是 for (int j = 1; j <= 100; j++)
		{
			if (j > 100) break;  // 省略第2個表達式
			sum += j;
			j++;  // 省略第3個表達式
		}
		System.out.println(sum);
		System.out.println("=========================================");
		
		// 死循環
		for (;;)
		{
			System.out.println("hello");
		}
	}
}
