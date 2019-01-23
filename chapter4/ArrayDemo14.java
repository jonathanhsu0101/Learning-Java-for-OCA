package chapter4;

import java.util.Arrays;

public class ArrayDemo14
{
	public static void main(String[] args)
	{
		int[] a = { 10, 14, 2, 9, 8, 7, 32 };
		System.out.print(Arrays.toString(a));
		System.out.println();
		sort(a);
		System.out.print(Arrays.toString(a));
		System.out.println();
		System.out.println();
		int[] b = { 2, 9, 8, 7, 32 };
		System.out.print(Arrays.toString(b));
		System.out.println();
		sort1(b);
		System.out.print(Arrays.toString(b));
		System.out.println();
	}

	// 冒泡排序法
	public static void sort1(int[] a)
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			for (int j = 0; j < a.length - 1 - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}

	// 選擇排序法
	public static void sort(int[] a)
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] > a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}
}
