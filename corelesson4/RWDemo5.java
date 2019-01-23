package corelesson4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class RWDemo5 {
	public static void main(String[] args) {
		try {
			//想要用 System.in 從鍵盤一次讀一行，讀到end結束
			//System.in是字節流，但是一次讀一行只有字符流的 BufferedReader 有，怎麼辦呢？
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(System.out, true);
			while (true) {
				String str = br.readLine();
				//System.out.println(str);
				out.println(str);
				if ("end".equals(str))
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
