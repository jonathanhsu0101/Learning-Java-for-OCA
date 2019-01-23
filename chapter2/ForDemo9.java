/*
 * 輸入一個數字，判斷該數字是否為素數
 *  (素數就是質數，只能被1和自己整除)
 *  
 *  思路：
 *  假設數字是n，拿到個數字就從2開始除，一直除到 n-1
 *  如果都有餘數，那就說明式素數，否則不是素數
 *  循環控制 for (int i = 2; i < n; i++)
 *  但是一個數字除以大於自己一半(不包含自己)的數肯定有餘數
 *  for (int i = 2; i <= n/2; i++)
 */

package chapter2;
import java.util.Scanner;

public class ForDemo9
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入一個數字：");
		int n = s.nextInt();
		int i;
		for (i = 2; i <= n/2; i++)
		{
			if (n%i == 0) break;
		}
		/*
		 * 我如何判斷是否為素數呢?
		 * 分析：上述循環有幾個可以結束循環的地方?
		 * 有兩個地方：1. i <= n/2 條件不成立時 --> 臨界點是 i = n/2 +1
		 * 							2. 遇到了 break
		 * 如果是條件1結束的循環 ---> 那麼說明是素數
		 * 如果是條件2結束的循環 ---> 那麼說明不是素數
		 * 如果是條件1結束  ---->  i > n/2 
		 * 如果是條件2結束  ---->  i < n/2+1
		 */
		if (i > n/2)
		{
			System.out.println(n+"是素數");
		}
		else
		{
			System.out.println(n+"不是素數");
		}
	}
}
