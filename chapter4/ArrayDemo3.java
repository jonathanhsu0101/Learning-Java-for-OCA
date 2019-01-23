package chapter4;

public class ArrayDemo3
{
	public static void main(String[] args)
	{
		//等於 int a[] = {1,2,3,4};
		int[] a = {1,2,3,4};  // a 指向了一個數組，數組的內容是1,2,3,4，我們稱 a 引用了一個數組
		int[] b = a;  // b 指向了 a 指向的數組，a 和 b 引用了同一個數組
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
			b[i]++;
		}
		System.out.println();
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		a[3] = 100;
		System.out.println(b[3]);
	}
}
