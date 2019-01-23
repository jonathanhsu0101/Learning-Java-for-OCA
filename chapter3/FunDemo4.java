/*案例：打印 100 到 1000 之間所有的素數
 * 				判斷一個數字是否為素數寫成函數
 * 
 * 返回值類型：1. 如果是就打印是素數，不是就打印不是素數 ---> void
 * 							2. 如果是得到 true，不是就得到 false ------> boolean
 * 
 * 函數名：isPrimeNumber
 * 
 * 函數的形式參數：一個任意整數，應該用一個變量代替
 * 
 * 函數的宣告：1. public static void isPrimeNumber(int n)
 */
package chapter3;

public class FunDemo4
{
	public static void main(String[] args)
	{
		for (int i = 100; i <= 1000; i++)
		{
			isPrimeNumber(i);
		}
	}
	
	public static void isPrimeNumber(int n)
	{
		int i;
		for (i = 2; i <= n/2; i++)
		{
			if (n%i == 0)
				break;
		}
		if (i > n/2)
		{
			System.out.println(n+" 是素數");
		}
		else
		{
			System.out.println(n+" 不是素數");
		}
	}
}
