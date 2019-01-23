package corelesson4;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File(
				"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/java/Java Big Data/src/movie");
//		listFile(file);
//		listFile1(file);
//		listFile2(file);
//		listFile3(file);
//		listFile4(file);
		listFile5(file);
	}
	public static void listFile(File file) {
		//file.list()列出該目錄下所有的目錄名和文件名
		//不會列出父目錄名稱，也不會遍歷子目錄
		//要加上getAbsolutePath()才會有父目錄名
		String[] filenames = file.list();
		for (String string : filenames) {
			System.out.println(string);
		}
		System.out.println("======================");
		//直接列出目錄下的，產生的是File對象
		File[] files = file.listFiles();
		for (File file2 : files) {
			System.out.println(file2.getAbsolutePath());
		}
	}
	/**
	 * 能夠遍歷file和file子目錄下的所有內容
	 * @param file
	 */
	public static void listFile1(File file) {
		File[] files = file.listFiles();
		for (File file2 : files) {
			if (file2.isFile()) { //如果是文件
				System.out.println(file2.getAbsolutePath());
			} else if (file2.isDirectory()){ //如果是目錄 ---> 進行遞歸
				listFile1(file2);
			}
		}
	}
	public static void listFile2(File file) {
		//		String[] filenames = file.list(new MyFileNameFilter());
		String[] filenames = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		for (String string : filenames) {
			System.out.println(
					file.getAbsolutePath() + "/" + string);
		}
	}
	static class MyFileNameFilter implements FilenameFilter {
		//file列出的每個文件都要調用accept方法，
		//返回true留下，返回false被過濾掉
		@Override
		public boolean accept(File dir, String name) {
			// File dir代表父目錄，name代表文件名or目錄
			System.out.println(dir.getAbsolutePath() + "  ...  "
					+ name);
			// 只留下 .java 結尾的檔名
			return !name.endsWith(".java");
		}
	}
	public static void listFile3(File file) {
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				//pathname 就是file下的每個文件or目錄
				System.out.println(pathname);
				return pathname.getAbsolutePath()
						.endsWith(".java");
			}
		});
		System.out.println("=====================");
		for (File file2 : files) {
			System.out.println(file2.getAbsolutePath());
		}
	}
	//遞歸拿出.java文件，包括子目錄下的
	public static void listFile4(File file) {
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (pathname.isFile()) {
					return pathname.getAbsolutePath()
							.endsWith(".java");
				} else if (pathname.isDirectory()) {
					listFile4(pathname);
				}
				return true;
			}
		});
		for (File file2 : files) {
			if (file2.isFile()) {
				System.out.println(file2.getAbsolutePath());
			}
		}
	}
	public static void listFile5(File file) {
		File[] files = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				/*System.out.println(dir.getAbsolutePath()
						+ "  ...  " + name);*/
				File file1 = new File(dir, name);
				if (file1.isFile()) {
					return name.endsWith(".java");
				} else if (file1.isDirectory()) {
					listFile5(file1);
				}
				return true;
			}
		});
		for (File file2 : files) {
			if (file2.isFile()) {
				System.out.println(file2.getAbsolutePath());
			}
		}
	}
}
