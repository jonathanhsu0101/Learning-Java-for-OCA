/*   4.3  函數重載
 * 			4.3.1 同一個類中的一組函數
 * 			4.3.2 這組函數，函數名稱都相同
 * 			4.3.3 參數不同 (類型不同、個數不同、或是類型個數都不同)
 * 			4.3.4 在函數調用時，會根據參數的類型和個數自動匹配
 * 						，決定調用哪個。
 * 						但是這種匹配未必是精確的，符合就近原則 (找最接近的去匹配
 * 						，如果沒有最接近的，就找能夠匹配得上的，這種能夠匹配得上
 * 						，不需要人為轉換)
 */
package chapter5;

public class ClassDemo6
{
	public static void main(String[] args)
	{
		// 先創建加法器類的對象
		Adder adder = new Adder();
		System.out.println(adder.add(10, 10));
		System.out.println(adder.add(10.5, 20.3));
		System.out.println(adder.add(1, 2, 3));
	}
}

class Adder
{
	public int add(int a, int b)
	{
		System.out.println("add1....");
		return a+b;
	}
	public int add(int a, int b, int c)
	{
		System.out.println("三個參數.....");
		return a+b+c;
	}
	public double add(double a, double b)
	{
		System.out.println("double....");
		return a+b;
	}
}
