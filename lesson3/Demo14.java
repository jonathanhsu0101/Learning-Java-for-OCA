package lesson3;

public class Demo14 {
	public static void main(String[] args) {
		PersonZ pz = new PersonZ();
		pz.getOneCanFly().fly();
		System.out.println("============================");
		pz.getOneShape().draw();
	}
}

class PersonZ {
	public CanFly getOneCanFly() {
		// 返回的類型是接口，那麼要獲取實現了該接口的類的實例
		// 符合公式條件
		return new CanFly() {
			public void fly() {
				System.out.println("bird ... fly .....");
			}
		};
	}
	public Shape getOneShape() {
		/*
		 * 返回值類型是一個抽象類，那麼返回的是該抽象類子類的實例 已知父類，獲取其子類的對象 可以直接使用匿名類公式
		 */
		return new Shape() {
			public double getArea() {
				return 0;
			}
			public double getLength() {
				return 0;
			}
			public void draw() {
				System.out.println("draw .. shape ...");
			}
		};
	}
}