package corelesson6;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class OServer {
	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(9000);
			System.out.println("服務已經開啟......");
			Socket socket = s.accept();
			System.out.println("接收到客戶端的訪問");
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			User user = (User)ois.readObject();
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
