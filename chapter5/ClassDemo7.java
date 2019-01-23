/*				4.3.4 與函數的返回值類型無關
 *  			4.3.5 在函數調用時，會根據參數的類型和個數自動匹配
 * 						，決定調用哪個。
 * 						但是這種匹配未必是精確的，符合就近原則 (找最接近的去匹配
 * 						，如果沒有最接近的，就找能夠匹配得上的，這種能夠匹配得上
 * 						，不需要人為轉換)
 */
package chapter5;

public class ClassDemo7
{
	public static void main(String[] args)
	{
		// 先創建加法器類的對象
		Adder1 adder = new Adder1();
		System.out.println(adder.add(10, 10));
		System.out.println(adder.add(10.5, 20.3));
		System.out.println(adder.add(1, 2, 3));
		System.out.println("==============================");
		System.out.println(adder.add('a', 'b'));
	}
}

class Adder1
{
	// 把下面各種方法註釋看看效果
	public int add(char a, char b)
	{
		System.out.println("char....");
		return a+b;
	}
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
