package chapter1;

public class VarP1 {

	public static void main(String[] args) {
		//聲明兩個變量並初始化
		int a = 10, b = 20;
		//實現交換
		int t = a;  //把a臨時存放到t中
		a = b;       //a中已經是b的值了
		b = t;        //把t的值放入了b
		System.out.println("a="+a+",b="+b);
		
		//容易犯錯：賦值的時候不知道誰在等式的左邊誰在右邊
		//思考：實現兩個數交換，不用第三個變量
	}
}
