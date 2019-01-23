// 通過鍵盤輸入三個數，分別打印它們的因子(不包含自己)

package chapter3;
import java.util.Scanner;

public class FunDemo1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("請輸入第一個數字：");
		int a = s.nextInt();
		for (int i = 1; i <= a/2; i++)
		{
			if (a%i == 0)
			{
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		
		System.out.print("請輸入第二個數字：");
		int b = s.nextInt();
		for (int i = 1; i <= b/2; i++)
		{
			if (b%i == 0)
			{
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		
		System.out.print("請輸入第三個數字：");
		int c = s.nextInt();
		for (int i = 1; i <= c/2; i++)
		{
			if (c%i == 0)
			{
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		/* 重複了三個過程，這三個過程都是打印一個數字的因子
		 * 把這個重複的過程提煉出來，每次用的時候，都重複利用這個過程，
		 * 只是這個過程中需要有個變量，代替現在的a, b, c，
		 * 將來就是代替任意的一個數字
		 * 那麼這個過程就是我們說的函數or方法
		 */
	}
}
