package chapter4;
//獲取兩個正int類型數組中相同且最大元素
public class ArrayDemo8 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,10,50};
		int[] b = {10,20,5,2,3};
		System.out.println(getTheSameMax(a,b));
	}
	public static int getTheSameMax(int[] a, int[] b)
	{
		int max = 0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				if (a[i] == b[j])
				{
					if (max < a[i])
						max = a[i];
					break;
				}
			}
		}
		return max;
	}

}
