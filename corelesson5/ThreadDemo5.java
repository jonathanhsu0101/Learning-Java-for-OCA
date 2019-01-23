package corelesson5;

public class ThreadDemo5
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					Thread.sleep(10000);
				}
				catch (InterruptedException e)
				{
					System.out.println(
							Thread.currentThread().getName() + "線程sleep中斷");
				}
				System.out.println("helloworld");
			}
		});
		t1.start();
		for (int i = 1; i <= 10; i++)
		{
			try
			{
				Thread.sleep(300);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(i);
		}
		t1.interrupt();
	}
}
