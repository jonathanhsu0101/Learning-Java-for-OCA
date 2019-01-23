package corelesson4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo1 {
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
//		test1();
//		test2();
//		test3();
		test4();
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
	}
	//所有的IO操作都有IOException產生
	public static void test1() {
		try {
			FileInputStream in = new FileInputStream(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/lesson4.txt");
			//如果1.txt不存在-->直接創建 or 存在-->會刪除然後再創建
			FileOutputStream out = new FileOutputStream(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/1.txt");
			int c;
			/*問題1：
			 * 對於單字節編碼都沒有問題，
			 * 對於多字節編碼文字直接打印會有亂碼
			 * 問題2：
			 * 對於大的文件效率較低
			 */
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
				out.write(c);
			}
			in.close(); //最好在finally裡面close
			out.close();
		} catch (IOException e) {}
	}
	public static void test2() { //讀取大的文件，建議採用這種方式
		try {
			FileInputStream in = new FileInputStream(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/lesson4.txt");
			FileOutputStream out = new FileOutputStream(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/2.txt");
//			FileInputStream in = new FileInputStream(
//					"C:/Users/Jonathan Hsu/Documents/a.jpg");
//			FileOutputStream out = new FileOutputStream(
//			"C:/Users/Jonathan Hsu/Documents/b.jpg");
			byte[] b = new byte[1024 * 5];
			/*
			 * 往b字節數組中放，從第0個位置開始，最多放b.length個
			 * 返回的是讀到的字節的個數
			 */
			/*int bytes = in.read(b, 0, b.length);  //批量讀取，效率較高
			String s = new String(b, 0, bytes);
			System.out.println(s);*/
			int bytes;
			while ((bytes = in.read(b, 0, b.length)) != -1) {
				String s = new String(b, 0, bytes);
				System.out.print(s);
				out.write(b, 0, bytes);
			}
			in.close();
			out.close();
		} catch (IOException e) {}
	}
	public static void test3(){
		try {
			FileInputStream in = new FileInputStream(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/lesson4.txt");
			FileOutputStream out = new FileOutputStream(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/3.txt");
			int length = in.available(); //返回可讀的字節數
			/*
			 * 如果文件很大，開闢的內存空間就太大了
			 * 也不合適
			 * 建議 都用test2()的方式讀取文件
			 */
			byte[] b = new byte[length];
			in.read(b);
			String s = new String(b);  
			System.out.println(s);
			out.write(b);
			in.close();
			out.close();
		} catch (IOException e) {
		}
	}
	public static void test4(){
		try {
			FileInputStream in = new FileInputStream(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/aa.txt");
			FileOutputStream out = new FileOutputStream(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/bb.txt");
			byte[] b = new byte[1000];
			int bytes = in.read(b, 0, b.length);
			/*
			 * aa.txt文件是UTF-16BE編碼的字節序列，轉換成字符串時
			 * 要用UTF-16BE編碼
			 */
			String s = new String(b, 0, bytes, "UTF-16BE");
			System.out.println(s);
			out.write(b, 0, bytes);
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}