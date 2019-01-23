package chapter4;

public class ArrayDemo5   //數組倒置
{
	public static void main(String[] args)
	{
		//實現數組倒置：第一個元素和最後一個交換
		//第二個和倒數第二個交換
		// .........
		int[] a = {1,2,3,4,5,6};
		for (int i = 0; i < a.length/2; i++)
		{
			int t = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = t;
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+"  ");
		}
	}
}
