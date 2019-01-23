package lesson3;

public class Demo3 {
	public static void main(String[] args) {
		Question[] qs = new Question[2];
		/*SingleQuestion question1 = new SingleQuestion(1, " 愛情電影是：",
				new String[] { "A.失戀33天", "B.風語者" }, "A");
		MultiQuestion question2 = new MultiQuestion(1, " 戰爭電影是：",
				new String[] { "A.我願意", "B.我們曾經是戰士", "C.風語者" },
				new String[] { "A", "C" });
		qs[0] = question1;
		qs[1] = question2;*/
		qs[0] = new SingleQuestion(1, " 愛情電影是：",
				new String[] { "A.失戀33天", "B.風語者" }, "A");
		System.out.println(qs[0].check(new String[] {"A"}));
		qs[1] = new MultiQuestion(1, " 戰爭電影是：",
				new String[] { "A.我願意", "B.我們曾經是戰士", "C.風語者" },
				new String[] { "B", "C" });
		System.out.println(qs[1].check(new String[] {"B","C"}));
	}
}
