package lesson2_1;

public class Demo11 {
	public static void main(String[] args) {
		Circle11 c1 = new Circle11();
		c1.draw();
		Rectangle11 r1 = new Rectangle11();
		r1.draw();
		
		Shape11 s1 = new Circle11();
		Shape11 s2 = new Rectangle11();
		s1.draw();
		s2.draw();
		System.out.println("==================================");
		
		Person11 p = new Person11();
		p.drawShape(c1);
		p.drawShape(r1);
		System.out.println("====================================");
		
		p.getOneShape().draw();
	}
}
class Person11{
	//Shape類作為參數，將來可以傳遞它的實例，還有其子類的實例
	void drawShape(Shape11 s) { 
		s.draw();
	}
	Shape11 getOneShape() {
		//Shape作為返回值類型，可以返回它的實例，或者其子類的實例
		//return new Circle11();
		return new Rectangle11();
	}
}
class Shape11{
	void draw() {
		System.out.println("......");
	}
}
class Circle11 extends Shape11{
	void draw() {
		System.out.println("draw circle ......");
	}
}
class Rectangle11 extends Shape11{
	void draw() {
		System.out.println("draw rectangle .....");
	}
}