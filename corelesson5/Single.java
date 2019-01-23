package corelesson5;

public class Single
{
	private static Single instance = null;
	private Single(){}
	/**
	 * 多線程併發的情況下，還能保證單例嗎？
	 * @return
	 */
	public synchronized static Single getInstance()
	{ //加上 synchronized 就行了
		if(instance == null)
		{
			instance = new Single();
		}
		return instance;
	}
}
