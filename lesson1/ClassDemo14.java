package lesson1;

public class ClassDemo14 {
	public static void main(String[] args) {
		Person14 p1 = new Person14();
		p1.getPerson().getPerson().getPerson().getPerson().print();
		System.out.println(p1.h);
	}
}
class Person14{
	int h;
	//看到函數的返回值類型是類名，那麼返回的是該類的對象(的引用)
	Person14 getPerson() {
		h++;//成員函數訪問成員前面省略了this 等於 this.h++;
		return this;//this是調用這個函數的那個對象
	}
	void print() {
		System.out.println(h);
	}
}