package chapter1;

public class VarDemo1 {

	public static void main(String[] args) {
		int a;    //變量的聲明  ---> 開闢一個4個字節的內存區域，可以放一個整數
		a = 5;   //把5放入到a標示的內存區域
		System.out.println(a);
		//遇到變量在等式左邊：都代表這個變量標示的內存
		//其他情況：都代表把標示的內存中的值取出
		
		int b = 10;   //聲明並同時賦值(初始化)
	}

}
