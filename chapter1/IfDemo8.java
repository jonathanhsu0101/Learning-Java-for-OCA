package chapter1;
import java.util.Scanner;

public class IfDemo8
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入考試成績");
		int score = s.nextInt();
		if (score > 100 || score < 0)
			System.out.println("成績輸入異常");
		else if (score >= 90)
			System.out.println("成績優秀");
		else if (score >=80)
			System.out.println("成績良好");
		else if (score >= 70)
			System.out.println("成績一般");
		else if (score >= 60)
			System.out.println("成績及格");
		else
			System.out.println("成績不及格");
	}
}