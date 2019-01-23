package corelesson4;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class RWDemo4 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(
									"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/Office.java")));
//			PrintWriter pw = new PrintWriter(
//					new FileOutputStream(
//							"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/4.txt"));
			PrintWriter pw = new PrintWriter(
					new FileOutputStream(
							"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/4.txt"), true);
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				pw.println(str);
//				pw.flush();  //加上 true 就自動刷新緩衝區
			}
			br.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
