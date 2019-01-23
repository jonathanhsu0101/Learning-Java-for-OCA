package chapter4;

public class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[] a; // 聲明了一個int數組
		// 若直接用 a = {1,2,3,4,5,6} 賦值會報錯
		a = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println("=======================================");
		
		int[] b = new int[6]; //開闢了一個數組空間大小是6，沒有賦值，默認值是0
		b[0] = 1;
		b[1] = 2;
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+"  ");
		}
	}
}
