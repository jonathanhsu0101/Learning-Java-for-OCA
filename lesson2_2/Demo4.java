package lesson2_2;

public class Demo4 {
	public static void main(String[] args) {
		Question question = new SingleQuestion(1, " 愛情電影是：",
				new String[] { "A.失戀33天", "B.風語者" }, "A");
		System.out.println(question);
	}
}
