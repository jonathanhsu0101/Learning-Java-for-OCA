package corelesson2;

import java.lang.reflect.Method;

public class MethodReflectDemo
{
	public static void main(String[] args)
	{
		/* 獲取方法對象 (某一個方法)
		 * 獲取一個方法應該由方法名稱和參數列表來決定
		 * getMethod(方法名稱，參數的類類型)
		 */
		MethodTest mt = new MethodTest();
		Class c = mt.getClass();
		try
		{
			Method method = c.getMethod("f", new Class[]{int.class, int.class});
			mt.f(10, 10); // mt調用其 f方法
			System.out.println("==============================");
			/* 能不能直接通過 method對象直接調用方法，效果等於 mt.f(10, 10)？
			 * 這就是方法反射
			 * method.invoke(操作的對象，參數)
			 */
			method.invoke(mt, new Object[]{10,10}); //等於 mt.f(10,10)
			
			System.out.println("===============================");
			Method method2 = c.getMethod("f", new Class[]{int.class, int.class, int.class});
			System.out.println(mt.f(10, 10, 10));
			int result = (Integer)method2.invoke(mt, new Object[]{10,10,10});
			System.out.println(result);
			
			System.out.println("=============================");
			String s1 = "hello";
			String s2 = "world";
			System.out.println(s1.concat(s2));
			/*
			 * 用 concat方法的反射來操作
			 * 首先獲取String類類型
			 */
			Class c1 = s1.getClass(); //or String.class; or s2.getClass();
			//獲取 concat 方法
			Method concatMethod = c1.getMethod("concat", new Class[]{String.class});
			String ss = (String)concatMethod.invoke(s1, new Object[]{s2});
			System.out.println(ss);
//			Method method3 = String.class.getMethod("concat", new Class[]{String.class});
//			System.out.println(method3.invoke(s1, new Object[]{s2}));
			System.out.println("==================================");
			Method fmethod = c.getMethod("f", new Class[]{});
			fmethod.invoke(mt, new Object[]{});
			Method method4 = MethodTest.class.getMethod("f", null);
			method4.invoke(mt, null);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	//
}

class MethodTest
{
	public void f()
	{
		System.out.println("hello  world");
	}
	public void f(int a, int b)
	{
		System.out.println(a+b);
	}
	public int f(int a, int b, int c)
	{
		System.out.println("三個數字相加");
		return a+b+c;
	}
}