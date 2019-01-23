package corelesson1;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo
{
	public static void main(String[] args)
	{
//		test1();
//		test2();
		test3();
	}

	private static void test1()
	{
		//Calendar 是抽象類，獲取的是其子類的對象
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
	public static void test2()
	{
		String s = "1998-10-10";
		Date date = DateDemo.stringToDate(s);
		Calendar c = Calendar.getInstance();
//		c.setTime(date);
		c.setTimeInMillis(date.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
	//輸入雇傭日期，得到轉正日期 --> 三個月轉正
	private static void test3()
	{
		String s = "1998-10-10"; //雇傭日期
		Date date = DateDemo.stringToDate(s);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//轉正日期
		c.add(Calendar.MONTH, 3);
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;
		int d = c.get(Calendar.DATE);
		System.out.println("轉正日期是："+y+"-"+m+"-"+d);
	}
}
