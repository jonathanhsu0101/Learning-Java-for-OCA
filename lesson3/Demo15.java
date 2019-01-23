package lesson3;

public class Demo15 {
	public static void main(String[] args) {
		PersonW person = new PersonW();
		/*
		 * 調用方法時，發現參數是一個接口
		 * 那麼傳遞的就是實現了該接口的類的對象
		 * 已知道接口，獲取其實現類的對象
		 * 可以直接用匿名類的對象
		 */
		person.playFly(new CanFly() {
			public void fly() {
				System.out.println("plane ... flying .....");
			}
		});
		System.out.println("=====================================");
		/*
		 * 參數是一個抽象類，那麼要傳遞的是該類子類的對象
		 * 已知父類，獲取其子類的對象
		 * 符合公式條件
		 */
		person.playDraw(new Shape() {
			public double getArea() {
				return 0;
			}
			public double getLength() {
				return 0;
			}
			public void draw() {
				System.out.println("drawing ..... shape ......");
			}
		});
	}
}

class PersonW {
	public void playFly(CanFly fly) {
		fly.fly();
	}
	public void playDraw(Shape shape) {
		shape.draw();
	}
}