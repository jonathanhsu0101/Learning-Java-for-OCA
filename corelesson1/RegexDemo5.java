package corelesson1;

public class RegexDemo5
{
	public static void main(String[] args)
	{
		/*
		 * 定義一個郵箱
		 * cedar_c@163.com     (.com.cn)
		 * cedar_c@sina.com.cn
		 * 假設：
		 * 名字是數字字母_都可以後面跟@
		 * @後面是數字字母
		 * 在後面(.字母)一個或多個
		 */
		String regex = "^\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+$";
		
	}
	//
}
