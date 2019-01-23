package hello;

public class faibonachi
{
	public static void main(String[] args)
	{
		int n = 100;
		long sum =2;
		long fiM1 = 1;
		long fiM2 = 1;
		long fi;
		for (int i = 3; i <= n; i++)
		{
			fi = fiM1 + fiM2;
			sum = sum + fi;
			fiM2 = fiM1;
			fiM1 = fi;
		}
		System.out.println(sum);
	}
	//
}
