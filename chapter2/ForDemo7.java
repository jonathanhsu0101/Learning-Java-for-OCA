/*
 *  輸入一個非1的正數，打印其所有因子，包含1不包含自己
 *  並對所有因子求和
 *  
 *  思路：
 *  要打印因子，就要獲取因子，因子就是能被該數整除的
 *  拿到數字就開始除，從1一直除到n-1如果沒有於數就是因子
 *  所以循環控制是 for (int i = 1; i<n; i++)
 *  但是一個數字除以大於自己一半的數(不包括自己)肯定有餘數
 *  所以循環次數可以減少 for (int i = 1; i<=n/2; i++) 
 */
package chapter2;
import java.util.Scanner;

public class ForDemo7
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入數字");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 1; i <=n/2; i++)
		{
			if (n%i ==0)  // 沒有餘數 --> 是因子
			{
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("因子的和是："+sum);
	}
}
