package lesson3;

import java.util.Arrays;

public class MultiQuestion extends Question {
	private String[] answers;
	public MultiQuestion(int id, String title, String[] options, String[] answers) {
		super(id, title, options);
		this.answers = answers;
	}
	@Override
	public boolean check(String[] answers) {
		Arrays.sort(answers);
		return Arrays.equals(this.answers, answers);
	}
}
