package corelesson2;

import java.lang.reflect.Method;

public class MethodReflectDemo3
{
	public static void main(String[] args)
	{
		User u = new User("zhangsan", 30);
		System.out.println(getValueByProperty("name", u));
		System.out.println(getValueByProperty("age", u));
	}
	/**
	 * 根據 javaBean 的屬性名獲取其屬性值
	 * @param propertyName屬性名
	 * @param object對象
	 * @return object 對象
	 */
	public static Object getValueByProperty(String propertyName, Object object)
	{
		/*
		 * 標準的 javaBean 都有 getter/setter 方法
		 *  根據屬性名獲取 get 方法
		 *   然後通過 get方法的反射操作即可
		 */
		// 1. 獲取類類型
		Class c = object.getClass();
		// 2. 獲取方法名稱
		String methodName = "get" + propertyName.substring(0, 1).toUpperCase()
				+ propertyName.substring(1);
		System.out.println(methodName);
		// 3. 獲取方法對象 ---> get方法無參
		try
		{
			Method m = c.getMethod(methodName, new Class[]{});
			// 4. 方法的反射操作
			Object value = m.invoke(object, new Object[]{});
			return value;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
