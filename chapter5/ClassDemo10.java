/*			4.5 定義初始化
 * 					4.5.1 給成員變量直接賦值，就是定義初始化
 * 								什麼時候用呢，當該類的所有對象的某個屬性值都一樣的時候
 * 
 * 					4.5.2 順序，也就是創建對象的時候，構造函數、定義初始化都被執行
 * 								誰先，誰後？
 * 								4.5.2.1 定義初始化塊
 * 								4.5.2.2 定義初始化塊先執行，然後再執行構造函數，如果有
 * 												多個定義初始化，那麼這些定義初始化，從上到下依次執行
 * 												，都在構造函數之前
 */
package chapter5;

public class ClassDemo10
{
	public static void main(String[] args)
	{
		Person3 p1 = new Person3(175, "張三");
		Person3 p2 = new Person3(185, "李四");
		p1.print();
		p2.print();
	}
}

class Person3
{
	// double h = 175;  //定義初始化的一般寫法
	int age = 30;
	double h;
	{
		System.out.println("aa.....");
		h = 175; // 定義初始化塊，平時不必這樣寫
	}
	double w;
	String name;
	Person3 (double a, String c)
	{
		w = a;
		name = c;
		System.out.println("bb....");
	}
	void print()
	{
		System.out.println(name+", 身高"+h+", 體重"+w);
	}
}