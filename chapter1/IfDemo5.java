package chapter1;
// 輸入年齡，60以上免費 (包含60) 否則需要花錢買票
import java.util.Scanner;

public class IfDemo5
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("請輸入年齡：");
		int age = s.nextInt();
		if (age < 60)
		{
			System.out.println("請自覺買票");
		}
		else
		{
			System.out.println("不需要買票，直接進入！");
		}
	}
}
