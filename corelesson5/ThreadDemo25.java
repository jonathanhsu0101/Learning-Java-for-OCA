package corelesson5;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo25 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("hello");
			}
		}).start();
		ExecutorService threadPool =
				Executors.newSingleThreadScheduledExecutor();
		threadPool.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("bye-bye");
			}
		});
		/*
		 * 我們前面遇到的執行任務都是用run方法來實現的
		 * run 方法是沒有返回值的。
		 * 我們並不知道線程什麼時候執行結束
		 * 如果線程執行玩了能返回一個值，
		 * 那麼我們就知道線程已經結束了
		 * java5 中提供了線程執行任務，
		 * 任務執行返回具體的值
		 */
		threadPool.shutdown();
		System.out.println("==============================");
		ExecutorService threadPool1 =
				Executors.newSingleThreadExecutor();
		/*Callable<T>   泛型的具體類型就是返回值的類型
		 * 也決定了 Future的泛型類型
		 */
		Future<Integer> future =
				threadPool1.submit(new Callable<Integer>() {
					@Override
					//call()是任務
					public Integer call() throws Exception {
						System.out.println("任務開始");
						Thread.sleep(1000);
						System.out.println("任務結束");
						return 10;
					}
				});
		int value = 0;
		try {
			value = future.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(value);
	}
}
