package corelesson4;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo2 {
	public static void main(String[] args) {
		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(
							"C:/Users/jonat/OneDrive/文件/Eclipse/Demo/a.jpg"));
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream(
							"C:/Users/jonat/OneDrive/文件/Eclipse/Demo/b.jpg"));
			/*
			 * 內部操作會把文件放到內存中 (緩衝區字節數組)
			 * 讀的時候從內存中讀取
			 */
			byte[] b = new byte[10000]; 
			int bytes;
			while((bytes = bis.read(b, 0, b.length))!=-1){
				//先寫入緩衝區，刷新(flush)緩衝區，才寫入磁盤
				//緩衝區滿了-->自動刷新
				bos.write(b, 0, bytes);
				bos.flush();
			}
			bos.close();//close 也會自動刷新
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
