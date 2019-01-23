/*案例：
 *  打印  *******
 *             ******
 *              *****
 *               ****
 *                ***
 *                 **
 *                  *       
 */
package chapter2;

public class ForDemo13
{
	public static void main(String[] args)
	{
		for (int i = 7; i >= 1; i--)
		{
			// 循環體 ---> 若干個空格，若干個*
			for (int j = 1; j <= 7-i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
