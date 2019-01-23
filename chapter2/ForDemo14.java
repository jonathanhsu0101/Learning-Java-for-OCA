/*案例：打印
 *                  *       
 *                ***
 *              *****
 *            *******
 *          *********
 *        ***********
 *          *********
 *            *******
 *              *****
 *                ***
 *                  *       
 */
package chapter2;

public class ForDemo14
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 7; i++)
		{
			// 循環體 ---> 若干個空格，若干個*
			for (int j = 1; j <= 7-i; j++)
			{
				System.out.print("  "); //空格遞減，i 遞增
			}
			for (int k = 1; k <= i*2-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 6; i >= 1; i--)
		{
			for (int j = 1; j <= 7-i; j++)
			{
				System.out.print("  "); //空格遞增
			}
			for (int k = 1; k <= i*2-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
