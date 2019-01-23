package corelesson1;

public class StringDemo2
{
	public static void main(String[] args)
	{
		String s = "helloworld";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println("===================");
		for (int i = 0; i < s.length(); i++)
			System.out.println(s.charAt(i));
		System.out.println("===========================");
		String s2 = "cedar_c@163.com";
		System.out.println(s2.endsWith(".com"));
		System.out.println(s2.substring(1));
		System.out.println(s2.substring(1, 4));//包含1不包含4
		System.out.println(s2.indexOf("@"));
		System.out.println(s2.indexOf("78"));
		System.out.println(s2.lastIndexOf("c"));
		//獲取郵箱中的用戶名，從@開始前面的是用戶名
		int index = s2.indexOf("@");
		System.out.println(s2.substring(0, index));
		//轉換大小寫
		String name = "zhangsan";
		System.out.println(name.toUpperCase());
		String name1 = "LISI";
		System.out.println(name1.toLowerCase());
		//字符串內容是否相同
		System.out.println(name.equals(name1));
		System.out.println(name.equals("zhangsan"));
		System.out.println(name.equals("ZHANGSAN"));
		System.out.println(name.equalsIgnoreCase("ZHANGSAN"));
		// name的首字母轉換成大寫，其他不變
		String name2 = name.substring(0, 1).toUpperCase()+name.substring(1);
		System.out.println(name2);
		
		System.out.println(name.concat(name2));
		//從第一個不相同的字符開始比較，返回其ASCII差值
		System.out.println(name.compareTo(name2));
		
		//轉換成字符串
		int a = 100;
		System.out.println(a+"");
		String s3 = String.valueOf(a);
		System.out.println(s3);
		System.out.println("======================");
		// split
		String s4 = "a,b,c,d,e";
		String[] ss = s4.split(",");
		for (String string : ss)
		{
			System.out.println(string);
		}
	}
}
