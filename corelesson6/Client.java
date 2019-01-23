package corelesson6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 9000);
			System.out.println("客戶端開啟服務器");
			//客戶端鍵盤讀一行數據，發送給服務器
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			String str = br.readLine();
			//寫到服務器端 ---> 服務器端進行讀操作
			//字節流 ---> 轉成一次寫一行的流類
			PrintWriter out = new PrintWriter(
					socket.getOutputStream(), true);
			out.println(str);
			BufferedReader br1 = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			String str1 = br1.readLine();
			System.out.println(str1);
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
