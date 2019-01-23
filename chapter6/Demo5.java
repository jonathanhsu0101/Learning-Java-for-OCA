/*		1.3 方法的重寫
 * 				1.3.1 父類中有一個方法，到子類中被重新實現
 */
package chapter6;

public class Demo5
{
	public static void main(String[] args)
	{
		JavaCourse c = new JavaCourse("Java");
		c.print();
	}
}

class Course
{
	String name;
	Course(String name)
	{
		this.name = name;
	}
	void print()
	{
		System.out.println(name);
	}
}

class JavaCourse extends Course
{

	JavaCourse(String name)
	{
		super(name);
	}
	void print()
	{
		System.out.println("我贏Java課程！");
	}
}