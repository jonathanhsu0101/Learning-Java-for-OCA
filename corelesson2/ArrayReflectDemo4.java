package corelesson2;

import java.lang.reflect.Array;

public class ArrayReflectDemo4
{
	public static void main(String[] args)
	{
		test(new int[]{1,2,3});
		test("hello");
		test(new String[]{"hello","word"});
		printObject(new int[]{1,2,3});
		System.out.println("=============================");
		printObject(new String[][]{{"hello","world"},{"aaa","bbb"}});
	}
	public static void test(Object obj)
	{
		Class c = obj.getClass();
		//判斷對象是不是數組
		System.out.println(c.isArray());
	}
	/**
	 * 如果 object是非數組對象，直接打印 toString
	 * 如果 object是數組，打印數組中的每個元素
	 * @param object
	 */
	public static void printObject(Object object)
	{
		//判斷是否為數組
		Class c = object.getClass();
		if(c.isArray())
		{
			// 獲取數組長度
			int length = Array.getLength(object);
			for (int i = 0; i < length; i++)
			{
				//獲取數組中的每個元素
				Object obj = Array.get(object, i);
				// 數組的每個元素可能又是一個數組
				printObject(obj); // 要遞歸
			}
		}else
		{
			System.out.println(object);
		}
	}
}
