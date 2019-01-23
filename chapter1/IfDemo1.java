package chapter1;
import  java.util.Scanner;

public class IfDemo1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入一個數字：");
		// 輸入之前最好給個提示語句
		int a = s.nextInt();
		// 光標在閃，等待你輸入數據
		// 通過鍵盤輸入一個整數並直接賦值給變量a
		// 按下return輸入結束
		System.out.println("輸入的數字是："+a);
	}
}
