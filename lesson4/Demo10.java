package lesson4;

public class Demo10 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			/* 如果異常是 ArrayIndexOutOfBoundsException 的類型，
			 * 產生的對象就給catch中Exception類型接收了。
			 * 父類的引用引用了子類的實例
			 * 傳遞的信息也是可靠的
			 */
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e); // e.toString(); ---> 異常類型 + message
			e.printStackTrace(); // --> 異常類型 + message 
			// + 異常是在哪個類的哪個方法產生的，怎麼調用的
		}
	}
}
