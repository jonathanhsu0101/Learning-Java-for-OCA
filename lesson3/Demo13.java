package lesson3;

public class Demo13 {
	public static void main(String[] args) {
		Persony person = new Persony();
		person.getOneCanFly().fly();
		System.out.println("======================================");
		Shape s = person.getOneShape();
		s.draw();
		System.out.println(s.getLength());
	}
}

class Persony {
	public Shape getOneShape() {
		/*
		 * 看到函數的返回值類型是一個抽象類 返回的一定是該抽象類子類的實例 只想在這個函數中使用
		 */
		class Line extends Shape {
			private Point last; // 起點
			private Point end; // 終點
			public Line() {}
			public Line(Point last, Point end) {
				this.last = last;
				this.end = end;
			}
			public double getArea() {
				return 0;
			}
			public double getLength() {
				return last.getDistance(end);
			}
			public void draw() {
				System.out.println("line draw .......");
			}
		}
		return new Line(new Point(5,5), new Point(10,10));
	}
	public CanFly getOneCanFly() {
		/*
		 * 看到函數的返回值類型是接口，返回的是實現了該接口的類的對象 因為在這裡可能只有這個函數中使用
		 * 所以我們可以直接在函數內部創建類
		 */
		class Bird implements CanFly {
			// 這個聲明在一個函數的內部，這就是局部內部類，只在該函數內部有效
			public void fly() {
				System.out.println("bird fly ....");
			}
		}
		return new Bird();
	}
}
/* Outer$Inner.class ---> 成員內部類
 * Outer1$Inner.class ---> 靜態內部類
 * Persony$1Bird.class ---> 局部內部類
 */
