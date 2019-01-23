package movie1;

public class Movie
{
	String movieName;
	int movieCatagory;
	String customerName;
	int rentDate;
	public Movie(String movieName, int movieCatagory)
	{
		super();
		this.movieName = movieName;
		this.movieCatagory = movieCatagory;
		this.customerName = "";
		this.rentDate = 0;
	}
	public void RentMovie(String customerName, int rentDate)
	{
		this.customerName = customerName;
		this.rentDate = rentDate;
	}
	public void ReturnMovie()
	{
		this.customerName = "";
		this.rentDate = 0;
	}
}
