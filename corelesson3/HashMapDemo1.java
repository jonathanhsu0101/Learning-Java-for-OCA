package corelesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] args) {
		User2 u1 = new User2("0001", "zhangsan", 20, "1234");
		User2 u2 = new User2("0002", "lisi", 21, "12345");
		User2 u3 = new User2("0003", "wangwu", 20, "123456");
		HashMap hm = new HashMap();
		hm.put(u1.getId(), u1);
		hm.put(u2.getId(), u2);
		hm.put(u3.getId(), u3);
		// size() = 鍵值對的個數
		System.out.println(hm.size());
		// 直接打印Map對象，會打印 key的toString = value的toString
		System.out.println(hm);
		// key、value 都是 Object ---> get(key)得到value
		// 要做強制類型轉換
		User2 user = (User2) hm.get("0001");
		System.out.println(user);
		// 是否包含某key
		System.out.println(hm.containsKey("0002"));
		System.out.println("==============================");
		/*
		 * 遍歷方式1  ：
		 * 利用 keyset() 把Map中所有的key都放入Set集合中，
		 * 然後遍歷Set集合，得到key，通過 get(key) 獲取value
		 */
		Set set = hm.keySet();
		for (Object object : set) { // 也可以用迭代器
			String key = (String) object;
			User2 u = (User2) hm.get(key);
			System.out.println(key + "=" + u);
		} 
		System.out.println("==============================");
		/*
		 * 遍歷方式2  ： 
		 * 放入HashMap集合中的key, value其實都會被
		 * 包裝成 Map.Entry 這個內部類的屬性。
		 * 有一個鍵值對就存在一個Map.Entry的實例對象，
		 * 通過 entrySet() 方法就可以把這些實例對象都放入Set集合中，
		 * 遍歷Set獲取每個對象。
		 */
		Set set1 = hm.entrySet();
		for (Object object : set1) {
			Map.Entry me = (Map.Entry) object;
			System.out.println(me.getKey() + "=" + me.getValue());
		}
	}
}
