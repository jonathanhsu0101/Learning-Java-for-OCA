package chapter1;
// 請輸入年分，打印出該年是否為閏年
import java.util.Scanner;

public class IfDemo6
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入年分：");
		int year = s.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0)
			System.out.println(year+"年是閏年");
		else
			System.out.println(year+"年不是閏年");
	}
}
