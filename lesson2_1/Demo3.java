package lesson2_1;

public class Demo3 {
	public static void main(String[] args) {
		Man man = new Man();
	}
}
class Person3{
	Person3(){
		System.out.println("hello");
	}
}
class Man extends Person3{
	Man(){
		System.out.println("world");
	}
}