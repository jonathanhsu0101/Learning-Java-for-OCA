/*計算兩個日期之間相差的天數
 * 
 * 思路：假設要算 1998-10-10 與 2010-5-5 相差的天數
 * 首先計算 1998-10-10 在這一年中還剩下多少天
 * 其次計算 2010-5-5 在這一年中已經過了多少天
 * 然後計算 99年到 09年之間的整年天數
 * 
 *  1. 寫一個函數，計算某年是否是閏年
 *  		public static boolean isLeap(int y)
 *  
 *  2. 寫一個函數，計算一個日期在這一年已經過了多少天？
 *  		public static int getDays(int y, int m, int d)
 * 
 *  3. 寫一個函數，計算一個日期在這一年中還剩下多少天？
 *  		總天數 - 已經過去的天數 = 剩下的天數
 *  		public static int otherDays(int y, int m, int d)
 *  
 *  4. 寫一個函數，計算兩個日期之間相差的天數
 *  		public static int subDays(int y1, int m1, int d1, int y2, int m2, int d2)
 *  		一定是計算小的年已經剩下的，大的年已經過去的，中間年的整天數
 */
package chapter3;

public class FunDemo8
{
	public static void main(String[] args)
	{
		//System.out.print(getDays(2000, 4, 20));
		System.out.print(subDays(2001,3,10,1999,1,5));
		
	}
	
	// 計算某年是否是閏年
	public static boolean isLeap(int y)
	{
		if (y%4==0 && y%100!=0 || y%400==0)
			return true;
		else  //此 else 可以省略
			return false;
	}
	
	// 計算一個日期在這一年已經過了多少天？
	public static int getDays(int y, int m, int d)
	{
		int sum = d;
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
			case 2:
				if (isLeap(y))  // 一個函數調用另一個函數
										// 但是函數不能嵌套聲明
					sum += 29;
				else
					sum += 28;
			case 1: sum += 31;
		}
		return sum;
	}
	
	// 計算一個日期在這一年中還剩下多少天？
	public static int otherDays(int y, int m, int d)
	{
		if (isLeap(y))
			return 366 - getDays(y, m, d);
		else
			return 365 - getDays(y, m, d);
	}
	
	// 計算兩個日期之間相差的天數
	public static int subDays(int y1, int m1, int d1, int y2, int m2, int d2)
	{
		if (y1==y2)  // 只要計算y1年已經過的 - y2年已經過的，就是相差的 (可能是負數)
		{
			int days1 = getDays(y1, m1, d1) - getDays(y2, m2, d2);
			return abs(days1);
		}
		else if (y1 < y2)
		{
			// 小的年剩下的 + 大的年已過的 + 中間年
			int sum1 = otherDays(y1,m1,d1);
			int sum2 = getDays(y2,m2,d2);
			int sum3 = 0;
			for (int i = y1 + 1; i < y2; i++)
			{
				if (isLeap(i))
					sum3 += 366;
				else
					sum3 += 365;
			}
			return sum1+sum2+sum3;
		}
		else
		{
			// y1 > y2
			int sum1 = getDays(y1,m1,d1);
			int sum2 = otherDays(y2,m2,d2);
			int sum3 = 0;
			for (int i = y2 + 1; i < y1; i++)
			{
				if (isLeap(i))
					sum3 += 366;
				else
					sum3 += 365;
			}
			return sum1+sum2+sum3;
		}
	}
	
	public static int abs(int n)
	{
		return n >= 0 ? n : -n;
	}
}
