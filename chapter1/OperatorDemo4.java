package chapter1;

public class OperatorDemo4
{
	public static void main(String[] args)
	{
		int a = 10;
		boolean f1 = a > 10;
		boolean f2 = a >= 10;
		boolean f3 = a < 10;
		boolean f4 = a == 10;
		boolean f5 = a <= 10;
		boolean f6 = a != 10;
		System.out.println(f1+", "+f2);
		
		boolean f7 = a++ > 10;
		//a++表達式的值是10 ---> false
		System.out.println(f7);
		
		a = 10;
		boolean f8 = ++a > 10;
		//++a表達式的值是11 ---> true
		System.out.println(f8);
		
		a = 10;
		boolean f9 = a-- >= 10;
		//a--表達式的值是10 ---> true
		System.out.println(f9);
	}
}
