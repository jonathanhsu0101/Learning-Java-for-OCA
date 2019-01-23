package corelesson2;

import java.lang.reflect.Method;

public class ArrayReflectDemo3
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3};
		Integer[] b = {1,2,3,4};
		Object o1 = a; // OK
//		Object[] o2 = a; // 錯誤
		Object o2 = b; // 把數組當作一個對象
		Object[] o3 = b; // 把數組裡面的每個 Integer當作對象
		String[][] ss = {{"aa","bb"},{"cc","dd"}};
		Object o4 = ss; // 把整個二維數組看成一個對象
		Object[] o5 = ss; // 把其中每個一維數組當作一個對象
		Object[][] o6 = ss; // OK, 把其中的每個字符串當作一個對象
		System.out.println("================================");
		MainTest.main(new String[]{"hello","world"});
		Object[] o = new String[]{"hello","world"};
		Object oo = new String[]{"hello","world"};
		//通過 main方法的反射來操作
		try
		{
			Method m = MainTest.class.getMethod("main", new Class[]{String[].class});
			m.invoke(null, new Object[]{new String[]{"hello","world"}});
//			m.invoke(null, new String[]{"hello","world"}); // 錯誤
//			該調用中默認為 Object 類型的一維數組
			m.invoke(null,  oo);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	//
}
class MainTest
{
	public static void main(String[] args)
	{
		for (String string : args)
		{
			System.out.println(string);
		}
	}
}