/*			2.4 classpath 環境變量
 * 					尋找類的路徑，默認是 . 代表當前路徑
 * 					設置多個路徑的時候，中間用 ; 隔開
 * 
 * 					一般情況成員變量 private 函數 public
 * 
 * 			2.5 構造函數 private 如何創建對象
 */
package chapter6;

public class Demo14
{
	public static void main(String[] args)
	{
		//A14.accessA14();
		A14 a = A14.getInstance();
		a.print();
	}
}

class A14
{
	private A14(){}
	/*public static void accessA14()
	{
		A14 a = new A14();
		a.print();
	}*/
	public static A14 getInstance()
	{
		return new A14();
	}
	public void print(){System.out.println("a.....");}
}