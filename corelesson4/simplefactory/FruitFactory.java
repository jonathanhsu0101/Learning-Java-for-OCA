package corelesson4.simplefactory;
import java.util.Properties;

public class FruitFactory {
	private static Properties prop = new Properties();
	static { // 寫在靜態塊裡面，只會加載一次
		try {
			//載入資源文件fruit.properties
			prop.load(FruitFactory.class.getResourceAsStream(
					"/corelesson4/simplefactory/fruit.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Fruit getInstance(String name) {
		if ("apple".equalsIgnoreCase(name))
			return new Apple();
		if ("grape".equalsIgnoreCase(name))
			return new Grape();
		return null;
	}
	public static Fruit getInstance() {
		try { //動態加載類，來創建對象
			return (Fruit) Class
					.forName(prop.getProperty("fruit"))
					.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
