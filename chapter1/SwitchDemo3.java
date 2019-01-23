package chapter1;

public class SwitchDemo3
{
	public static void main(String[] args)
	{
		int a = 5;
		switch (a)
		{
			default:
				System.out.println("dd");
			case 1:
				System.out.println("aa");
			case 2:
				System.out.println("bb");
			case 3:
				System.out.println("cc");
		/*
		 *  switch 當中 default 最多只能出現一次
		 *  可以出現在和 case 並列的任意位置  (一般習慣是在最後)
		 */
		}
	}
}
