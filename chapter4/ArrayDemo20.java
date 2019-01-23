package chapter4;

public class ArrayDemo20 {

	public static void main(String[] args) {
		int[][][] a = {
				{
					{1,2,3},
					{4,5}
				},
				{
					{6,7,8,9,10},
					{11,12},
					{13,14}
				},
				{
					{15,16,17}
				}
		};
		//三維數組的長度是其中二維數組的個數
		System.out.println(a.length);
		
		//a[1] ---> 三維數組中的第二個二維數組
		System.out.println(a[1].length);
		
		int[][] a1 = a[1];  //a[1] 是二維數組
		
		//a中第二個二維數組的第二個一維數組的長度
		System.out.println(a[1][1].length);
		
		//第一個二維數組的第二個一維數組的第二個元素
		System.out.println(a[0][1][1]);
	}
}
