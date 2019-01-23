package movie.version4;
/*
 * 電影類
 */
public class Movie
{
	private String name;
	public Movie(){}
	public Movie(String name)
	{
		this.name = name;
	}
	public static final int NEW_MOVIE = 1;
	public static final int CHILDREN_MOVIE = 2;
	public static final int R_MOVIE = 3;
	private int priceCode; //代表是哪種電影
	public void setPriceCode(int priceCode)
	{
		this.priceCode = priceCode;
	}
	public int getPriceCode()
	{
		return priceCode;
	}
	public String getName()
	{
		return name;
	}
	/**
	 * 計算價錢
	 */
	public double getPrice(int days)
	{
		double result = 0;
		switch (this.getPriceCode())
		{
			case Movie.NEW_MOVIE:
				result = days * 3;
				break;
			case Movie.CHILDREN_MOVIE:
				if (days <= 3)
					result = 1.5;
				else
					result = (days - 3) * 1.5 + 1.5;
				break;
			case Movie.R_MOVIE:
				if (days <= 3)
					result = 2;
				else
					result = (days - 3) * 2 + 1.5;
				break;
		}
		return result;
	}
	/**
	 * 計算積分
	 */
	public int getFre(int days)
	{
		if (this.getPriceCode() == Movie.NEW_MOVIE && days > 1)
			return 2;
		return 1;
	}
}
