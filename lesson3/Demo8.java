package lesson3;

public class Demo8 {
	public static void main(String[] args) {
		TestInterface t = new TestInterface();
		t.swim();
		t.song();
		t.fight();
		t.mymethod();
	}
}

interface MyInterface extends CanSwim, CanSong, CanFight {
	void mymethod();
}

class TestInterface implements MyInterface {
	public void swim() {
		System.out.println("swim.....");
	}
	public void song() {
		System.out.println("song.....");
	}
	public void fight() {
		System.out.println("fight.....");
	}
	public void mymethod() {
		System.out.println("mymethod......");
	}
}