package chapter4;

public class ArrayDemo18 {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,4,5},
				{5,6,7},
				{9,10}
		};
		int[][] b = new int[][] {{1,2,3},{4,5,6}};
		//二維數組的長度就是其中一維數組的個數
		System.out.println(a.length);
		/*   a中有三個一維數組， 
		 *   第一個一維數組的名字叫a[0]
		 *   第二個一維數組的名字叫a[1]
		 */
		
		System.out.println(a[1].length);
		//遍歷第二個一維數組的所有元素
		for (int j = 0; j<a[1].length; j++)
		{
			System.out.print(a[1][j]+"  ");
		}
		System.out.println();
		
		/*
		 * 遍歷二維數組中的所有元素
		 */
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
