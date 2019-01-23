package corelesson2;

public class Office
{
	public static void main(String[] args)
	{
		try
		{
			//獲取類類型，也是動態加載類，在運行中加載
			Class c = Class.forName(args[0]);
			//創建類的對象
			OfficeAble oa = (OfficeAble)c.newInstance();
			//調用方法
			oa.start();
		}
		catch (Exception e)
		{
		}
	}
	//
}
