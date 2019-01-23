package lesson4;

public class Demo1
{
	public static void main(String[] args)
	{
		/*
		 * 下一行代碼有可能產生異常
		 * 既然沒報錯，說明能通過編譯
		 * 說明下面的異常，其實jvm可以自動處理
		 * 當然也可以自己處理 ---> 可以更友好的提示
		 */
		try
		{
			/*
			 * 一旦出現異常，就會產生一個異常對象
			 */
			System.out.println(args[0]);
			//可能會產生異常的代碼
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("數組下標越界");
		}
		
		//FileInputStream in = new FileInputStream("aa.txt");
		//此代碼必須自己處理，否則編譯不通過
	}
}
