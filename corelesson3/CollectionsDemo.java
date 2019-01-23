package corelesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("dd");
		list.add("ee");
		list.add("bb");
		list.add("cc");
		System.out.println(list);
		// 倒置
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("============================");
		// 排序
		Collections.sort(list);
		System.out.println(list);
		System.out.println("============================");
		// 倒置排序
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(list);
		System.out.println("=============================");
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(1000);
		list2.add(30);
		System.out.println(Collections.max(list2));
	}
}
