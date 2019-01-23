// 打印1到100之間既能被3整除又能被5整除的數
// 並記錄有幾個
package chapter2;

public class ForDemo4
{
	public static void main(String[] args)
	{
		int count = 0;
		for (int i = 1; i <= 100; i++)
		{
			if (i % 3 == 0 && i%5 == 0)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("共計"+count+"個");
	}
}
