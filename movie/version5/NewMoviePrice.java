package movie.version5;

public class NewMoviePrice extends Price
{
	public double getPrice(int days)
	{
		return 3 * days;
	}
	public int getFre(int days)
	{
		if (days > 1)
			return 2;
		return 1;
	}
}
