/*  打漁還是曬網
 * 
 * 中國有句老話叫  "三天打漁，兩天曬網"
 * 假設有一個人從2000年1月1日開始， "三天打漁，兩天曬網"
 * 讀入三個整數，分別表示年、月、日
 * 問這三個整數所表示的那天，這個人在打漁還是在曬網？
 * 
 * 求一個日期和2000年1月1日相差多少天？
 * (假設輸入日期合法)
 * 相差0天  打漁
 * 			1		打漁
 * 			2		打漁
 * 			3		曬網
 * 			4		曬網
 * 			5		打漁
 * 			6		打漁
 * 			7		打漁
 * 			8		曬網
 * 			---------> 結論：相差的天數 subDays
 * 				% 5 等於0,1,2就是打漁，等於3,4就是曬網
 * 
 * 2001-1-1開始，假設算到2010-10-10相差的天數為
 * 2000年剩下的天數(365天)，01到09年的天數，10年已經過的天數
 * 需要注意，如果是同一年(輸入的日期已經過的天數-1即可)
 */
package chapter2;
import java.util.Scanner;

public class HomeWork
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入年：");
		int y = s.nextInt();
		System.out.println("請輸入月：");
		int m = s.nextInt();
		System.out.println("請輸入日：");
		int d = s.nextInt();
		int sum = 0;    // 紀錄相差的天數
		int sum1 = 0;  // 紀錄這個日期在這一年已經過了多少天？
		switch (m-1)
		{
			case 11: sum1 += 30;
			case 10: sum1 += 31;
			case 9: sum1 += 30;
			case 8: sum1 += 31;
			case 7: sum1 += 31;
			case 6: sum1 += 30;
			case 5: sum1 += 31;
			case 4: sum1 += 30;
			case 3: sum1 += 31;
			case 2: 	if (y%4==0 && y%100!=0 || y%400==0) 
								sum1 += 29;
							else 
								sum1 += 28;
			case 1: sum1 += 31;
		}
		sum1 += d;
		if (y == 2000)
		{
			sum = sum1 -1;
		}
		else if (y > 2000)
		{
			int sum2 = 365;  // 計算了2000年1月1日這一年還剩下多少天
			int sum3 = 0;       // 計算相差的年份的整天數，閏年366，非閏年365
			for (int i = 2001; i < y; i++)
			{
				if (i%4==0 && i%100!=0 || i%400==0)
				{
					sum3 += 366;
				}
				else
				{
					sum3 += 365;
				}
			}
			sum = sum1 + sum2 + sum3;
		}
		System.out.println(y+"年"+m+"月"+d+"日與2000年1月1日相差的天數是："+sum);
		if (sum%5==0 || sum%5==1 || sum%5==2)
		{
			System.out.println(y+"年"+m+"月"+d+"日在打漁");
		}
		else
		{
			System.out.println(y+"年"+m+"月"+d+"日在曬網");
		}
	}
}
