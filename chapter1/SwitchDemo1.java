package chapter1;
import java.util.Scanner;

public class SwitchDemo1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入一個數字：");
		int n = s.nextInt();
		switch (n)
		{
			case 0:
				System.out.println("星期日");	break;
			case 1:
				System.out.println("星期一");	break;
			case 2:
				System.out.println("星期二");	break;
			case 3:
				System.out.println("星期三");	break;
			case 4:
				System.out.println("星期四");	break;
			case 5:
				System.out.println("星期五");	break;
			case 6:
				System.out.println("星期六");	break;
			default:
				System.out.println("輸入有誤");	break;
		}
		System.out.println("bye-bye");
	}
}
