package chapter4;

//打印a, b 的最大公約數和最小公倍數
public class ArrayDemo9 {

	public static void main(String[] args) {
		print(10,15);
		print(7,9);
	}
	
	public static void print(int a, int b)
	{
		//得到a的公約數
		int[] x1 = ArrayDemo7.getSons(a);  //呼叫getSons();
		ArrayDemo7.printArray(x1);
		//得到b的公約數
		int[] x2 = ArrayDemo7.getSons(b);
		ArrayDemo7.printArray(x2);
		//找出相同且最大的元素就是最大公約數
		int max = ArrayDemo8.getTheSameMax(x1, x2);
		//最小公倍數 = a * b /最大公約數
		int min = a * b / max;
		System.out.println(a+","+b+"的最大公約數是:"+max+", 最小公倍數是:"+min);
	}

}
