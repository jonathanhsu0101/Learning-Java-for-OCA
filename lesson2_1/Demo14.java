package lesson2_1;

public class Demo14 {
	public static void main(String[] args) {
		//A14.accessA();
		A14 a = A14.getInstance();
		a.print();
	}
}
class A14{
	private A14() {}
	/*public static void accessA() {
		A14 a = new A14();
		a.print();
	}*/
	public static A14 getInstance() {
		return new A14();
	}
	public void print() {
		System.out.println("a.....");
	}
}