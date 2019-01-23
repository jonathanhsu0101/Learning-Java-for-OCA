/* 7. 靜態成員
 * 	7.1 靜態成員是屬於類的，不屬於對象
 * 	7.2	訪問時可用「類名.靜態屬性」直接訪問
 * 		，也可以用「對象.靜態屬性」訪問，後者不提倡
 */
package chapter5;

public class ClassDemo16
{
	public static void main(String[] args)
	{
		Person6 p1 = new Person6();
		Person6 p2 = new Person6();
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person6.diqiu);
		p1.diqiu = 2;
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person6.diqiu);
		Person6.diqiu = 10;
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person6.diqiu);
		
	}
}

class Person6
{
	int age;
	String name; //每個人都有自己的年齡、名字
	int h = 175; //每個人都有自己的身高，但是初始值都一樣
	// 表示地球 ---> 整數1代表地球
	// int diqiu = 1; //這樣代表每個人都有一個自己的地球，與現實不符
	static int diqiu = 1; //代表所有人共用一個地球
	// 靜態定義初始化
}