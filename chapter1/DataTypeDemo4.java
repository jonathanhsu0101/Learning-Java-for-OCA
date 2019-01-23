package chapter1;

public class DataTypeDemo4
{
	public static void main(String[] args)
	{
		char a = '中';
		char b = '\u4e2d'; // 中文的unicode表示法
		System.out.println(a);
		System.out.println(b);
		char c = 'a';
		// char 是16位無符號整數，範圍從0到2的16次方-1
		// 任何的char都是一個整數
		// 數字'0' ---> 48 '1' ---> 49
		// 字母'a' ---> 97 'b' ---> 98
		// 大寫字母'A' ---> 65 'B' ---> 66
		char d = 97;
		System.out.println(d);
		// 轉義字符
		char e = '\n'; // ---> 換行
		char f = '\t'; // ---> tab
		char g = '\\'; // ---> '\'
		char h = 'A' + 1;
		System.out.println(h);
	}
}
