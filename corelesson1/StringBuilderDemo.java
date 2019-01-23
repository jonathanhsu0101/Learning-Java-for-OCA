package corelesson1;

public class StringBuilderDemo
{
	public static void main(String[] args)
	{
		System.out.println(getString(10));
	}
	/**
	 * 得到類似 (?,?,?)的字符串
	 * @param length   ?的個數
	 * @return
	 */
	public static String getString(int length)
	{
		StringBuilder s = new StringBuilder();
		s.append("(");
		for (int i = 0; i < length; i++)
		{
			s = i == 0 ? s.append("?") : s.append(",?");
		}
		s.append(")");
		return s.toString();
	}
}
