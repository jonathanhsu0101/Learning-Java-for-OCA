/* 1. 類
 *               案例
 *   人類：
 *   			相同的屬性 ---> 身高、體重、年齡
 *   			相似的行為 ---> 吃飯、走路、睡覺 ---> 不需要寫 public static 了
 *   通過封裝構成類：
 *   			class 類名 { 屬性、行為 }  -----> 這個過程稱為封裝
 *============================================
 * 2. 對象：
 * 				類的實例就是對象（創建一個實例 = 創建一個對象）
 * 
 *     如何創建對象：
 * 				就現在而言：
 * 										類名  對象(引用)名  = new 類名();
 *============================================
 * 3. 成員：有兩種
 *     			成員變量：類的屬性
 *     			成員函數(方法)：類的行為
 *     暫時而言：類中只能放成員，成員都是並列的，不分先後
 *     
 *     暫時而言：成員必須通過對象去訪問    用 . 運算符
 */
package chapter5;

public class ClassDemo1
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.h);
		System.out.println(p1.name);
		p1.h = 175;
		p1.w = 200;
		
		p2.h = 165;
		p2.w = 180;
		
		p1.eat();
		p2.walk();
	}
}

class Person
{
	double h, w;
	int age;
	String name;
	void eat()
	{
		System.out.println("eating...");
	}
	void walk()
	{
		System.out.println("walking...");
	}
	//System.out.println("helloworld"); ----> 是錯的  (不是成員)
}