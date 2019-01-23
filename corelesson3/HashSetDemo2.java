package corelesson3;
import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		Student stu1 = new Student("001", "zhangsan", 22);
		Student stu2 = new Student("002", "lisi", 23);
		Student stu3 = new Student("003", "wangwu", 22);
		HashSet<Student> students = new HashSet<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		System.out.println(students.size());
		students.remove(stu1);
		System.out.println(students.size());
		System.out.println(students);
		students.add(stu1);
		stu1.setNo("000x"); //修改該屬性後，對象移除不了
		students.remove(stu1);
		System.out.println(students.size());
		System.out.println(students);
		/*
		 * HashSet存放元素的時候，元素的位置
		 * 是和對象hashCode算法得到的值相關的
		 * 那麼去查找元素時，也要根據這個算法的值
		 * 然後找到相關位置，移除元素，如果
		 * 沒有元素存在remove方法返回false
		 * 如果跟算法相關的屬性值在放入容器後被修改了
		 * hashCode算法得到的值和之前放入容器時不一樣了
		 * 找對象的位置就發生變化，因此找不到之前的對象
		 * 導致元素不能移除，久而久之會產生內存洩漏
		 */
	}
}
