package lesson4;

public class Demo3
{
	public static void main(String[] args)
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a/b);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("數組下標越界了！");
		}
		catch (ArithmeticException e)
		{
			System.out.println("除數不能為0 !");
		}
		catch (Exception e)
		{
			System.out.println("其他異常");
		}
	}
}
