package corelesson1;

import java.util.Scanner;

public class RegexDemo3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String regex = "^[a-zA-Z]\\w{4,9}$";
		while(true)
		{
			System.out.println("請輸入用戶名，必須以字母開頭，可以是數字字母_ 長度5到10");
			String name = s.nextLine();
			if (name.matches(regex))
			{
				System.out.println(name);
				break;
			}
			System.out.println("用戶名不合法請重新輸入");
		}
	}
	//
}
