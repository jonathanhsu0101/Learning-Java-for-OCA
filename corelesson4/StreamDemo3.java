package corelesson4;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class StreamDemo3 {
	public static void main(String[] args) {
		try {
			/* PipedOutputStream的對象 用PipedInputStream的對象來構造
			 * (或是PipedInputStream的對象 用PipedOutputStream的對象來構造)
			 * 就構成管道流，可以用在兩個模塊之間傳遞資料
			 */
			PipedOutputStream out = new PipedOutputStream();
			PipedInputStream in = new PipedInputStream(out);
			Send send = new Send(out);
			Receiver rec = new Receiver(in);
			send.send();
			rec.rec();
			//關閉省略了
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Send {
	OutputStream out;
	public Send(OutputStream out) {
		super();
		this.out = out;
	}
	public void send() {
		try {
			byte value = (byte) (Math.random() * 100);
			System.out.println("send value is : " + value);
			out.write(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Receiver {
	InputStream in;
	public Receiver(InputStream in) {
		super();
		this.in = in;
	}
	public void rec() {
		try {
			byte value = (byte) in.read();
			System.out.println("receive value is : " + value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}