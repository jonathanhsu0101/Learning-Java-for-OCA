package movie;

public class Customer {
	private String name;
	private Rental[] rs = new Rental[5];
	private int index = 0;
	public Customer() {}
	public Customer(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addRental(Rental rental) {
		rs[index++] = rental;
	}
	/**
	 * 打印金額、積分情況
	 */
	public void printMessage() {
		double totalPrice = 0;
		double result = 0;
		int fre = 0;
		for (int i = 0; i < index; i++)//小於index
		{
			Rental r = rs[i];
			switch (r.getMovie().getPriceCode()) {
				case Movie.NEW_MOVIE:
					result = r.getDays() * 3;
					break;
				case Movie.CHILDREN_MOVIE:
					if (r.getDays() <= 3)
						result = 1.5;
					else
						result = (r.getDays() - 3) * 1.5 + 1.5;
					break;
				case Movie.R_MOVIE:
					if (r.getDays() <= 2)
						result = 2;
					else
						result = (r.getDays() - 2) * 1.5 + 2;
					break;
			}
			totalPrice += result;
			fre++;
			if (r.getMovie().getPriceCode() == Movie.NEW_MOVIE && r.getDays() > 1)
				fre++;
		}
		System.out.println(this.name + " 您消費的金額是 " + totalPrice);
		System.out.println("您這次獲得的積分是 " + fre);
	}
}
