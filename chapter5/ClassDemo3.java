/*  點類：
 * 				相同的屬性：x, y
 * 				相似的行為：到圓心的距離
 * 										顯示點的座標位置
 * 
 * 		屬性和行為，誰先誰後，都沒有關係
 * 		每個屬性和行為的地位都是並列的，不分先後
 */
package chapter5;

public class ClassDemo3
{
	public static void main(String[] args)
	{
		Point1 p1 = new Point1();
		p1.x = 10;
		p1.y = 10;
		System.out.println(p1.getDistance());
		p1.showLocation();
	}
}

class Point1
{
	double x, y;
	double getDistance()
	{
		return Math.sqrt(x*x + y*y);
	}
	void showLocation()
	{
		System.out.println(x+", "+y);
	}
}