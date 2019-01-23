/*  6. this 引用 ---> 當前對象（的引用）
 * 		6.1 this 在什麼地方
 * 				一個成員函數(非靜態的)訪問另一個成員(非靜態的)
 * 				前面都省略了 this
 * 		6.2 什麼是 this
 * 				當前對象(的引用) ---> 調用這個函數的那個對象(的引用)
 */
package chapter5;

public class ClassDemo12
{
	public static void main(String[] args)
	{
		// this 在哪裡？什麼是 this ？
		Point4 p1 = new Point4(10, 10);
		p1.showLocation();
		
		Point4 p2 = new Point4(20, 20);
		p2.showLocation();
	}
}

class Point4
{
	double x, y;
	Point4 (double a, double b)
	{
		//這些 this 可以省略
		this.x = a;
		this.y = b;
	}
	Point4 () {}
	double getDistance()
	{
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	void showLocation()
	{
		System.out.println("點的座標("+this.x+", "+this.y+")");
	}
}