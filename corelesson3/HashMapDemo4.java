package corelesson3;

import java.util.HashMap;
import java.util.TreeSet;

public class HashMapDemo4 {
	public static void main(String[] args) {
		/*
		 * 對如下字符串進行計數，看出現的次數，輸出時要求按照次數降序排序，
		 * 如果次數相同 按照字母升序排序
		 * 
		 * 思路；通過HashMap集合可以實現計數的操作 。
		 * 如果要進行排序，我們可以採用TreeSet集合，
		 * 並且是根據放入TreeSet中的對象的屬性進行排序 ，
		 * 我們可抽取出一個類，來完成這個工作
		 */
		String s = "abcdefghijkabchdieukkscsserdaaxayh";
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
		System.out.println("============================");
		/*
		 * 遍歷 HashMap 集合，然後把每一個 key / value 都
		 * 包裝成 T 對象的實例放入 TreeSet 集合，就完成排序
		 */
		TreeSet<T> ts = new TreeSet<T>();
		for (String key : hm1.keySet()) {
			T t = new T(key, hm1.get(key));
			ts.add(t);
		}
		System.out.println(ts);
		System.out.println("============================");
		for (T t : ts) {
			System.out.println(t);
		}
	}
}

class T implements Comparable<T> {
	private String name;
	private int count;
	public T(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return name + "出現的次數是；" + count;
	}
	@Override
	public int compareTo(T o) {
		if (this.count != o.count)
			return o.count - this.count;
		return this.name.compareTo(o.name);
	}
}