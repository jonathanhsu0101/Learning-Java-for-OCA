/*	7.4 靜態的成員方法
 * 		可以用「對象.」訪問（不提倡），
 * 		提倡用「類名.」訪問
 * 		靜態的成員方法只能訪問靜態的成員。
 */
package chapter5;

public class ClassDemo18
{
	public static void main(String[] args)
	{
		Test.f(); //靜態方法可以用「對象.」調用（不提倡）
		          //也可以用「類名.」調用
	}
}

class Test
{
	static int i;
	static
	{
		i = 11;
		System.out.println("hello");
	} //上面相當於寫了 static int i = 11;
	static void f()
	{
		System.out.println("world");
		
	}
}