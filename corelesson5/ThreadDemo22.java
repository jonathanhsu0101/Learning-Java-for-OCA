package corelesson5;
public class ThreadDemo22 {
	public static void main(String[] args) {
		/*創建了10個線程，執行了10個任務
		 * 不管有多少任務都交給固定的線程數來執行
		 * 可以讓一個線程去執行多個任務
		 */
		for (int i = 1; i <= 10; i++) {
			final int task = i;
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("任務" + task);
				}
			}).start();
		}
	}
}
