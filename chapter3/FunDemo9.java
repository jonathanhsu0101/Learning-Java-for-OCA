/*
 * 寫一個函數實現兩個變量的交換 (注意內存分配的問題)
 */
package chapter3;

public class FunDemo9
{
	public static void main(String[] args)
	{
		int c = 10, d = 20;
		swap(c, d);
		System.out.println("c="+c+" , d="+d);
		/*
		 * java使用內存時，直接把內存分為堆、棧
		 * 堆內存：通過垃圾回收器回收內存(以後會講)
		 * 棧內存：用完自動釋放，先進後出
		 */
		
		int a = 30, b = 40;
		swap(a, b);
		System.out.println("a="+a+" , b="+b);
	}
	
	//寫一個函數實現兩個變量的交換
	public static void swap(int a, int b) //相當於int a = c, int b = d;
	{
		int t = a;
		a = b;
		b = t;
	}
}
