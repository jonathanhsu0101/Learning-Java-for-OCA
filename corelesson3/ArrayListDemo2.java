package corelesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		Product product1 = new Product("001", "我贏java課程", 10000);
		Product product2 = new Product("002", "我贏android課程", 12000);
		Product product3 = new Product("003", "我贏ui課程", 9000);
		/*
		 * 泛型操作，表示products集合中只存放 Product 類型的實例 
		 * 優點：在編譯階段防止錯誤輸入
		 * 實際操作中不需要做強制類型轉換
		 */
		ArrayList<Product> products = new ArrayList<Product>();
		// products.add("hello"); 編譯不通過
		products.add(product1);
		products.add(product2);
		products.add(product3);
		// 遍歷
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}
		System.out.println("================================");
		// 迭代器遍歷
		Iterator<Product> itor = products.iterator();
		while (itor.hasNext()) {
			Product pro = itor.next();
			System.out.println(pro);
		}
		System.out.println("================================");
		// for-each 遍歷
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
