package corelesson3;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		System.out.println(list);
//		 list.add(100); //錯
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("=============================");
		// 反射都是繞過編譯操作的
		// 驗證1：
		ArrayList list2 = new ArrayList();
		// 結果是true說明類類型是一樣的，那麼也就是編譯後是去泛型化的
		System.out.println(list.getClass() == list2.getClass());
		System.out.println(list.getClass() == ArrayList.class);
		System.out.println(ArrayList.class);
		/* 驗證2：用add方法的反射來進行操作 */
		System.out.println(list.size());
		try {
			Method method = list.getClass().getMethod("add",
					new Class[] { Object.class });
			method.invoke(list, new Object[] { 100 });
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list.size());
		System.out.println(list);
		// 現在for-each就會異常
		for (String str : list) {
			System.out.println(str);
		} // 平時沒有必要這樣做
	}
	//
}
