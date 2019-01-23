package corelesson2;

import java.lang.reflect.Field;

public class FieldReflectDemo
{
	public static void main(String[] args)
	{
		User u = new User("zhangsan", 30);
		try
		{
			Class c = u.getClass();
			Field field = c.getDeclaredField("Name");
			field.setAccessible(true); //方法對象也有該函數
			//通過 Field對象直接獲取其屬性的值
			String name = (String)field.get(u);
			System.out.println(name);
			//修改其屬性
			field.set(u, name.toUpperCase());
			System.out.println(u.getName());
			name = (String)field.get(u);
			System.out.println(name);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	//
}
