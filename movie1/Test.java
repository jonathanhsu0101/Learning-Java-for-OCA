package movie1;

public class Test
{
	public static void main(String[] args)
	{
		final int NEW = 1;
		final int NORMAL = 2;
		final int CHILDREN = 3;
		Movie m1 = new Movie("You've got a mail", NEW);
		Movie m2 = new Movie("Save private Ryan", NORMAL);
		Movie m3 = new Movie("Startrek", CHILDREN);
		
		Movie[] m = new Movie[3];
		m[0] = m1;
		m[1] = m2;
		m[2] = m3;
		
		m1.RentMovie("John", 2);
		m2.RentMovie("John", 3);
		m3.RentMovie("John", 1);
		
		System.out.println("Hi "+"John"+", you have to pay "+getPrice(m, "John", 7)+" dollars.");
		System.out.println("And you also get "+getCredit(m, "John", 7)+" credits.");
	}
	public static int getCredit(Movie[] m, String customer, int date)
	{
		int credit = 0;
		for (Movie mp : m)
		{
			if (mp.customerName.equals(customer))
			{
				int rentDays =  date - mp.rentDate;
				if (mp.movieCatagory == 1 && rentDays > 1)
					credit += 2;
				else
					credit += 1;
			}
		}
		return credit;
	}
	public static double getPrice(Movie[] m, String customer, int date)
	{
		double subtotal = 0;
		for (Movie mp : m)
		{
			if (mp.customerName.equals(customer))
			{
				int rentDays =  date - mp.rentDate;
				switch (mp.movieCatagory)
				{
					case 1:
						subtotal += rentDays * 3;
						break;
					case 2:
						if (rentDays > 2)
							subtotal += (rentDays - 2) * 1.5;
						subtotal += 2;
						break;
					case 3:
						if (rentDays > 3)
							subtotal += (rentDays - 3) * 1.5;
						subtotal += 1.5;
						break;
				}
			}
		}
		return subtotal;
	}
}

