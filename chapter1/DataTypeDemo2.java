package chapter1;

public class DataTypeDemo2 {

	public static void main(String[] args) {
		// 直接結尾加上L或l
		long a = 10000000000000000l;
		long b = 10000000000000000L;
		long c = 100;  // 100默認為int
		long timeMills = System.currentTimeMillis();
		System.out.println(timeMills);
	}

}
