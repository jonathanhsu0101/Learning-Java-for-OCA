package chapter1;

public class OperatorDemo9
{
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println(a>>2);
		System.out.println(Integer.toBinaryString(a>>2));
		// 轉換成2進制，往右挪動2位，前面補0，最後2位抹去
		// 右移一位相當於除以2
		
		int b = -10;
		System.out.println(b>>2);
		System.out.println(Integer.toBinaryString(b>>2));
		// 轉換成2進制，往右挪動2位，前面補1，最後2位抹去
		/*
		 * 推理過程
		 * 1. 先得到 -10 的二進制
		 *          10的二進制   28個0   1010
		 *          取反                28個1   0101   加1
		 *       -10 的二進制   28個1   0110
		 * 2. 移動
		 *         右移動兩位     11  28個1   01  這個就是最終的負數
		 * 3. 計算最後結果
		 *          負數取反+1得到對應的正數
		 *                                    00  28個0  10   +1
		 *          得到對應正數  00  28個0  11
		 *          正數是3對應的負數是-3
		 */
		
		// 無符號右移動專門針對負數   負數在前面也是補0
		System.out.println(b>>>2);
		
		
		System.out.println(a<<2);
		System.out.println(b<<2);
		// 左移一位，等於 *2
		System.out.println("==========================================");
		
		int c1 = 5, d1 = 4;
		System.out.println(c1 & d1);
		/*
		 * 把兩個數都轉換成二進制，然後一位一位運算
		 * 都是1這一位就為1，否則為0
		 * 得到的二進制再轉換成十進制即可
		 */
		
		System.out.println(c1 | d1);
		/*
		 * 把兩個數都轉換成二進制，然後一位一位運算
		 * 都是0這一位就為0，否則為1
		 * 得到的二進制再轉換成十進制即可
		 */
		
		System.out.println(c1 ^ d1);
		/*
		 * 把兩個數都轉換成二進制，然後一位一位運算
		 * 相同為0，不相同為1
		 * 得到的二進制再轉換成十進制即可
		 * 
		 * 如果  c = a ^ b
		 * 那麼  b 等於 c ^ a
		 * 且      a 等於 c ^ b
		 */
		
		int c = 10, d = 20;
		c = c ^ d;
		d = c ^ d;
		c = c ^ d;
		System.out.println("c="+c+" ,d="+d);
	}
}
