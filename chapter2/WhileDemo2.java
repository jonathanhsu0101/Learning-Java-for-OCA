// 輸入一個整數，要計算其各個數位之和
// 假設輸入 123，計算 1+2+3，其和為 6
/*
 * 假設是1234
 * 先用 %10 取出個位數 4，累加
 * 然後除以 10，再用 %10 取出個位數 3，累加
 * ......
 * 取出 1 ，累加
 * 再除以 10 就為 0，說明已經沒有位數了，結束
 */
package chapter2;
import java.util.Scanner;

public class WhileDemo2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入一個數字：");
		int n = s.nextInt();
		int t = n;
		int sum = 0; // 存放和
		while (t!=0)
		{
			sum = sum + t %10;
			t = t / 10;
		}
		System.out.println(n+" 的各位數之和為："+sum);
	}
}
