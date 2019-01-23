// for 嵌套的 break
package chapter2;

public class ForDemo18
{
	public static void main(String[] args)
	{
		outer: for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				if (j==3) break outer;  // 直接跳出 outer 的 for 循環
				System.out.print(i+","+j+"     ");
			}
			System.out.println();
		}
	}
}
