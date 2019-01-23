package corelesson4;
import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File("C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo");
		System.out.println(file.exists());
		//true 代表目錄存在  false代表目錄不存在
		System.out.println("=======================");
//		File file1 = new File("C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/aa");
//		File file1  = new File(file, "aa");
		File file1 = new File("C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo", "aa");
		if(!file1.exists())
			file1.mkdir();//創建目錄
		else
			file1.delete();//刪除目錄
		System.out.println(file1.isDirectory());//判斷是否是目錄
		//如果目錄不存在，也返回false
		System.out.println(file1.isFile());//判斷是否是文件
		System.out.println("============================");
		File file2 = new File("C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/Excel.java");
		System.out.println(file2.isFile());
		System.out.println(file2.exists());
		File file3 = new File(file, "1.txt");
		if(!file3.exists())
			try {
				file3.createNewFile(); //創建文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		else
			file3.delete();
		
		System.out.println(file.getAbsolutePath()); //返回路徑
		System.out.println(file2.getAbsolutePath());
		
		System.out.println("===============================");
		System.out.println(file.getName()); // 返回文件夾名
		System.out.println((file2.getName())); //返回文件名
		System.out.println("===============================");
		System.out.println(file.getParent());//得到父目錄字符串
		System.out.println(file2.getParent());//得到父目錄字符串
		System.out.println("===============================");
		//getParentFile() 得到父目錄的File對象
		System.out.println(file.getParentFile().getAbsolutePath());
		System.out.println(file2.getParentFile().getAbsolutePath());
	}
}
