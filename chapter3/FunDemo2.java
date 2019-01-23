/*函數 or 方法
 * 
 * 函數就是一個過程or行為的描述，可以反覆使用(調用)，
 * 並通過某些手段，可以替換你需要改變的數據
 * 
 * 函數的聲明：
 * 			public static 返回值類型	函數名 (形式參數列表)
 * 			{
 * 				//函數體
 * 			}
 * 
 * 返回值類型：
 * 		1. 函數是一個過程的調用，調用這個過程，可以得到一些結果
 * 			如果這些結果是一個具體的數值 (可以用變量接收這個值
 * 			，只能用 return 關鍵字返回) ，那麼返回值類型就是該數值的類型
 * 		2. 例如：兩個整數相加得到另外一個整數，這個過程寫成一個函數
 * 			，必須通過 return 關鍵字返回這個值，那麼返回值類型就是 int
 * 		3. 如果只是一個過程的調用，沒有得到任何數據 (比如只是打印，
 * 			只是執行一個過程) ，那麼返回值類型是 void
 * 
 * 函數名：
 * 		命名習慣：首字母小寫，望文生義，多個單詞組成，駝峰式命名
 * 
 * 形式參數列表 (形參)：
 * 		可以根據用戶需求，在這個功能上需要被代替的數字。
 * 		例如：求兩個數相加，那兩個數呢？任意的，那麼我們就需要用兩個變量來
 * 					代替這兩個任意的數字
 * 		例如：我們要打印一個數字的因子，這個數字是哪個？任意的，我們就需要用
 * 					一個變量來代替這個數字。這個代替就是形式參數
 * 
 * 函數的位置：
 * 		和主函數 (main) 並列
 * 
 * 函數的調用：
 * 		使用的時後直接寫			函數名 (參數 ---> 具體的數值)
 * 
 * 案例1 ：打印一個數字的因子寫成函數
 * 				返回值類型：只是打印，返回值類型為 void
 * 				函數名稱	：printSons
 * 				形式參數	：一個數字，是任意的，可以替換的，用一個變量表示，這個變量
 * 										就代替了這個任意的數字， int a，變量名可以隨意
 * 				public static void printSons (int a)
 * 				{ //函數體 }
 */
package chapter3;
import java.util.Scanner;

public class FunDemo2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入第一個數字：");
		int x1 = s.nextInt();
		// 打印 x1 的因子 ----> 打印因子已經寫成了函數，直接調用即可
		printSons(x1);  // 調用函數printSons
		
		System.out.println("請輸入第二個數字：");
		int x2 = s.nextInt();
		// 打印 x2 的因子 ----> 打印因子，直接調用函數即可
		printSons(x2);

		System.out.println("請輸入第三個數字：");
		int x3 = s.nextInt();
		// 打印 x3 的因子 ----> 直接調用函數即可
		printSons(x3);
	}
	
	public static void printSons(int a)
	{
		//變成了打印 a 的因子
		for (int i = 1; i <= a/2; i++)
		{
			if (a%i ==0)
			{
				System.out.print(i+"  ");
			}
		}
		System.out.println();
	}
}
