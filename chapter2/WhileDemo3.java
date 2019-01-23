// 輸入一個數字，將該數字倒置
// 輸入 1234 得到 4321
/*
 * 思路：1. 先 %10 得到 4
 * 				2. 如果除以 10 不等於 0 (前面有位數)
 * 				3.  4*10+3 ---> 43 (取現在的個位)  n = n/10 --> 12 (還不等於0)
 * 				4.  43*10+2 (取現在的個位)  n = n/10 --> 1  (還不等於0)
 * 				5.  432*10+1 (取現在的個位)  n = n/10 --> 0  (循環結束
 *  總結：求和，假設累計值是 sum (reverseNumber)
 *  			sum * 10 + 個位
 *  			n = n / 10
 */
package chapter2;
import java.util.Scanner;

public class WhileDemo3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int n = s.nextInt();
		int t = n;
		int reverseNumber = 0;
		while (n!=0)
		{
			reverseNumber = reverseNumber * 10 + n % 10;
			n = n / 10;
		}
		System.out.println(t+" 倒置後是："+reverseNumber);
	}
}
