package chapter4;

import java.util.Arrays;

public class ArrayDemo15 {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		a = insertValue(a, 60);
		System.out.println(Arrays.toString(a));
		System.out.println();
		int[] b = {23, 20, 40, 9, 50, 2};
		sort(b);
		System.out.println(Arrays.toString(b));
	}

	// 數組a已經由小到大排序，插入value後仍是由小到大排序
	public static int[] insertValue(int[] a, int value) {
		a = Arrays.copyOf(a, a.length + 1);
		/*
		 * 從最後一個元素開始和value進行比較，如果比value大， 這些元素都後移， 一直到value大於數組的某個元素，
		 * 那麼說明value就應該放在這個元素之後
		 */
		int i;
		for (i = a.length - 2; i >= 0; i--) {
			if (value < a[i]) {
				a[i + 1] = a[i]; // 後移動
			} else
				break;
		}
		a[i + 1] = value;
		return a;
	}
	
	//插入排序
	public static void sort (int[] a)
	{
		int t, j;
		for (int i = 1; i<a.length; i++)
		{
			t = a[i];
			/* for (j = i-1; j>=0; j--)
			{
				if (t < a[j])
				{
					a[j+1] = a[j];
				}
				else   break;
			}  */
			for ( j = i-1; j>= 0 && t<a[j]; j--)
			{
				a[j+1] = a[j];
			}
			a[j+1] = t;
		}
	}

}
