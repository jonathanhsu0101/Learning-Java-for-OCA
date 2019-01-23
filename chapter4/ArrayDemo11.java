package chapter4;

public class ArrayDemo11 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		int[] b = new int[a.length];
		System.arraycopy(a,0,b,0,a.length);
		/*
		 第一個參數  源數組
		 第二個參數  從哪個位置開始
		 第三個參數  目標數組
		 第四個參數  從哪個位置開始
		 第五個參數  拷貝幾個
		 */
		ArrayDemo7.printArray(b);
		int[] c = new int[a.length+1];
		System.arraycopy(a,0,c,0,a.length);
		ArrayDemo7.printArray(c);
	}

}
