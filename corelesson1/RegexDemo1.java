package corelesson1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1
{
	public static void main(String[] args)
	{
		String s = "xxab+defab+xyzab+dddab+nnn";
		//要用ab+來分割字符串
		String[] ss = s.split("ab\\+");//如果ab+代表a後面跟b，b可以出現一或多次
		/*正則表達式中：. * + ? 有特殊意義，不能單獨表示他們
		 * 如果非要表示就需要用 \
		 * 而在java中，\ 在字符串需要用 \\ 表示
		 * 所以要表示.*+?就要用 \\.  \\*  \\+  \\?
		 * 如果不轉義她就有特殊意義
		 */
		System.out.println(Arrays.toString(ss));
		
		System.out.println("========================");
		String regex = "ab\\+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		//判斷一個字符串是否匹配一個正則表達式
		System.out.println(matcher.matches());
		System.out.println(s.matches(regex));
		//在一個字符串中找出匹配的正則表達式的元素
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}
	}
	//
}
