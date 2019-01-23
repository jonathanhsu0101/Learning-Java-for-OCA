package corelesson4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamDemo4 {
	public static void main(String[] args) {
//		write();
		read();
	}
	public static void read() {
		try {
			DataInputStream dis =
					new DataInputStream(new FileInputStream(
							"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/data.txt"));
			/*
			 * readInt方法是用
			 * InputStream的read讀4次然後拼接
			 * 看源碼
			 */
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			dis.close();
		} catch (Exception e) {
		}
	}
	public static void write() {
		try {
			//把1.txt文件作為字節輸出流，並且直接可以寫java的數據相關類型
			//DataOutputStream dos = new DataOutputStream(
			//		new FileOutputStream("d:\\1.txt"));
			//把1.txt文件作為字節輸出流，並且先寫入緩衝區，並且可以直接寫java的數據類型
			//DataOutputStream dos1 = new DataOutputStream(
			//		new BufferedOutputStream(
			//				new FileOutputStream(
			//						"d:\\1.txt")));
			//發現特殊功能的流類都是由基本的流類，一層一層嵌套構造而來，其實是裝飾模式
			DataOutputStream dos = new DataOutputStream(
					new FileOutputStream(
							"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/data.txt"));
			/*
			 * 如果是 FileOutputStream out
			 * out.write(10000); 寫得進去嗎？write方法只能寫一個字節
			 * 但是10000是32個字節，所以它只會寫後8位
			 * DataOutputStream dos 對象的 writeInt 方法
			 * 一定是利用out對象的write方法寫4次，每次寫8位
			 * writeInt 內部一定是
			 * out.write(10000>>24)
			 * out.write(10000>>16)
			 * out.write(10000>>8)
			 * out.write(10000)
			 * 			 
			 */
			dos.writeInt(1000);
			dos.writeBoolean(true);
			dos.writeDouble(10.03);
			dos.writeUTF("hello world");
			dos.close();
		} catch (Exception e) {
		}
	}
}
