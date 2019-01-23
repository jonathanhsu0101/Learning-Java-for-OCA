package chapter4;
//數組的複製、擴容
public class ArrayDemo10 {

	public static void main(String[] args) {
		//有一個數組已經初始化完畢，現在向其下標3插入一個元素100
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		//第一數組插入一個元素，多了一個元素數組是放不下的
		//a[10] = 100;數組下鰾只能到9
		//java.lang.ArrayIndexOutOfBoundsException
		//數組下標越界 (運行時異常)
		
		//先擴容
		int[] b = new int[11];
		//把a的內容複製到b中
		for (int i = 0; i < a.length; i++)
		{
			b[i] = a[i];
		}
		//ArrayDemo7.printArray(b);
		//如果還想使用a可以做
		a = b; //使得a指向b指向的數組
		for (int i = a.length-1; i>3; i--)
		{
			a[i] = a[i-1];
		}
		a[3] = 100;
		ArrayDemo7.printArray(a);
	}

}
