package chapter1;

public class VarDemo3 {

	public static void main(String[] args) {
		int a;
		//System.out.println(a);  必須賦值才能使用
		// a = 12.3;  賦值時類型必須匹配
		a = 20;
		System.out.println(a);
		
		// int a = 30;  變量不能重複定義
		a = 40;  //  可以重新賦值
		{
			int c = 35;
			System.out.println(c);
		}
		{
			int c = 40;
			System.out.println("c="+c);
		}
		// System.out.println(c);  不在作用域範圍內
	}

}
