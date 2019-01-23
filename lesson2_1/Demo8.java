package lesson2_1;

public class Demo8 {
	public static void main(String[] args) {
		JavaTeacher t = new JavaTeacher();
		t.print();
		
		Teacher t1 = new JavaTeacher();
		t1.print();
	}
}
class Teacher{
	void print() {
		System.out.println("teaching........");
	}
}
class JavaTeacher extends Teacher{
	void print() {
		System.out.println("teaching....我贏java課程");
	}
}