package lesson2_1;

public class Demo9 {
	public static void main(String[] args) {
		B9  b = new B9();
		/*
		 * 1. 創建B9類的對象，調用構造函數 ----> 子類的構造函數默認
		 * 	會調用父類無參數的構造函數
		 * 2. this ---> 一個非靜態的成員函數訪問非靜態的成員前面省略 this
		 * 	this 又是當前對象 (A 的實例的引用)，調用這個函數的那個對象是b 
		 * 	構成了父類的引用引用了子類的實例
		 * 3. 調用test函數，test函數構成了重寫 ---> 所以調用了子類的函數
		 * ========================================================
		 * 4. 初始化順序
		 * 	先父靜態、子靜態
		 * 	父定義初始化、父構造函數
		 * 	子定義初始化、子構造函數
		 */
	}
}

class A9 {
	A9() {
		test(); //這裡省略了 this.test();的this
	}
	void test() {
		System.out.println("hello");
	}
}

class B9 extends A9{
//	int i = 11;
	int i;
	{i = 11; System.out.println(i);}
	B9() {}
	/*void test() {
		System.out.println("world");*/
	void test() {
		System.out.println(i);
	}
}