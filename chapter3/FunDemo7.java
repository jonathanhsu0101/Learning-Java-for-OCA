/*案例：打印 10 到 1000 之間，所有的可逆素數
 * 				可逆素數：該數字是素數，該數字倒置後仍然是素數
 * 			1. 判斷一個數字是否是素數  ----> 寫成函數
 * 			2. 把一個數倒置 ---->  寫成函數
 */
package chapter3;

public class FunDemo7
{
	public static void main(String[] args)
	{
		for (int i = 10; i <= 1000; i++)
		{
			int rn = reverseNumber(i); //得到 i 倒置後的數字
			if (isPrimeNumber(i) && isPrimeNumber(rn))
				System.out.println(i);
		}
	}
	
	public static int reverseNumber(int n)
	{
		int sum = 0;
		while (n!=0)
		{
			sum = sum*10 + n%10;
			n = n/10;
		}
		return sum;
	}

	public static boolean isPrimeNumber(int n)
	{
		for (int i = 2; i <= n/2; i++)
		{
			if (n%i == 0)
				return false;
		}
		return true;
	}
}
