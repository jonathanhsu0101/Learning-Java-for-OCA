package lesson2_1;

public class Demo12 {
	public static void main(String[] args) {
		Person12 p1 = new Person12();
		p1.setH(175);
		System.out.println(p1.getH());
	}
}
class Person12{
	private int h, age;
	/*
	 * h, age只能在類的內部訪問，就是類所對應的{}
	 * 類中有成員，一般來說就是只能通過類的成員函數訪問
	 * 如果類的成員不想在類的外部直接被使用，可以設置成private
	 * 通過其他非private的方法間接訪問
	 */
	void setH(int h) {
		this.h = h;
	}
	int getH() {
		return h;
	}
}