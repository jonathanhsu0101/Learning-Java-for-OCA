package movie.version5;
/*
 * 電影類
 */
public class Movie
{
	private String name;
	private Price price;
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
		switch (this.getPriceCode())
		{
			case Movie.NEW_MOVIE:
				price = new NewMoviePrice();
				break;
			case Movie.CHILDREN_MOVIE:
				price = new ChildrenMoviePrice();
				break;
			case Movie.R_MOVIE:
				price = new RMoviePrice();
				break;
		}
		return price.getPrice(days);
	}
	/**
	 * 計算積分
	 */
	public int getFre(int days)
	{
		return price.getFre(days);
	}
}
