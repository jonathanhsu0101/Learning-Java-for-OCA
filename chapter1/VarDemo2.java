package chapter1;

public class VarDemo2 {

	public static void main(String[] args) {
		int a, b, c;   //同時聲明了三個變量，等於int a; int b; int c;
		a = 5;
		b = 6;
		c  = 7;
		System.out.println("a="+a+" b="+b+" c="+c);
		
		int d = 1, e = 2, f = 3;  //同時聲明並初始化 （初始化就是賦值）
		System.out.println("d="+d+" e="+e+" f="+f);
		
		//聲明並同時賦值
		int x1 = a;   //把a標示的內存中的值取出，並賦值(複製)到x1標示的內存中
		System.out.println("x1="+x1);
		
		a = 10;
		System.out.println("a="+a);
		/*
		 * 等號是賦值運算符，從右往左運算
		 * 看等號右邊：把a標示的內存中的值取出和20相加
		 * 看等號左邊：再放入到a標示的內存
		 */
		a = a + 20;
		System.out.println("a="+a);
	}

}
