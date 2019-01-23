package chapter1;

public class DataTypeDemo3
{
	public static void main(
			String[] args)
	{
		double a = 10.5;  // 小數默認是double
		System.out.println("a="+a);
		
		// float 型以f或F結尾，不寫f默認是double報錯
		float b = 20.2f;
		System.out.println("b="+b);
		
		// 浮點數不能做精確運算
		double money = 3.0;
		System.out.println(money - 2.9);
	}
}
