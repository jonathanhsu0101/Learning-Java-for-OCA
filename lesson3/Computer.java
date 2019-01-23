package lesson3;

import java.util.concurrent.SynchronousQueue;

public class Computer {
	public static void main(String[] args) {
		MainBoard mainBoard = new MainBoard(new AMemory(), new ADisplayCard());
		mainBoard.cacheData();
		mainBoard.disp();
		MainBoard mainBoard1 = new MainBoard(new BMemory(), new BDisplayCard());
		mainBoard1.cacheData();
		mainBoard1.disp();
	}
}

class AMemory implements Memory {
	@Override
	public void cache() {
		System.out.println("AMemory cache data .........");
	}
}
class BMemory implements Memory {
	@Override
	public void cache() {
		System.out.println("BMemory cache data .........");
	}
}

class ADisplayCard implements DisplayCard {
	@Override
	public void display() {
		System.out.println("ADisplayCard display ......");
	}
}
class BDisplayCard implements DisplayCard {
	@Override
	public void display() {
		System.out.println("BDisplayCard display ......");
	}
}