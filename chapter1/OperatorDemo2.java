package chapter1;

public class OperatorDemo2
{
	public static void main(String[] args)
	{
		int a = 10;
		int c = a++;
		/*
		 * a++表達式的值是10
		 * ++a表達式的值是11
		 * a都做了a=a+1
		 */
		System.out.println("c="+c+" a="+a);
		 int d = ++a;
		 System.out.println("d="+d+" a="+a);
	}
}
