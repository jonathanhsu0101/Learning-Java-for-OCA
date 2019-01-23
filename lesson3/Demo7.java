package lesson3;

public class Demo7 {
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.song();
		hero.fight();
		hero.swim();
		System.out.println("--------------------------------------");
		CanSwim cs = new Hero(); // 這時候只會游泳
		cs.swim();
		// cs.song(); //不能調用其他方法
		CanSong csong = new Hero();
		csong.song();
		System.out.println("--------------------------------------");
		hero.walk();
		Personx personx = new Hero();
		personx.walk();
	}
}

abstract class Personx {
	public abstract void walk();
}

class Hero extends Personx implements CanSwim, CanFight, CanSong {
	public void song() {
		System.out.println("singing ....");
	}
	public void fight() {
		System.out.println("fighting ......");
	}
	public void swim() {
		System.out.println("swimming ......");
	}
	public void walk() {
		System.out.println("walking ...");
	}
}

interface CanSwim {
	void swim();
}

interface CanFight {
	void fight();
}

interface CanSong {
	void song();
}