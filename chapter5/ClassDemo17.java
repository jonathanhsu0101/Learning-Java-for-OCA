/*	7.3 靜態成員變量，在用到類的時候就會完成初始化加載
 * 		（在 ClassDemo18驗證）
 */
package chapter5;

public class ClassDemo17
{
	public static void main(String[] args)
	{
		//先靜態初始化塊、然後定義初始化塊，最後是構造函數
		Person7 p = new Person7(20, "aa");
		//靜態初始化塊屬於類，只有一份，只需加載一次
		Person7 p1 = new Person7(11, "bb");
		//既然靜態的東西屬於類，那麼是在創建對象的時候加載的嗎？
		//不是，是用到類就加載，且只加載一次，上面的情況是創建對象
		//，第一次創建對象會用到類，所以加載
	}
}

class Person7
{
	int age;
	String name;
	int h;
	{
		h = 175;
		System.out.println("aa...");
	}
	static int diqiu;
	static  //靜態初始化塊（平時不必這樣寫）
	{
		diqiu = 1;
		System.out.println("bb...");
	}
	Person7(int age, String name)
	{
		this.age = age;
		this.name = name;
		System.out.println("cc...");
	}
}