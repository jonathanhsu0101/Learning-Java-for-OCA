package lesson4;

public class Demo7 {
	public static void main(String[] args) {
		try {
			PersonA pa = new PersonA();
			pa.setAge(10000);
			System.out.println(pa.getAge());
		} catch (Exception e) {
			System.out.println("年齡範圍不正確");
		}
	}
}

class PersonA {
	private int age;
	/*
	 * setAge 方法寫完之後，是給別人去調用
	 * 所以我想讓調用者去處理該異常
	 * 這樣自己可以不處理，但是現在的情況
	 * 自己不處理，程序編譯不通過
	 * 那麼 java 提供了另外一種機制叫 throws
	 * 迴避異常，自己可以通過編譯
	 * 並告知使用者可能會有那些異常產生
	 * 
	 */
	public void setAge(int age) throws Exception {
		if (age < 0 || age > 120)
			throw new Exception();
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}