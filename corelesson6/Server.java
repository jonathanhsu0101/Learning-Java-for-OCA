package corelesson6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server {
	public static void main(String[] args) {
		try {
			//開啟服務
			ServerSocket s = new ServerSocket(9000);
			System.out.println("服務已經開啟，等待客戶訪問");
			//等待客戶來訪問 ----> 如果沒有客戶來訪問，該accept()方法阻塞
			Socket socket = s.accept();
			System.out.println("接收到"
					+ socket.getInetAddress()
							.getHostAddress()
					+ "客戶端的訪問");
			//服務器通過socket.getInputStream()進行讀操作，轉換成一次讀一行的操作
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			String str = br.readLine();
			System.out.println(str);
			//從服務器端鍵盤讀一行數據發給客戶端
			BufferedReader br1 = new BufferedReader(
					new InputStreamReader(System.in));
			String str1 = br1.readLine();
			PrintWriter out = new PrintWriter(
					socket.getOutputStream(), true);
			out.println(str1);
			socket.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
