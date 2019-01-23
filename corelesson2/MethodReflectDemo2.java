package corelesson2;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodReflectDemo2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入命令：");
		String action = s.nextLine();
		UserService us = new UserService();
		/*if ("login".equals(action))
		{
			us.login();
		}
		else if ("update".equals(action))
		{
			us.update();
		}
		else if ("delete".equals(action))
		{
			us.delete();
		}*/
		
		/*
		 * 獲取的 action 字符串的內容就是方法名稱
		 * 我們可以直接通過方法名稱獲取方法對象
		 * 然後通過方法反射直接調用
		 */
		try
		{
			Class c = us.getClass();
			Method method = c.getMethod(action, new Class[]{});
			method.invoke(us, new Object[]{});
//			Method method = UserService.class.getMethod(action, null);
//			method.invoke(new UserService(), null);
		}
		catch (Exception e)
		{
		}
	}
	//
}

class UserService
{
	public void login()
	{
		System.out.println("login....");
	}
	public void update()
	{
		System.out.println("update.......");
	}
	public void delete()
	{
		System.out.println("delete......");
	}
}