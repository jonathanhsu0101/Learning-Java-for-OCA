package lesson4;

public class Demo2
{
	public static void main(String[] args)
	{
		/*
		 * 如下代碼寫完之後，編譯能通過
		 * 說明異常類型是jvm能自動捕獲的
		 * 也可以自己捕獲
		 */
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
	}
}
