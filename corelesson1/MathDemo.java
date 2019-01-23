package corelesson1;

public class MathDemo
{
	public static void main(String[] args)
	{
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));
		System.out.println(Math.floor(10.3));//捨
		System.out.println(Math.floor(10.5));
		System.out.println(Math.round(10.3));//四捨五入
		System.out.println(Math.round(10.5));
		System.out.println(Math.ceil(10.3));//入
		System.out.println(Math.ceil(10.5));
		
		System.out.println(Math.max(1000, 100));
		
		System.out.println(Math.random());//隨機值
		int a = (int)(Math.random()*100);
		System.out.println(a);
	}
	//
}
