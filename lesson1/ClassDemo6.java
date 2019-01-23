package lesson1;

public class ClassDemo6 {
	public static void main(String[] args) {
		//先創建加法器類的對象
		Adder adder = new Adder();
		System.out.println(adder.add(10,10));
		System.out.println(adder.add(10.5,20.3));
		System.out.println(adder.add(1, 2, 3));
	}
}
class Adder{
	public int add(int a, int b) {
		System.out.println("add1....");
		return a+b;
	}
	public int add(int a, int b, int c) {
		System.out.println("三個參數");
		return a+b+c;
	}
	public double add(double a, double b) {
		System.out.println("double...");
		return a+b;
	}
}