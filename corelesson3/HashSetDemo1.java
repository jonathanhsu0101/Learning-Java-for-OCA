package corelesson3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	public static void main(String[] args) {
		Student stu1 = new Student("001", "zhangsan", 22);
		Student stu2 = new Student("002", "lisi", 23);
		Student stu3 = new Student("003", "wangwu", 22);
		HashSet<Student> students = new HashSet<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		System.out.println(students.size());
		System.out.println(students);
		System.out.println("==========================");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("==========================");
		Iterator<Student> itor = students.iterator();
		while (itor.hasNext()) {
			System.out.println(itor.next());
		}
		System.out.println("==========================");
		students.add(stu3); // 重複元素加不進去
		System.out.println(students.size());
		Student stu4 = new Student("003", "wangwu", 22);
		System.out.println(stu3.equals(stu4));
		/*
		 * 重複元素如何定義 stu3/stu4 創建對象時是兩個對象 但在實際應用中是同一個學員
		 * 在這裡必須用唯一標示對象的屬性來重寫 equals和hashCode方法
		 * hashCode方法是一種散列算法，現在不用知道如何寫 他和HashSet中數據的存放有直接關係
		 */
		students.add(stu4);
		System.out.println(students.size());
	}
	//
}
