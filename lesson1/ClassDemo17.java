package lesson1;

public class ClassDemo17 {
	public static void main(String[] args) {
		Person17 p = new Person17(10,"tt");	//先靜態塊、後定義初始化塊、最後構造函數
		Person17 p1 = new Person17(11,"uu"); //靜態塊屬於類、只有一份、只需加載一次
		//既然靜態的東西屬於類，那麼是在創建對象的時候加載的嗎?
		//不是，是用到類就加載，且只加載一次，上面的情況是創建對象，因為創建對象也要用到類
		
	}
}
class Person17{
	int age;
	String name; 
	//int h = 175;
	int h;
	{
		h = 175;
		System.out.println("aa");
	}
	//static int diqiu = 1; ---> 靜態定義初始化
	static int diqiu;
	static { //靜態定義初始化塊
		diqiu = 1;
		System.out.println("bb..");
	}
	Person17(int age, String name){
		this.age = age;
		this.name = name;
		System.out.println("cc");
	}
}




