/*
 * 		2. 包的概念：包是類名的一部分，主要用於命名的管理
 * 			之前寫的類，都沒有聲明包，就是在默認包裡面
 * 			2.1 顯示聲明包  package aa 包對於系統來說就是文件夾
 * 					但是對於 java 來說是類名的一部分
 * 					對於有包的類：1. 編譯，建立包(就是文件夾)，把 .class 丟進去
 * 												2. javac -d . 類名(文件名).java
 * 																-d . 代表在當前目錄下建立包
 * 			2.2 導包：import 包名.類名;  或是  import 包名.*;
 * 			2.3 默認、protected、public
 * 					「默認」可以修飾成員和類 ---> 可以在同一包下直接訪問
 * 						protected 修飾成員 ---> 在同一包中，或者不同包的子類中可以訪問
 * 						 public 修飾成員和類 ---> 在不同包中可以訪問 */
package chapter6;

public class Demo13
{
	public static void main(String[] args)
	{
		//
	}
}
