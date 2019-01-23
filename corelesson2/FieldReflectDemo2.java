package corelesson2;

import java.lang.reflect.Field;

public class FieldReflectDemo2
{
	public static void main(String[] args)
	{
		User u = new User("zhangsan", 30);
//		changeValue(u);
//		System.out.println(u.getName()+", "+u.getAge());
		System.out.println(getSql(u));
	}
	/**
	 * 得到 insert into 類名(屬性1，屬性2...) values (?,?...)
	 * @param obj
	 * @return
	 */
	public static String getSql(Object obj)
	{
		/*
		 * 獲取類的信息
		 * 類名和屬性名
		 * 然後做拼接
		 */
		StringBuilder s = new StringBuilder();
		s.append("insert into ");
		Class c = obj.getClass();
		String className = c.getSimpleName();
		s.append(className).append("(");
		Field[] fs = c.getDeclaredFields();
//		for (int i = 0; i < fs.length; i++)
//		{
//			s = i == 0 ? s.append(fs[i].getName()) : s.append(",").append(fs[i].getName());
//		}
//		s.append(")values").append(getString(fs.length));
		for (Field field : fs)
		{
			s.append(field.getName()).append(",");
		}
		s.deleteCharAt(s.length()-1);
		s.append(")values").append(getString(fs.length));
		return s.toString();
	}
	private static String getString(int length)
	{
		StringBuilder s = new StringBuilder();
		s.append("(");
		for (int i = 0; i < length; i++)
		{
			s = i == 0 ? s.append("?") : s.append(",?");
		}
		return s.append(")").toString();
	}
	/**
	 * 修改對象的屬性值
	 * 字符串屬性值全部變成大寫
	 * int類型的屬性值，全部加上100
	 * @param object
	 */
	public static void changeValue(Object object)
	{
		/*
		 * object對象有哪些屬性並不清楚
		 * 所以我們需要遍歷其所有屬性
		 * 找出屬性 String類型的 int 類型的屬性
		 * 找到屬性之後通過成員變量的反射操作
		 */
		// 1. 獲取類類型
		Class c = object.getClass();
		// 2. 獲取所有屬性
		Field[] fs = c.getDeclaredFields();
		// 3. 遍歷所有的屬性
		for (Field field : fs)
		{
			// 4. 得到屬性的類型
			Class fieldType = field.getType();
			// 5. 判斷
			/*if (fieldType.getSimpleName().equals("String"))
			{	}
			if (fieldType.getSimpleName().equals("int"))
			{	}*/
			try
			{
				if (fieldType == String.class)
				{
					// 6. 成員變量反射的操作
					field.setAccessible(true);
					String oldValue = (String)field.get(object);
					field.set(object, oldValue.toUpperCase());
				}
				if (fieldType == int.class)
				{
					field.setAccessible(true);
					int oldValue = (Integer)field.get(object);
					field.set(object, oldValue+100);
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
