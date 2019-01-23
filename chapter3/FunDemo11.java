/*
 *  數列 1,1,2,3,5,8,13,21,34, ....... 求第n項
 */
package chapter3;

public class FunDemo11
{
	public static void main(String[] args)
	{
		System.out.println(getNData(8));
	}
	
	public static int getNData(int n)
	{
		if (n==1 || n==2)
			return 1;
		return getNData(n-1) + getNData(n-2);
	}
}
