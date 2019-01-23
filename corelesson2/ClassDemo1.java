package corelesson2;

public class ClassDemo1
{
	public static void main(String[] args)
	{
		A a1 = new A();
		/*
		 * 表示了A類的類類型 ---> A類本身也是一個對象
		 * 分析一下：也可以認為是字節碼(自己理解的)
		 */
		Class c1 = A.class; //任何一個類都有一個隱含的靜態的成員變量class
		Class c2 = a1.getClass();
		/*
		 * c1  c2  都表示了一個對象，這個對象代表A這個類
		 * 
		 * 一個類就是class類的一個對象
		 * 我們把這個對象稱為類的類類型，也稱為類的字節碼
		 * 不管是 c1  c2 都代表了A類的類類型
		 */
		System.out.println(c1 == c2);
		Class c3 = null;
		try
		{
			/*這種表示方式也代表了動態加載類
			 * 動態加載類是指在運行中加載類
			 * 而非編譯中加載
			 */
			c3 = Class.forName("corelesson2.A");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println(c2 == c3);
		
		/*
		 * 我們能不能通過類類型，直接獲取類的對象？
		 * 通過 c1  c2  c3 直接獲取A類的對象？
		 * 
		 */
		try
		{
			//會調用無參的構造方法來產生對象
			//返回 Object 需要做強制類型轉換
			A aa = (A)c1.newInstance();
			aa.test();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("========================");
		test("hello");
		System.out.println("=========================");
		//String 類的類類型如何表示？
		Class cc1 = String.class;
		Class cc2 = "hello".getClass();
		Class cc3 = null;
		try
		{
			cc3 = Class.forName("java.lang.String");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println(cc1 == cc2);
		System.out.println(cc2 == cc3);
	}
	public static void test(Object obj)
	{
		//傳遞的是哪個子類的對象獲取的，就是其子類的類類型
		Class c = obj.getClass();
		//獲取類名
		System.out.println(c.getName());
	}
}

class A
{
	void test()
	{
		System.out.println("hello");
	}
}