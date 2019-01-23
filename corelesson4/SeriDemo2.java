package corelesson4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SeriDemo2 {
	public static void main(String[] args) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(
							"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/a.dat"));
			C c = new C();
			out.writeObject(c);
			out.flush();
			out.close();
			
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream(
							"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/a.dat"));
			C c1 = (C)ois.readObject();
			System.out.println(c1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class A {
	A() {
		System.out.println("a...");
	}
}

class B extends A {
	B() {
		System.out.println("b...");
	}
}

class C extends B implements Serializable{
	C() {
		System.out.println("c...");
	}
}