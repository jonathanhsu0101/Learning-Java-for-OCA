package corelesson4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriDemo1 {
	public static void main(String[] args) {
		Student stu = new Student(1000, "zhangsan", 30);
		try {
			// 寫操作
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/data.dat"));
			out.writeObject(stu);
			out.flush();
			out.close();
			
			// 讀操作
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/data.dat"));
			Student stu1 = (Student) in.readObject();
			System.out.println(stu1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
