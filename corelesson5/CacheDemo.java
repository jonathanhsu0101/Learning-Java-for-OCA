package corelesson5;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheDemo
{
	/*
	 * 修改數據時，只能一個線程 但如果是讀數據，所有線程都可以訪問
	 */
	private HashMap<String, String> hm = new HashMap<String, String>();
	private ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();
	private String value = null;
	public String getData(String key)
	{
		/*
		 * value = hm.get(key);
		 *  if(value == null) {
		 *   value = "hello"; //將來是通過其他資源獲取
		 *  hm.put(key, value);
		 *   }
		 *    return value;
		 */
		rrw.readLock().lock();
		try
		{
			value = hm.get(key); // 大家都能來讀
			if (value == null)
			{ // 要進行寫操作
				rrw.readLock().unlock();
				rrw.writeLock().lock(); //大家都能到這裡
				try
				{ //所以一定要加這個，以免都去取資源
					if (value == null)
					{
						value = "hello"; // 取資源
						hm.put(key, value);
					}
				}
				finally
				{
					rrw.writeLock().unlock();
					rrw.readLock().lock();
				}
			}
		}
		finally
		{
			rrw.readLock().unlock();
		}
		return value;
	}
}
