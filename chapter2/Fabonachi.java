package chapter2;

public class Fabonachi
{
	public static void main(String[] args)
	{
		System.out.println("Fabonachi series are:");
		int Fn_2 =1, Fn_1 =1, Fn;
		System.out.println(Fn_2);
		System.out.println(Fn_1);
		for (int i = 3; i <= 40; i++)
		{
			Fn = Fn_1 + Fn_2;
			System.out.println(Fn);
			Fn_2 = Fn_1;
			Fn_1 = Fn;
		}
	}
}
