package corelesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		Product product1 = new Product("001", "我贏java課程", 10000);
		Product productx = new Product("001", "我贏java課程", 10000);
		Product product2 = new Product("002", "我贏android課程", 12000);
		Product product3 = new Product("003", "我贏ui課程", 9000);
		ArrayList list = new ArrayList(); // 可以容納任何對象
		// 添加元素
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(productx);
		// 查看有效元素個數
		System.out.println(list.size());
		// 直接打印集合對象，會打印容器中容納的每個對象的toString
		System.out.println(list);
		// 獲取某個元素，根據數據下標獲取 (一定要做強制類型轉換)
		Product product = (Product) list.get(0);
		System.out.println(product);
//		 System.out.println(list.get(8)); //8這個位置上沒有元素，會拋出數組下標越界異常
//		 list.add(5, product1); //數組下標越界，只能放在0,1,2,3等4個位置
//		 list.add(2, product1); //可以，相當於插入元素
		// list集合可以容納重複的元素
		System.out.println(list);
		System.out.println("================================");
		// 遍歷
		for (int i = 0; i < list.size(); i++) {
			Product pro = (Product) list.get(i);
			System.out.println(pro);
		}
		System.out.println("================================");
		/*
		 * 通過迭代器遍歷 如果有一個聚集，就應該提供 
		 * 訪問聚集中某個元素和遍歷所有元素的方式
		 * 並且不曝露集合的實現
		 * 
		 *  ---> 迭代器設計模式
		 *  ArrayList 類已經提供了迭代器
		 *  java.util.Iterator
		 */
		Iterator itor = list.iterator();
		while (itor.hasNext()) {
			Product pro = (Product) itor.next();
			System.out.println(pro);
		}
		System.out.println("================================");
		// for-each 遍歷
		for (Object object : list) {
			Product pro = (Product) object;
			System.out.println(pro);
		}
		System.out.println("================================");
		// 判斷某個元素是否包含在集合中
		System.out.println(list.contains(product1));// ---> true
		System.out.println(list.contains(productx));// ---> false
		/*
		 * 對象創建是兩個，但是實際應用中這兩個對象應該是同一個 
		 * 和實際應用有出入，如何解決-->看源碼 
		 * 
		 * list 集合中 contains 方法的實現是拿傳入的實參 
		 * 和集合中的元素進行 equals 比較來判斷是否包含
		 *
		 * Object類中equals方法比較的是兩個對象的地址 
		 * 而在實際應用中我們一般認為equals返回true
		 * 就是兩個相同的對象，所以實際應用中應該 
		 * 根據實際情況重寫equals方法
		 */
		System.out.println(product1.equals(productx));
		System.out.println("================================");
		// 移除元素
		System.out.println(list.remove(0)); // 返回的是被移除的對象
		list.remove(product2);
		System.out.println(list);
	}
}
