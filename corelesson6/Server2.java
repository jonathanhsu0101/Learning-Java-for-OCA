package corelesson6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server2 {
	public static void main(String[] args) {
		try {
			//開啟服務
			ServerSocket s = new ServerSocket(9000);
			System.out.println("服務已經開啟，等待客戶訪問");
			//等待客戶來訪問 ----> 如果沒有客戶來訪問，該accept()方法阻塞
			while(true){ //不斷等待新客戶來訪問
				Socket socket = s.accept();
				System.out.println("接收到"
						+ socket.getInetAddress()
								.getHostAddress()
						+ "客戶端的訪問");
				//服務器通過socket.getInputStream()進行讀操作，轉換成一次讀一行的操作
				BufferedReader br = new BufferedReader(
						new InputStreamReader(
								socket.getInputStream()));
				BufferedReader br1 = new BufferedReader(
						new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(
						socket.getOutputStream(), true);
				
				new ReadThread(br).start();
				new WriterThread(br1, out).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
