package movie.version3;

public class Customer {
	private String name;
	private MyArrayList list = new MyArrayList();
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
	public void add(Rental rental) {
		if (rental == null)
			return;
		if (list.contains(rental))
			return;
		list.add(rental);
	}
	/**
	 * 打印金額、積分情況
	 */
	public void printMessage() {
		double totalPrice = 0;
		int fre = 0;
		Iterator iterator = list.iterator(); //獲取迭代器
		while (!iterator.isDone()) {
			Rental r = (Rental) iterator.getCurrent();
			totalPrice += getPrice(r);
			fre += getFre(r);
			iterator.next();
		}
		System.out.println(this.name + " 您消費的金額是 " + totalPrice);
		System.out.println("您這次獲得的積分是 " + fre);
	}
	/**
	 * 計算積分
	 * 
	 * @param fre
	 * @param r
	 * @return
	 */
	private int getFre(Rental r) {
		if (r.getMovie().getPriceCode() == Movie.NEW_MOVIE && r.getDays() > 1)
			return 2;
		return 1;
	}
	/**
	 * 計算價錢
	 * 
	 * @param result
	 * @param r
	 * @return
	 */
	private double getPrice(Rental r) {
		double result = 0;
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
				if (r.getDays() <= 3)
					result = 2;
				else
					result = (r.getDays() - 3) * 2 + 1.5;
				break;
		}
		return result;
	}
}
