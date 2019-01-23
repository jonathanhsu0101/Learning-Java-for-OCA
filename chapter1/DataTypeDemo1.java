package chapter1;

public class DataTypeDemo1 {

	public static void main(String[] args) {
		// 單獨直接列出數字默認就是int類型
		// 直接一個數字，稱為數字字面量，整數的字面量默認先是int類型
		int a = 10;
		
		byte b = 10;  /* 默認轉換了（前提byte
		能夠容納） --->  自動去掉了前面的0, 只留下8位	*/
		
		/*  type c1 = 100000000;  等式右邊的數字默認就是int 
		 *     放入 byte 就有錯
		 */
		
		/*   int c2 = 10000000000000000;    */
		
		// 打印a的二進制    Java中默認把前面的0會去掉
		System.out.println(Integer.toBinaryString(a));
		int c = -10;  //  去看下二進制
		/*
		 *   1. 推理過程
		 *        負數  = 正數取反+1
		 *        -10 的先看 10的二進制
		 *        0000    24個0    1010
		 *        取反
		 *        28個1    0101
		 *        加1
		 *        28個1    0110
		 */
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(30));
		
		int d = -30;
		/*
		 *    30 = 2(4)+2(3)+2(2)+2(1)      24個0  0001  1110
		 *    取反      24個1      1110  0001
		 *    加1        24個1      1110  0010
		 */
		System.out.println(Integer.toBinaryString(d));
		
		// 用十六進制  0x開頭代表十六進制
		int e = 0x23;
		System.out.println(e);
		// 用八進制      0開頭
		int f  = 036;
		System.out.println(f);
		System.out.println(Integer.toHexString(d));
		
		// int 最大值    0(31個)1
		System.out.println(Integer.MAX_VALUE);
		// 0(31個)1  加1的話就變成1後面31個0
		// int 最大值加1  變成int最小值
		// 大家自己推理
		int g = Integer.MAX_VALUE  + 1;
		System.out.println(g+","+Integer.MIN_VALUE);
	}
}
