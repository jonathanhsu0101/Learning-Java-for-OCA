package corelesson4;

import java.io.FileOutputStream;

public class Test {
	public static void main(String[] args) {
		try {
			// 1111.txt文件默認在當前項目(project)目錄下
			FileOutputStream out = new FileOutputStream("1111.txt");
			out.write(10);
		} catch (Exception e) {
		}
	}
}
