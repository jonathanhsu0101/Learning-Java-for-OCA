/*		6.3 this(參數)調用另外一個構造函數，必須放在第一句，且只能調用一次
 * 				案例：寫一個圓類
 * 						圓心是一個點(要用到點類)Pointt
 * 		6.4 以後有類名.this的用法（講內部類的時候會講）
 */
package chapter5;

public class ClassDemo15
{
	public static void main(String[] args)
	{
		Pointt p1 = new Pointt(10, 10);
		Pointt other = new Pointt(5, 5);
		Circle c1 = new Circle(p1, 10);
		System.out.println(c1.contain(other));
		System.out.println(c1.contain(6,6));
		Circle c2 = new Circle(10,10,10);
		System.out.println(c2.contain(20,20));
	}
}

class Circle
{
	Pointt center;
	double r;
	//寫構造函數
	Circle(Pointt center, double r)
	{
		this.center = center;
		this.r = r;
	}
	//創建如下的構造函數重載
	Circle(double x, double y, double r)
	{
	/*	this.center = new Pointt(x,y);
		this.r = r;  可否調用上面的構造函數？ */
		this(new Pointt(x,y), r); //調用重載中的另外一個構造函數，且必須放在第一句
	}
	//寫行為：求面積，求周長，是否包含一個點
	double getArea()
	{
		return 3.14*r*r;
	}
	double getLength()
	{
		return 2*3.14*r;
	}
	//圓是否包含一個點p (p到圓心的距離<=r則在圓內，否則在圓外)
	boolean contain(Pointt p)
	{
		//求p到center的距離
		return center.getDistance(p) <= r;
	}
	boolean contain(double x, double y)
	{
		//return center.getDistance(new Pointt(x,y));
		return this.contain(new Pointt(x,y)); //this也可以省略
	}
}
class Pointt
{
	double x, y;
	Pointt(){}
	Pointt(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	//點到圓心的距離
	double getDistance()
	{
		return Math.sqrt(x*x + y*y);
	}
	//一個點到另外一個點的距離
	double getDistance(Pointt other)
	//思考：這個函數將來要被一個點對象調用
	//				，計算這個點到other點之間的距離
	{
		return Math.sqrt((x - other.x)*(x - other.x) + (y - other.y)*(y - other.y));
	}
}