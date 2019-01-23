package chapter4;
//求一個數的因子(包含1也包含自己)，放入數組並返回
class ArrayDemo7 {

	public static void main(String[] args) {
		int[] a = getSons(30);
		printArray(a);
	}
	
	//計算一個數字因子的個數
	public static int getLength(int n)
	{
		int count = 0;
		for (int i = 1; i<=n/2; i++)
		{
			if(n%i == 0)
				count++;
		}
		count++;
		return count;
	}
	
	//求所有因子，放入數組
	public static int[] getSons(int n)
	{
		int[] a = new int[getLength(n)];
		int j = 0;
		for (int i = 1; i <= n/2; i++)
		{
			if (n % i == 0)
				a[j++] = i;
		}
		a[j] = n; //自己也放入
		return a;
	}
	
	//打印數組
	public static void printArray(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
