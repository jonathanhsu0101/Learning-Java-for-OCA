/*
 * 訪問權限：private / protected / 默認(不寫) / public
 * 
 * 		1. private 用來修飾成員：該成員只能被類的內部訪問
 */
package chapter6;

public class Demo12
{
	public static void main(String[] args)
	{
		Person12 p = new Person12();
		p.setH(175);
		System.out.println(p.getH());
	}
}

class Person12
{
	/* h, age只能在類的內部訪問，就是在{}之內訪問
	 * 一般來說就是只能通過類的成員函數訪問
	 * 如果類的成員不想在類的外部被直接使用 ---> 可以設成private
	 * ---> 必須通過其他非 private 方法間接訪問
	 */
	private int h, age;

	public int getH()
	{
		return h;
	}

	public void setH(int h)
	{
		this.h = h;
	}
}