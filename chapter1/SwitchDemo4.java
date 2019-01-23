package chapter1;
import java.util.Scanner;
/*
 * 請輸入成績(不判斷輸入是否異常)
 * 90以上優秀
 * 80以上良好
 * 70以上一般
 * 60以上及格
 * 0-60不及格
 */
public class SwitchDemo4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入考試成績");
		int score = s.nextInt();
		int n = score/10;
		switch (n)
		{
		// switch () 中的值只能是 byte, short, char, int 類型
		//                  將來還可以放枚舉類型
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("不及格");	break;
			case 6:
				System.out.println("及格"); break;
			case 7:
				System.out.println("一般"); break;
			case 8:
				System.out.println("良好"); break;
			case 9:
				System.out.println("優秀"); break;
			case 10:
				System.out.println("滿分"); break;
			default:
				System.out.println("輸入異常");
		}
	}
}
