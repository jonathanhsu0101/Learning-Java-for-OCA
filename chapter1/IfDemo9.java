package chapter1;
import java.util.Scanner;
// 輸入一個數字，判斷是正數、負數、還是0

public class IfDemo9
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入數字");
		int number = s.nextInt();
		if (number > 0)
			System.out.println(number+"是正數");
		else if (number < 0)
			System.out.println(number+"是負數");
		else
			System.out.println("數字是0");
	}
}
