package movie;

/*
 * 電影類
 */
public class Movie {
	private String name;
	public Movie() {}
	public Movie(String name) {
		this.name = name;
	}
	public static final int NEW_MOVIE = 1;
	public static final int CHILDREN_MOVIE = 2;
	public static final int R_MOVIE = 3;
	private int priceCode; //代表是哪種電影
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	public int getPriceCode() {
		return priceCode;
	}
}
