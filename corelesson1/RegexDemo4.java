package corelesson1;

import java.util.Scanner;

public class RegexDemo4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		//該電話號碼必須1開頭後面是3 or 5 or 8後面9位
		String regex = "^1[358]\\d{9}";
		while(true)
		{
			System.out.println("請輸入手機號碼:");
			String t = s.nextLine();
			if (t.matches(regex))
			{
				System.out.println(t);
				break;
			}
			System.out.println("輸入錯誤請重新輸入");
		}
	}
	//
}
