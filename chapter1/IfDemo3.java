package chapter1;
// 輸入三個數字，找出其中最大值
import java.util.Scanner;

public class IfDemo3
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
		/* 思路：定義一個變量專門存放最大值
		 * 假設任意一個就是max，然後和另外兩個比較
		 * 1. 現在假設 max = a
		 * 2. 那麼就要讓 max 先和 b 比較，
		 *      如果比 b 大，max 不變，
		 *      如果比 b 小，max 為 b，a, b 中大的放入了 max 中
		 * 3. 再拿 max 和 c 比
		 *      如果比 c 大，max 不變，
		 *      如果比 c 小，max 就為 c 的值
		*/
		int max = a;
		if (max < b)
		{
			max = b; // a, b 中大的放入了 max 中
		}
		if (max < c)
		{
			max = c; // a, b, c 中最大的放入了 max 中
		}
		System.out.println(a+","+b+","+c+"中最大值為："+max);
	}
}
