package corelesson5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo23 {
	public static void main(String[] args) {
		//創建了一個固定(3)線程數的線程池
		//		ExecutorService threadPool =
		//				Executors.newFixedThreadPool(3);
		//創建了單一線程的線程池	
		//		ExecutorService threadPool =
		//				Executors.newSingleThreadExecutor();
		ExecutorService threadPool =
				Executors.newCachedThreadPool();	
		for (int i = 1; i <= 10; i++) {
			final int task = i;
			threadPool.execute(new Runnable() {
				@Override
				public void run() {
					for (int j = 1; j <= 10; j++) {
						System.out.println(Thread
								.currentThread()
								.getName() + "執行第"
								+ task + "個任務的第" + j
								+ "次循環");
					}
				}
			});
		}
		threadPool.shutdown();
	}
}
