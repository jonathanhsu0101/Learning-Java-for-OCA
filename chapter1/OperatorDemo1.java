package chapter1;

public class OperatorDemo1
{
	public static void main(String[] args)
	{
		int a = 10, b = 20;
		int c = a + b;
		
		System.out.println(10%3);
		//兩個整數相除只取整數部分，只有浮點數除法才會有小數
		System.out.println(10/3);
		
		//對一個三位數123求其中的數字和
		int n = 123;
		// 取個位
		int a1 = n % 10;
		// 取十位
		int a2 = n / 10 % 10;
		// 取百位
		int a3 = n /100;
		System.out.println(a1+a2+a3);
	}
}
