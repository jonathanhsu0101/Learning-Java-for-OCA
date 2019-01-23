package corelesson5;

public class ThreadDemo10
{
	public static void main(String[] args)
	{
		Data1 data = new Data1();
		// 數據共享的問題
		Thread t1 = new Thread(data);
		Thread t2 = new Thread(data);
		t1.start();
		t2.start();
	}
}

class Data1 implements Runnable
{
	private int i;
	@Override
	public  synchronized void run()
	{
		int h;
		for (int j = 1; j <= 10; j++)
		{
				h = i + 1;
				try
				{
					Thread.sleep(300);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				i = h;
			System.out.println(""+i+"   "+Thread.currentThread().getName());
		}
	}
}