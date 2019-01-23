package corelesson4;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/raf.dat",
					"rw");
			System.out.println(raf.getFilePointer());
			raf.writeInt(1000);
			System.out.println(raf.getFilePointer());
			raf.write(1100>>24);
			raf.write(1100>>16);
			raf.write(1100>>8);
			raf.write(1100);
			System.out.println(raf.getFilePointer());
			raf.writeUTF("hello");
			System.out.println(raf.getFilePointer());
			
//			byte[] b = new byte[10000];
//			int bytes = raf.read(b, 0, b.length);
			System.out.println("===============================");
			raf.seek(0);
			int a = raf.readInt();
			System.out.println(raf.getFilePointer());
			System.out.println(a);
			a = (raf.read()<<24) + (raf.read()<<16) + (raf.read()<<8) + raf.read();
			System.out.println(a);
			System.out.println("===============================");
			raf.seek(8);
			System.out.println(raf.readUTF());
			raf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * 網路下載的時候，其實會把大的文件拆分成多個小文件
	 * 分別下載，下載後就是多個臨時文件，然後拼接成一個文件
	 * 涉及到定位到文件的某個位置
	 * 從文件的某個位置開始寫
	 */
}
