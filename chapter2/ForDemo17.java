// for 嵌套的 break
package chapter2;

public class ForDemo17
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				if (j==3) break;  // 遇到 break 會跳出離它最近的 for 循環
				System.out.print(i+","+j+"     ");
			}
			System.out.println();
		}
	}
}
