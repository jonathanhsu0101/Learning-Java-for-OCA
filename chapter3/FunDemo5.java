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
 * 函數的宣告：2. public static boolean isPrimeNumber(int n)
 */
package chapter3;

public class FunDemo5
{
	public static void main(String[] args)
	{
		int count = 0;
		for (int i = 100; i <= 1000; i++)
		{
			//boolean flag = isPrimeNumber(i);
			//if (flag)
			if (isPrimeNumber(i))
			{
				System.out.print(i+"    ");
				count++;
				if (count % 10 ==0)
					System.out.println();
			}
		}
	}
	
	public static boolean isPrimeNumber(int n)
	{
		int i;
		for (i = 2; i <= n/2; i++)
		{
			if (n%i == 0)
				return false;
				// 遇到 return 關鍵字，函數結束 (for 循環也被結束)
		}
		return true;
	}
}
