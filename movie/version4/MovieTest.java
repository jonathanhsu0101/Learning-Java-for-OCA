package movie.version4;

public class MovieTest
{
	public static void main(String[] args)
	{
		//創建影片
		Movie m1 = new Movie("我們曾經是戰士");
		m1.setPriceCode(Movie.R_MOVIE);
		
		Movie m2 = new Movie("喜洋洋與灰太狼");
		m2.setPriceCode(Movie.CHILDREN_MOVIE);
		
		Movie m3 = new Movie("全民募集");
		m3.setPriceCode(Movie.NEW_MOVIE);
		
		//用戶信息
		Customer c1 = new Customer("我贏");
		
		//創建租賃
		Rental r1 = new Rental(m1, 2);
		Rental r2 = new Rental(m2, 3);
		Rental r3 = new Rental(m3, 3);
		
		//給用戶添加租賃
		c1.add(r1);
		c1.add(r2);
		c1.add(r3);
		c1.add(r1);
		
		//打印客戶信息
		c1.printMessage();
	}
}
