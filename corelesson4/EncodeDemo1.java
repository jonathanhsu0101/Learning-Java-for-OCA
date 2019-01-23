package corelesson4;

public class EncodeDemo1 {
	public static void main(String[] args) {
		// java語言內部規定一個字符占兩個字節，不管是中文還是英文
		String s = "ABC沃";
		byte[] b = s.getBytes(); // 默認會用項目的編碼進行轉換 ---> UTF-8
		for (byte c : b) {
			System.out.print(Integer.toHexString(c & 0xFF) + " ");
		}
		System.out.println();
		System.out.println("=============================");
		try {
			byte[] b1 = s.getBytes("utf-8");
			// UTF-8 編碼中，英文占用一個字節，中文占用3個字節
			for (byte c : b1) {
				System.out.print(Integer.toHexString(c & 0xFF) + " ");
			}
			System.out.println("\n============================");
			byte[] b2 = s.getBytes("GBK");
			// GBK 編碼中，英文占用一個字節，中文占用2個字節
			for (byte c : b2) {
				System.out.print(Integer.toHexString(c & 0xFF) + " ");
			}
			System.out.println("\n============================");
			byte[] b3 = s.getBytes("UTF-16BE");
			// UTF-16BE 編碼中，英文占用2個字節，中文占用2個字節
			// 也是 java 內部的編碼
			for (byte c : b3) {
				System.out.print(Integer.toHexString(c & 0xFF) + " ");
			}
			System.out.println("\n============================");
			// String ss = new String(b1); //默認項目編碼
			String ss = new String(b1, "UTF-8");
			System.out.println(ss);
			System.out.println("\n============================");
			String ss1 = new String(b1, "GBK"); // 會亂碼
			System.out.println(ss1);
			String ss2 = new String(b2); // 會亂碼
			System.out.println(ss2);
			String ss3 = new String(b2, "GBK"); // 用對編碼，會正常
			System.out.println(ss3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//
}
