package corelesson4;

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {
		deleteFile(new File("C:/Users/jonat/OneDrive/文件/Eclipse/Demo/aa"));
	}
	public static void deleteFile(File file){
		File[] files = file.listFiles();
		for (File file2 : files) {
			if(file2.isFile()){
				System.out.println(file2.getAbsolutePath());
				//如果是文件--->直接刪除
				file2.delete();
			}else if(file2.isDirectory()){
				//遞歸刪除
				deleteFile(file2);
			}
		}
		System.out.println(file.getAbsolutePath());
		file.delete();
	}
}