package lesson2_2;

public class Demo3 {
	public static void main(String[] args) {
		Student student = new Student(1000,"zhangsan",18,"我贏java一班");
		Student student2 = new Student(1000,"zhangsan",18,"我贏java一班");
		/*
		 * 我們在實際應用當中，一般習慣大家認都是通過
		 * equals方法來比較兩個對象，如果返回true就認為是同一個
		 * 對象，返回false就認為不是
		 * 
		 * 在實際應用中，如果對象有了唯一標示，就應該用
		 * 唯一標示來生成equals方法和hashCode方法(以後會講)
		 */
		System.out.println(student.equals(student2));
		//equals和hashCode方法改寫前後結果不一樣
		
		System.out.println(student);
	}
}
