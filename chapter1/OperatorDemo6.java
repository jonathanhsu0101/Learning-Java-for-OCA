package chapter1;

public class OperatorDemo6
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = a >= 10 ? a+1 : a-1;
		System.out.println(b);
		/*
		 * 表達式1  ?  表達式2  :  表達式3
		 * 表達式1必須是條件
		 */
	}
}
