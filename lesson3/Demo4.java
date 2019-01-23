package lesson3;

public class Demo4 {
	public static void main(String[] args) {
		final int i = 10;
		T t = new T(5);
		T t1 = new T(6);
		
		final M m = new M(10);
		m.setI(1000);
	}
}
class T{
	private final int i;
	public T(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
}
class M{
	private int i;
	public M(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}