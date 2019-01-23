package lesson3;
public class Demo6 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		Plane p1 = new Plane();
		p1.fly();
		System.out.println("======================");
		/*
		 * 需要一個會飛的東西
		 * 實現了 CanFly 接口的類的對象，才是會飛的東西。
		 * 賦值時給一個實現了 CanFly 接口的類的實例對象即可
		 * 從語法角度，一樣可以認為是父類的引用引用了子類的實例
		 *  (實際上不是父子類關係，而是具備其某種功能)
		 */
		CanFly fly1 = new Bird();
		fly1.fly(); // 調用實現了接口的類的方法
		CanFly fly2 = new Plane();
		fly2.fly();
		System.out.println("======================");
		Person1 person1 = new Person1();
		person1.toFly(bird);
		person1.getOneCanFly().fly();
		;
	}
}

interface CanFly {
	void fly(); // 等於 public abstract void fly();
}

class Bird implements CanFly {
	public void fly() {
		System.out.println("bird flying .....");
	}
}

class Plane implements CanFly {
	public void fly() {
		System.out.println("plane fly......");
	}
}

class Person1 {
	/*
	 * toFly 方法參數類型是一個接口，調用 toFly 方法
	 * 時要傳遞的是實現了 CanFly 接口的類的對象
	 */
	public void toFly(CanFly f) {
		f.fly();
	}
	public CanFly getOneCanFly()
	// getOneCanFly 方法的返回值是接口，返回的是
	// 實現了該接口的類的實例對象
	{
		//return new Bird();
		/* 也可以 */return new Plane();
	}
}