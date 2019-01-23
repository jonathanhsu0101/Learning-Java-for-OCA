package corelesson4;
import java.util.Properties;

public class PropertiesDemo2 {
	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
//			路徑寫死了，項目一旦移動位置，就要修改代碼。
//			prop.load(new FileInputStream(
//					"C:/Users/jonat/OneDrive/文件/Eclipse/java/Java Big Data/bin/corelesson4/aa.properties"));
			
//			建議用這種方式
//			getResourceAsStream 得到的是 classpath 路徑
//			在Eclipse中默認是 /bin
			prop.load(PropertiesDemo2.class.getResourceAsStream(
					"/corelesson4/aa.properties"));
			
//			getClassloader() 獲得的是類加載器
//			prop.load(PropertiesDemo2.class.getClassLoader()
//					.getResourceAsStream(
//							"corelesson4/aa.properties"));
			System.out.println(prop.getProperty("aa"));
			System.out.println(prop.getProperty("bb"));
			System.out.println(prop.getProperty("cc"));
			System.out.println(prop.getProperty("dd"));
			System.out.println(prop.getProperty("ee"));
		} catch (Exception e) {
			
		}
	}
}
