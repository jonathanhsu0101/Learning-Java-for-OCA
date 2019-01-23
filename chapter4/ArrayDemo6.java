package chapter4;

public class ArrayDemo6
{
	public static void main(String[] args)     // 把數組倒置案例寫成函數
	{
		int[] a = { 1, 2, 3, 4, 5, 6 };
		reverseArray(a); // 當數組作為實質參數進行傳遞時，只要傳遞數組名
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		// 數組已經倒置。函數沒有返回值。
		// 傳遞過去之後形式參數的a和實際參數a都指向同一個數組
		System.out.println("\n===========================");
		
		int[] b = { 10, 20, 30, 40, 50, 60 };
		int[] c = reverseArray1(b);   // 這個函數完全沒有必要有返回值
		System.out.println(b == c);
		for (int i = 0; i < c.length; i++)
		{
			System.out.print(c[i] + " ");
		}
	}

	public static void reverseArray(int[] a)
	{
		// 數組作為形式參數。
		for (int i = 0; i < a.length / 2; i++)
		{
			int t = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = t;
		}
	}

	public static int[] reverseArray1(int[] a)
	{
		// 數組作為形式參數，如何返回數組
		for (int i = 0; i < a.length / 2; i++)
		{
			int t = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = t;
		}
		return a;
	}
}
