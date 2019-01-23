/*
 * 案例：任意兩個整數求和寫成函數
 * 
 * 返回值類型：如果只要打印和，可以不用返回值，直接 void
 * 							如果希望得到和，然後作其他處理
 * 							，必須是通過函數能得到和，返回值是 int
 * 
 * 函數名稱：add
 * 
 * 形式參數：任意兩個整數的和，這兩個整數可以替換
 * 						，用兩個變量表示
 * 			public static int add(int a, int b)
 */
package chapter3;

public class FunDemo3
{
	public static void main(String[] args)
	{
		int a1 = add(10,5);
		int b1 = add(15,20);
		System.out.println(a1+","+b1);
	}
	
	public static int add(int a, int b)
	{
		int c = a + b;
		// 如果函數有具體的返回值類型 (非 void)
		// 則必須用 return 關鍵字返回
		return c;
	}
}
