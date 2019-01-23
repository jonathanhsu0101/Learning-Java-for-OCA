package chapter5;

public class ClassDemo14
{
	public static void main(String[] args)
	{
		Personn p1 = new Personn();
		p1.getPersonn().getPersonn().getPersonn().getPersonn().print();
	}
}

class Personn
{
	int h;
	//函數的返回值類型是類名，返回的是該類的對象(的引用)
	Personn getPersonn()
	{
		h++; // 成員函數訪問成員，前面省略了this (相當於 this.h++;)
		return this; // this 是調用這個函數的對象
	}
	void print()
	{
		System.out.println(h);
	}
}