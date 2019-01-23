package corelesson1;

public class StringDemo1
{
	public static void main(String[] args)
	{
		//這部分內容要求大家學會通過查看幫助中的構造函數
		char[] chars = {'a', 'b', 'c', 'd', 'e'};
		String s = new String(chars);
		System.out.println(s);
		String s1 = new String(chars, 1, 2);
		System.out.println(s1);
		String s2 = new String("Helloworld");
		System.out.println(s2);
		//特殊的構造方式，直接賦值
		String s3 = "hello";
		System.out.println(s3);
		/* 稱為字符串常量or字符串字面量
		 * 通過構造函數 new 一定會產生新的空間
		 * 通過直接賦值的方式，不一定產生新的空間
		 * 其實是一種設計模式，稱為享元模式
		 */
		String s4 = "hello";
		System.out.println(s3 == s4);
		/* 認為有一個字符串池的內存空間，裡面放字符串常量
		 * 每次，總是先從字符串池中找是否有該常量存在
		 * 如果有直接引用，如果沒有，新的空間，然後引用
		 */
		String s5 = "a"+"b"+"c"; //直接等價於"abc"  jvm自動優化了
		String s6 = "abc";
		System.out.println(s5 == s6);
		String s7 = 1+2+3+"abc"; // 6abc
		System.out.println(s7);
		String s8 = "abc"+1+2+3; // abc123
		System.out.println(s8);
		
		String s9 = "hello"+"world";
		String s10 = "helloworld";
		System.out.println(s9 == s10);
		String s11 = s4 + "world"; // new StringBuilder(s4).append("world");
		System.out.println(s10 == s11);
	}
	//
}
