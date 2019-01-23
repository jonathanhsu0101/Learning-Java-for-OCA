package chapter4;
import java.util.Scanner;

public class ArrayDemo4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int[] a = new int[6];
		int sum = 0;  // 存放和
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("請輸入數組的第"+(i+1)+"個元素");
			a[i] = s.nextInt();
			sum += a[i];
		}
		//求最大值、最小值
		int max = a[0], min = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if (max < a[i])
				max = a[i];
			if (min > a[i])
				min = a[i];
		}
		int avg = sum / a.length;
		System.out.println("最大值："+max+"最小值："+min+"和："+sum+ "平均值："+avg);
		
	}
}
