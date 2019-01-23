package chapter4;
import java.util.Arrays;
//數組拷貝與擴容  同時進行
public class ArrayDemo12 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		//第一個參數   要擴容和複製的數組
		//a = Arrays.copyOf(a, 2*a.length);
		//下面的copy與Arrays.copyOf等價
		a = copy(a, 2*a.length);
		ArrayDemo7.printArray(a);
		//下面的與ArrayDemo7.printArray(a)等價
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] copy(int[] a, int newLength)
	{
		int[] t = new int[newLength];
		System.arraycopy(a,0,t,0,a.length);
		return t;
	}

}
