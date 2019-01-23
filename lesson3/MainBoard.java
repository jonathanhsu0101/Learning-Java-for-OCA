package lesson3;

public class MainBoard {
	private Memory memory;
	private DisplayCard displayCard;
	public MainBoard() {}
	public MainBoard(Memory memory, DisplayCard displayCard) {
		this.memory = memory;
		this.displayCard = displayCard;
	}
	public void cacheData() {
		memory.cache();
	}
	public void disp() {
		displayCard.display();
	}
}
