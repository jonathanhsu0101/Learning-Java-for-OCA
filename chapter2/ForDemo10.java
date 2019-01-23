/* for 循環的嵌套
 * 
 * 打印 100 到 1000 的所有素數
 * 
 *  思路：先要用循環代表 100 到 1000 之間的所有數字
 *  然後一個一個拿出來，判斷該數字是否是素數
 *  ---> for (int n = 100; n <= 2000; n++)
 *  但是大於2的偶數都不是素數 (因為大於2的偶數都能被2整除)
 *  ---->  for (int n = 101; n < 1000; n+=2)
 *  
 *  每5個素數換行
 */
package chapter2;

public class ForDemo10
{
	public static void main(String[] args)
	{
		int count = 0;
		for (int n = 101; n < 1000; n+=2)
		// n 其實代表 101 到 999
		{
			// 拿到 n，判斷是否為素數
			int i;
			for (i = 2; i <= n/2; i++)
			{
				if (n%i == 0) break;
			}
			if (i > n/2)  // 是素數就打印，否則就不做
			{
				count++;
				System.out.print(n+"   ");
				if (count % 5 == 0)
					System.out.println();
			}
		}
	}
}
