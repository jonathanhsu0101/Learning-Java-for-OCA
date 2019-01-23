/* 8. 命令行參數：
 * 		運行時，給主函數的參數
 * 		寫法：java 類名 (空格) 參數1 (空格) 參數2 (空格) 參數3
 * 					列出的參數都會傳給main函數的args字串陣列
 */
package chapter5;

public class ClassDemo21
{
	public static void main(String[] args)
	{
		for (int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
