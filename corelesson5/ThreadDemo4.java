package corelesson5;

public class ThreadDemo4
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("hello");
			}
		});
		System.out.println(t1.getName());
		t1.setName("線程1");
		System.out.println(t1.getName());
		//獲得當前線程  並打印線程名稱
		System.out.println(Thread.currentThread().getName());
		//如果線程沒有設置優先級，默認是5級，只能是1~10
		System.out.println(t1.getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
	}
}
