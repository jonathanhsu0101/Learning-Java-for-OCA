package corelesson4.simplefactory;

public class FruitTest {
	public static void main(String[] args) {
		/*
		 * 要用斧頭，還要自己造斧頭？
		 * 現實生活中，用斧頭就去工廠買，
		 * 而不是自己去造斧頭
		 */
		
		/*水果要自己new生成
		Apple apple = new Apple();
		apple.grow();
		apple.harvest();
		System.out.println("===========================");
		Grape grape = new Grape();
		grape.grow();
		grape.harvest();
		*/
		
		//使得使用者與創建者分離 ----> 要加新水果-->需要修改FruitFactory的代碼
		/*Fruit fruit = FruitFactory.getInstance("grape");
		fruit.grow();
		fruit.harvest();*/
		
		Fruit fruit = FruitFactory.getInstance();
		fruit.grow();
		fruit.harvest();
	}
}
