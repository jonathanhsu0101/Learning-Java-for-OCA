package corelesson4;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StreamDemo6 {
	public static void main(String[] args) {
		try {
			PrintStream ps =
					new PrintStream(new FileOutputStream(
							"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/print.txt"));
			//System.out 目標是標準輸出設備
			//System.in    標準輸入設備
			ps.println("helloworld");
			ps.println("bye-bye"); //ps.print("hello"); 不輸出換行
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
