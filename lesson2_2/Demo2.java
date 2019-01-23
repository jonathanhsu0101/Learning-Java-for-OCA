package lesson2_2;

public class Demo2 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;
		A a2 = new A();
		a2.i = 10;
		/*
		 *  a1為什麼可以調用equals方法
		 *  java.lang.Object類是一切類的父類
		 *  Object類中的方法就繼承到了A類中
		 */
		System.out.println(a1.equals(a2));
		
		System.out.println(a1);
		//打印對象，直接打印對象的toString方法的返回值
		System.out.println(a1.toString());
	}
}
class A{
	int i;
	/*
	public boolean equals(Object obj) {
	        return (this == obj);
	    }
	 */
	/*public boolean equals(A aa) {
		return this.i == aa.i;
	}*///和父類繼承過來的方法構成了重載，就近原則
	public boolean equals(Object obj) {
		//return true;
		//A xx = (A)obj; //傳過來的的確是A對象實例的引用，就可以轉換
		if(obj instanceof A) {
			A xx = (A)obj;
			return this.i == xx.i;
		}
		return false;
	}
	@Override
	public String toString() {
		return i+"";
	}
}