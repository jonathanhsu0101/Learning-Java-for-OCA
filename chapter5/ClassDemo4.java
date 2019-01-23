/* 4. 初始化 (給成員變量賦值)
 * 		4.1 成員變量有默認值
 * 		4.2 構造函數 ----> 對象創建成功之後就有初始值
 * 				4.2.1 是一個成員函數，該函數名稱與類名相同
 * 				4.2.2 無任何返回類型，連 void 都沒有
 * 				4.2.3 創建對象的時候會自動調用構造函數，不必人工調用
 * 							，並且創建一個對象就會調用一次構造函數
 * 				4.2.4 就現階段而言，構造函數的主要作用是給成員賦初始值
 * 				4.2.5 如果一個類沒有構造函數，那麼 jvm 會給
 * 							類自動添加一個無參數的構造函數，稱為默認構造函數
 * 							如下：
 * 									public 類名 () {}
 * 							一旦，人為的給了類構造函數，那麼這個默認的構造函數
 * 							就不存在了
 */
package chapter5;

public class ClassDemo4
{
	public static void main(String[] args)
	{
		Person1 p1 = new Person1(175, 180, "張三");  //自動調用構造函數
		System.out.println(p1.name+", "+p1.h+", "+p1.w);
		p1.eat();
		p1.walk();
		System.out.println("==========================");
		Person1 p2 = new Person1(170, 176, "李四");  //自動調用構造函數
		System.out.println(p2.name+", "+p2.h+", "+p2.w);
		p2.eat();
		p2.walk();
	}
}

class Person1
{
	double h, w;
	String name;
	Person1(double a, double b, String c)
	{
		System.out.println("構造函數被調用....");
		h = a;
		w = b;
		name = c;
	}
	// 成員函數可以訪問其他成員
	void eat()
	{
		System.out.println(name+" is eating...");
	}
	void walk()
	{
		System.out.println(name+" is walking...");
	}
}