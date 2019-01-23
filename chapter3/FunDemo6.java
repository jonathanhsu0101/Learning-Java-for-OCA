/*案例：打印 10 到 1000 之間，各個位數相加為5的數字
 * 				要求：求一個數字的各個位數之和寫成函數
 * 
 * 返回值類型：int(各個位數之和)
 * 
 * 函數名：getSum
 * 
 * 函數的形式參數：一個任意整數，用一個變量代替
 * 
 * 函數的宣告： public static int getSum(int n)
 * 
 * 為什麼 n 叫做形式參數 (形參)？
 * 調用函數時，傳遞的具體值是實際參數 (實參)
 * 
 */
package chapter3;

public class FunDemo6
{
	public static void main(String[] args)
	{
		for (int i = 10; i <= 1000; i++)
		{
			if (getSum(i)==5)
				System.out.println(i);
		}
	}
	
	public static int getSum(int n)
	//函數有了非void的返回值類型，就必須通過 return 返回值，否則編譯不通過
	{
		int sum = 0;
		while (n!=0)
		{
			sum = sum + n%10;
			n = n/10;
		}
		return sum;
	}
}
