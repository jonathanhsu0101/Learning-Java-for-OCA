package lesson1;

public class ClassDemo10 {
	public static void main(String[] args) {
		Person10 p1 = new Person10(175, "zhangsan");
		//Person10 p2 = new Person10(185, "lisi");
		p1.print();
		//p2.print();
	}
}
class Person10{
	//double h = 175;//定義初始化
	double h;
	{
		System.out.println("aa.....");
		h = 175;
	} //定義初始化塊，平時沒有必要這樣寫
	double w;
	String name;
	Person10(double a, String c){
		w = a;
		name = c;
		System.out.println("bb.....");
	}
	void print() {
		System.out.println(name+",身高"+h+",體重"+w);
	}
}