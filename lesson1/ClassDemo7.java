package lesson1;

public class ClassDemo7 {
	public static void main(String[] args) {
		//先創建加法器類的對象
		Adder7 adder = new Adder7();
		System.out.println(adder.add(10,10));//double a = 10
		System.out.println(adder.add(10.5,20.3));
		System.out.println(adder.add(1, 2, 3));
		System.out.println("==========================");
		System.out.println(adder.add('a', 'b'));
	}
}
class Adder7{
	int add(char a, char b) {
		System.out.println("char....");
		return a+b;
	}
	int add(int a, int b) {
		System.out.println("add1....");
		return a+b;
	}
	int add(int a, int b, int c) {
		System.out.println("三個參數");
		return a+b+c;
	}
	double add(double a, double b) {
		System.out.println("double...");
		return a+b;
	}
}