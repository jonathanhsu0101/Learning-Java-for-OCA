package chapter4;

import java.util.Arrays;

public class ArrayDemo13
{

	public static void main(
			String[] args)
	{
		int[] a =
		{ 1, 2, 3, 4, 5, 6 };
		a = insertArray(a, 1, 100);
		System.out.println(
				Arrays.toString(a));
	}

	public static int[] insertArray(
			int[] a, int pos, int value)
	{
		// 下標不對，直接返回原數組。以後用異常處理
		if (pos < 0 || pos > a.length)
			return a;

		// 放入一個元素，先要擴容，然後複製
		a = Arrays.copyOf(a,
				a.length + 1);
		for (int i = a.length
				- 1; i > pos; i--)
		{
			a[i] = a[i - 1]; // 後移動
		}
		a[pos] = value;
		return a;
	}
}
