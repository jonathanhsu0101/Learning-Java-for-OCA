package corelesson3;

import java.util.HashMap;

public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("x", 10);
		hm.put("y", 20);
		hm.put("x", 30);
		System.out.println(hm);
		/*
		 * key相同，會覆蓋之前的value。key如何才能相同？ 
		 * 注意equals方法和hashCode方法的實現
		 */
		System.out.println("===============================");
		// 計算每個字符出現的次數
		String s = "abcdefghijkabchdieukkscsserdaaxayh";
		/*
		 * 思路；拿到每個字符，作為key放入HashMap中。如果map中不存在，
		 * 那麼 put(key, 1)。如果已經存在，那麼 put(key, value+1)
		 */
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			String str = s.substring(i, i + 1);
			if (hm1.containsKey(str)) {
				hm1.put(str, hm1.get(str) + 1);
			} else {
				hm1.put(str, 1);
			}
		}
		System.out.println(hm1);
	}
}
