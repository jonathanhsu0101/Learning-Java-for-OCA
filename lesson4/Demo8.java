package lesson4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo8 {
	public static void main(String[] args) {
		//
	}
}

class A {
	public void test1() throws IOException, ClassNotFoundException {}
}

class B extends A {
	/*@Override
	public void test1()
			throws IOException, ClassNotFoundException, NumberFormatException
	{}*///可以thorws更多的部分只能是 RuntimeException 類型，或其子類
	/*@Override
	public void test1()
	{}*/ // throws 比父類的少，也是OK的
	/*@Override
	public void test1() throws IOException, ClassNotFoundException, CloneNotSupportedException
	{}*/ // 錯誤的，throws了比父類更多類型的異常
}