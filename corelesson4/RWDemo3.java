package corelesson4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RWDemo3 {
	public static void main(String[] args) {
		try {
//			等價於
//			BufferedReader br1 = new BufferedReader(new FileReader(
//					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/Office.java"));
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(
							"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/Office.java")));
//			普通的讀方法都有，主要的是 readLine 方法，一次讀一行，讀出來就是字符串
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(
							"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/Demo/3.txt")));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);// 一次讀一行，不讀取換行符，以後要自己換行
				bw.write(str, 0, str.length());
				bw.newLine();
				bw.flush();
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
