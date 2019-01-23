package lesson4;

public class Demo9
{
	public static void main(String[] args)
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			System.out.println(a);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e); // e.toString(); ---> 異常類型 + message
			e.printStackTrace(); // --> 異常類型 + message 
			// + 異常是在哪個類的哪個方法產生的，怎麼調用的
		}
	}
}
