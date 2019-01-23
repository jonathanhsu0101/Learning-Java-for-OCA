package movie.version5;

public class Customer
{
	private String name;
	private MyArrayList list = new MyArrayList();
	private int index = 0;
	public Customer(){}
	public Customer(String name)
	{
		super();
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void add(Rental rental)
	{
		if (rental == null)
			return;
		if (list.contains(rental))
			return;
		list.add(rental);
	}
	/**
	 * 打印金額、積分情況
	 */
	public void printMessage()
	{
		double totalPrice = 0;
		int fre = 0;
		Iterator iterator = list.iterator(); //獲取迭代器
		while(! iterator.isDone())
		{
			Rental r = (Rental)iterator.getCurrent();
			totalPrice += r.getMovie().getPrice(r.getDays());
			fre += r.getMovie().getFre(r.getDays());
			iterator.next();
		}
		System.out.println(this.name+" 您消費的金額是 "+totalPrice);
		System.out.println("您這次獲得的積分是 "+fre);
	}
}
