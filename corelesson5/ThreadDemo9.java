package corelesson5;

public class ThreadDemo9
{
	public static void main(String[] args)
	{
		Data data = new Data();
		// 數據共享的問題
		Thread t1 = new Thread(data);
		Thread t2 = new Thread(data);
		t1.start();
		t2.start();
	}
}

class Data implements Runnable
{
	private int i;
	@Override
	public void run()
	{
		int h;
		for (int j = 1; j <= 10; j++)
		{
			synchronized (this)
			{ //同步塊保證一段代碼只能同時被一個線程訪問
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
			} //出同步塊就會釋放鎖的鑰匙
			System.out.println(""+i+"   "+Thread.currentThread().getName());
		}
	}
}