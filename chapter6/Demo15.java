/*
 * 開發工具 eclipse (綠色、開源)
 * 1. 解壓、選擇工作目錄
 * 2. file --> new --> project --> Java Project (Java --> Java Project) --> 輸入項目名稱(英文) --> finish
 * 3. 如果不小心關了視圖
 * 		window --> show view --> 選你要的視圖
 * 4. 注意項目建立完成後，在項目管理視圖中，項目下有 src 目錄
 * 		src 目錄就是建立我們的類的目錄
 * 		直接右鍵 src --> new --> class 填寫類名
 * 		運行：右鍵帶主函數的類 Run As --> Run application 
 * 	5. 默認最常用的快捷鍵 alt+/ 自動提示的功能
 * 		main alt+/
 * 		System.out.println()  --->  打 syso + alt + /
 * 
 * 		更改快捷鍵 window --> Preferences --> General
 * 		--> keys --> 找 Content Assist --> 添加自設快捷鍵
 * 		檢查快捷鍵  window --> Preferences --> General
 * 		--> keys --> 查找快捷鍵(例如 alt+/) --> Unbind command
 * 
 * 6. 學會建立包，包下建立類，直接在包中右鍵 --> new --> class
 * 
 * 7. 我們直接運行，並沒有編譯，eclipse自動幫我們編譯
 * 		編譯後的 .class 在工作目錄下的項目下的 bin 目錄
 * 
 * 8. 導入項目
 * 		file --> import --> General --> 雙擊 Existing Project.....
 * 		--> 選擇項目 browse --> Finish
 */
package chapter6;

import java.util.Arrays;

public class Demo15
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(a));
	}
}
