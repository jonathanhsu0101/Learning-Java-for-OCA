package corelesson2;

public class User
{
	private String Name;
	private int age;
	public User(){}
	public User(String name, int age)
	{
		super();
		Name = name;
		this.age = age;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
}
