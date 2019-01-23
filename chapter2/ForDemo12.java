/*案例：打印下列三角形
 *         *
 *         **
 *         ***
 *         ****
 *         *****
 *         ******
 *  嵌套循環可以控制行列
 *      外層循環控制行，內層循環控制列
 *      外層循環結束前自己換行
 *      內外層的控制變量有一定的關係
 */
package chapter2;

public class ForDemo12
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 6; i++)
		{
			// 循環體
			for (int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
