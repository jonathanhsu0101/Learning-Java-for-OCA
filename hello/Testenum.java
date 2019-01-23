package hello;

enum BookType {Business, Computer, Hobby}

public class Testenum
{
	public static void main(String[] args)
	{
		BookType a = BookType.Computer;
		switch (a)
		{
			case Business:
				System.out.println("Business book");
			case Computer:
				System.out.println("Computer book");
			case Hobby:
				System.out.println("Hobby book");
		}
	}
}
