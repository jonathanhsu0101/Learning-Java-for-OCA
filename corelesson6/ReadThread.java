package corelesson6;
import java.io.BufferedReader;

//從socket管道中進行讀操作，並打印到控制台
public class ReadThread extends Thread {
	private BufferedReader br;
	public ReadThread(BufferedReader br) {
		this.br = br;
	}
	@Override
	public void run() {
		try {
			while(true){
				String str = br.readLine();
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
