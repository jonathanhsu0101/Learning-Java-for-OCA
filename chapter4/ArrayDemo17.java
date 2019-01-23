package chapter4;
import java.util.Arrays;
import java.util.Random;

public class ArrayDemo17 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] a = new int[100000];
		for (int i = 0; i < a.length; i++)
		{
			//隨機賦值
			a[i] = r.nextInt();  //獲取一個隨機的整數
		}
		//獲得從1970開始到現在的毫秒數
		long start = System.currentTimeMillis();
		Arrays.sort(a);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		for (int i = 0; i < a.length; i++)
		{
			//隨機賦值
			a[i] = r.nextInt();  //獲取一個隨機的整數
		}
		start = System.currentTimeMillis();
		ArrayDemo14.sort(a);  //冒泡排序
		end = System.currentTimeMillis();
		System.out.println(end - start);
		
		for (int i = 0; i < a.length; i++)
		{
			//隨機賦值
			a[i] = r.nextInt();  //獲取一個隨機的整數
		}
		start = System.currentTimeMillis();
		ArrayDemo15.sort(a);  //插入排序
		end = System.currentTimeMillis();
		System.out.println(end - start);
		
	}

}
