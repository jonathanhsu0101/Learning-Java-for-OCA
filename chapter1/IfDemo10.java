package chapter1;

public class IfDemo10
{
	public static void main(String[] args)
	{
		int a = 10;
		if (a++ > 10); { // 條件體為空，{}中的語句跟if無關
		System.out.println("hello");}
		
		System.out.println("===========================================");
		if (a > 10)
			System.out.println("hello");
		else if (a > 5)
			System.out.println("bye-bye");
	}
}
