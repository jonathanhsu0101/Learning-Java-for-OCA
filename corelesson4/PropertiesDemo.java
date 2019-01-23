package corelesson4;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(
					"C:/Users/Jonathan Hsu/OneDrive/文件/Eclipse/"
					+ "java/Java Big Data/bin/corelesson4/aa.properties"));
			/*for(Object object : prop.keySet()){
				String key = (String)object;
				System.out.println(key+"="+prop.get(key));
			}*/
			
			//資源文件的內容是可以看見的，key就是已知的
			System.out.println(prop.getProperty("aa"));
			System.out.println(prop.getProperty("bb"));
			System.out.println(prop.getProperty("cc"));
			System.out.println(prop.getProperty("dd"));
		} catch (Exception e) {
		}
	}
}
