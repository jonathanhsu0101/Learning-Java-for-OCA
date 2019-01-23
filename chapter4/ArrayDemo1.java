package chapter4;

public class ArrayDemo1
{
	public static void main(String[] args)
	{
		//聲明並初始化
		int[] scores = {98,76,88,90,67,64,87};
		//如何訪問第一個元素 score[0],   scores[1],   scores[2];
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		//數組的長度  --->  數組有個length屬性
		System.out.println(scores.length);
		//遍歷數組所有的元素
		for (int i = 0; i < scores.length; i++)
		{
			System.out.println(scores[i]);
		}
	}
}
