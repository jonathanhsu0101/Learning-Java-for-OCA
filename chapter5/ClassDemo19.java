/*
  * 				7.4.2 靜態的成員方法只能訪問靜態的成員
  * 						但是非靜態成員方法可以訪問靜態成員
  * 						( 為什麼我們在學「面向對象」之前，函數都寫成static？
  * 							因為main函數本身是靜態的，只能訪問靜態成員)
 */
package chapter5;

public class ClassDemo19
{
	static  // 這裡稱為『靜態塊』
				// 有些東西很佔資源，又每次都要加載
				// ，就可以放在靜態塊裡面，它就只會加載一次
	{
		System.out.println("hello world");
		System.exit(0); //退出程序
	}
	//main函數本身就是靜態的成員函數
	public static void main(String[] args)
	{
		//靜態塊不一定是在創建對象的時候加載
		//，是在第一次用到類就加載，且只加載一次
		Person19.printData();
	}
}

class Person19
{
	//static int diqiu = 1;
	double h = 175;
	static int diqiu;
	static
	{
		diqiu = 1;
		System.out.println("static...");
	}
	static void printData()
	{
		System.out.println(diqiu);
		//System.out.println(h); ---> 錯誤
		//靜態成員方法只能訪問靜態成員
		//，不能訪問非靜態成員h
	}
}