package chapter1;
import java.util.Scanner;
// 輸入年月日，判斷這個日期在這一年當中已經過了多少天？
public class SwitchDemo2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入年");
		int y = s.nextInt();
		System.out.println("請輸入月");
		int m = s.nextInt();
		System.out.println("請輸入日");
		int d = s.nextInt();
		/*
		 * 假設輸入了1999年4月20日
		 * 只要1月2月3月天數總和再加上20天即可
		 * 思路：
		 *      switch(m-1)
		 *      {
		 *        .......
		 *      }
		 *      累計求和會定義一個變量放最終的和，從0開始
		 */
		int sum = 0;
		switch (m-1)
		{
			case 11: sum += 30;
			case 10: sum += 31;
			case 9: sum += 30;
			case 8: sum += 31;
			case 7: sum += 31;
			case 6: sum += 30;
			case 5: sum += 31;
			case 4: sum += 30;
			case 3: sum += 31;
			case 2: if (y%4==0 && y%100!=0 || y%400 ==0)
							sum += 29;
						else
							sum += 28;
			case 1: sum += 31;
		}
		sum += d;
		System.out.println(y+"年"+m+"月"+d+"日在這一年已經過的天數："+sum);
	}
}
