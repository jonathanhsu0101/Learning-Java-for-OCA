package chapter1;

public class VarP2 {

	public static void main(String[] args) {
		//實現兩個變量交換不用第三個變量
		int a = 10, b = 20;
		a = a + b;  // 現在a標示的內存中放的是a和b的和
		b = a - b;   // a已經是a, b的和，再減去b就是以前的a，現在賦值給了b
		//再往下走b中已經是以前的a了
		a = a - b;    // 等式右邊a是總和，b是以前的a，相減之後得到以前的b
		// 賦值給了a
		System.out.println("a="+a+",b+"+b);
		
		// 變量的定義     =的運算    右向左
	}

}
