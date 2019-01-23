package corelesson2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.JButton;

public class ClassDemo3
{
	public static void main(String[] args)
	{
//		System.out.println(ClassDemo3.class.getClassLoader().getClass().getName());
		printClassMessage("hello");
	}
	public static void printClassMessage(Object obj)
	{
		/* 要獲取類的信息，先獲取其類類型
		 * 3種方式，根據現有條件選擇
		 */
		Class c = obj.getClass();
		//獲取類名
		System.out.println(c.getName());
		//獲取不包含包名的類名
		System.out.println(c.getSimpleName());
		/* 獲取類的方法 ---> 方法也是對象
		 * java.lang.reflect.Method 類的對象
		 * 
		 * getMethods() 獲取了所有public 方法
		 * 包括父類繼承的
		 * getDeclaredMethods() 得到自己聲明的方法，
		 * 不問訪問權限，繼承的得不到
		 */
//		Method[] ms = c.getMethods();
//		for (int i = 0; i < ms.length; i++)
//		{
//			//獲取方法的返回值類型的類類型
//			Class returnType = ms[i].getReturnType();
//			System.out.print(returnType.getName()+"   ");
//			System.out.print(ms[i].getName()+"(");
//			//獲取方法的參數列表的類類型
//			Class[] paramsType = ms[i].getParameterTypes();
//			for (int j = 0; j < paramsType.length; j++)
//			{
//				System.out.print(paramsType[j]+",  ");
//			}
//			System.out.println(")");
//		}
		System.out.println("==========================");
		/* 
		 * 成員變量也是對象 java.lang.reflect.Field
		 * getDeclaredFields() 獲取所有自己聲明的成員變量
		 * getFileds() 獲取所有public的成員變量
		 */
//		Field[] fs = c.getDeclaredFields();
//		for (Field field : fs)
//		{
//			//獲取成員變量的類類型
//			Class fieldType = field.getType();
//			System.out.println(fieldType.getName()+"  "+field.getName());
//		}

		System.out.println("==========================");
		/*
		 * 所有構造函數都是 java.lang.reflect.Constructor類的對象
		 * getDeclaredConstructors()
		 * getConstructors()
		 */
//		Constructor[] cs = c.getDeclaredConstructors();
//		for (Constructor constructor : cs)
//		{
//			System.out.print(constructor.getName()+"(");
//			//獲取構造函數的參數列表的類類型
//			Class[] paramsType = constructor.getParameterTypes();
//			for (Class class1 : paramsType)
//			{
//				System.out.print(class1.getName()+", ");
//			}
//			System.out.println(")");
//		}
		
		System.out.println("===============================");
		Package package1 = c.getPackage();
		System.out.println(package1.getName());
		System.out.println("===============================");
		System.out.println(c.isInterface());
	}
}
