package lesson3;

public class Demo11 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerMethod1();
		System.out.println("===========================");
		/*現在這個成員內部類訪問權限是默認的，那麼在同一包下就可以
		 * 直接訪問，現在我們如何直接創建內部類的對象
		 */
		Outer.Inner inner = outer.new Inner("lisi",40);
		System.out.println(inner);
		inner.innermethod1();
		System.out.println("=============================");
		inner.innermethod2();
	}
}
class Outer{
	String xxx;
	private int i;
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void outerMethod1() {
		//成員函數訪問另外一個成員，只不過這個成員正好是一個類
		Inner inner = new Inner("zhangsan",30);
		System.out.println(inner);
		inner.innermethod1();
	}
	public void outerMethod2() {
		System.out.println("outerMethod2方法的使用");
	}
	/*現在是默認的權限，可以是public、protected等
	 * 這個類的地位等於一個類的普通成員
	 */
	class Inner{  
		private String name;
		private int age;
		public Inner(String name, int age) {
			this.setName(name);
			this.setAge(age);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Inner [name=" + name + ", age=" + age + "]";
		}
		public void innermethod1() {
			System.out.println("innermethod1.....");
		}
		public void innermethod2() {
			System.out.println("調用外部類的成員方法");
			Outer.this.outerMethod2();
			outerMethod2(); //可以省略Outer.this (代表外部類的當前對象)
							//將來在其他一些應用中可能不能省略
			/*在成員內部直接訪問外部類的成員
			 * 等價於一個成員訪問了另一個成員
			 * 一個非靜態的成員訪問另一個非靜態的成員，前面省略了this
			 * 那麼在非靜態成員內部類中，調用外部類的其他非靜態成員，
			 * 是否也省略了this？
			 * 如果直接用this，就指向內部類的當前對象(報錯)。
			 * 如何指定是外部類當前對象呢？---> 外部類的類名.this
			 */
		}
	}
}