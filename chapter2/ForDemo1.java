// 輸出10次 hello world
package chapter2;

public class ForDemo1
{
	public static void main(String[] args)
	{
		System.out.println("start");
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("hello world");
		}
		System.out.println("bye-bye");
		
		for (int i = 10; i <= 20; i++)
		{
			System.out.println("hello world");
		}
		System.out.println("=========================================");
		
		for (int i = 100; i > 90; i--)
		{
			System.out.println("hello world");
		}
	}
}
