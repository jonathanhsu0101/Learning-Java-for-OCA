package chapter1;
// 通過鍵盤輸入三個數字，要求從小到大排序輸出這三個數字
import java.util.Scanner;

public class IfDemo4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入一個數字：");
		int a = s.nextInt();
		System.out.println("請輸入二個數字：");
		int b = s.nextInt();
		System.out.println("請輸入三個數字：");
		int c = s.nextInt();
		
		// 要求這三個數字從小到大排序輸出
		/*
		 *      思路：
		 *      假設a中放入最小的，c中放入最大的。
		 *      這樣最後我只要輸出a, b, c即可。
		 *      利用之前講的知識點   兩個數交換
		 *      
		 *      1. a中藥放入最小的，
		 *      首先拿a和b進行比較，如果a比b大，那麼交換
		 *      
		 *      2. 再拿a和c比，如果a比c大，那麼交換
		 *      
		 *      3. 只剩下b, c了，大的放入c，小的放入b
		 *      如果b>c則交換，如果b<c什麼都不用做
		 */
		
		if (a > b)
		{
			int t = a;
			a = b;
			b = t;
		}   // 已經完成了a, b中小的放入了a中
		if (a > c)
		{
			int t = a;
			a = c;
			c = t;
		}   // a, b, c中最小的已經放入了a中
		if (b > c)
		{
			int t = b;
			b = c;
			c = t;
		}   // b, c中大的放入了c中
		    // 那麼現在a, b, c正好是從小到大排序了
		System.out.println("三個數字從小到大排序為："+a+","+b+","+c);
	}
}
