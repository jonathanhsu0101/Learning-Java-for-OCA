/*
 *  			1.5 對象數組
 */
package chapter6;

import java.util.Arrays;

public class Demo10
{
	public static void main(String[] args)
	{
		SingleQuestion10 question1 = new SingleQuestion10(1,
				"最好的視頻就業課程是？", new String[]{"A.我贏教育","B.其他教育"}, "A");
		SingleQuestion10 question3 = new SingleQuestion10(2,
				"愛情電影是？", new String[]{"A.失戀33天","B.風語者"}, "A");
		MultiQuestion10 question2 = new MultiQuestion10(3,"我贏有那些課程？",
				new String[]{"A.我贏java","B.我贏c++"}, new String[]{"A","B"});
		question2.printQuestion();
		System.out.println(question2.check(new String[]{"A","B"}));
		System.out.println("===============================");
		SingleQuestion10[] questions = new SingleQuestion10[]{question1, question3};
		for (int i = 0; i < questions.length; i++)
		{
			questions[i].printQuestion();
		}
		System.out.println("===============================");
		System.out.println("===============================");
		//現在要出三個題目：既有單選題又有多選題
		Question10[] qs = new Question10[]{question1, question3, question2};
		//父類可以引用子類的實例
		//Question類的引用，既可以引用SingleQuestion的實例，也可以引用MultiQuestion的實例
		for (Question10 q : qs)
		{
			q.printQuestion();
			System.out.println(q.check(new String[]{"A"}));
			//如果引用的是SingleQuestion，調用的就是SingleQuestion的check方法
			//如果引用的是MultiQuestion，調用的就是MultiQuestion的check方法
		}
	}
}

class MultiQuestion10 extends Question10
{
	String[] answers;
	MultiQuestion10(int id, String title, String[] options, String[] answers)
	{
		super(id, title, options);
		this.answers = answers;
		}
	boolean check(String[] ans)
	{
		Arrays.sort(ans);
		return Arrays.equals(this.answers, ans);
	}
	
}
class SingleQuestion10 extends Question10
{
	private String answer;
	SingleQuestion10(int id, String title, String[] options, String answer)
	{
		super(id, title, options);
		this.answer = answer;
	}
	boolean check(String[] ans)
	{
		if (ans.length != 1)
			return false;
		return ans[0].equals(answer);
	}
}
class Question10
{
	int id;
	String title;
	String[] options;
	Question10(int id, String title, String[] options)
	{
		this.id = id;
		this.title = title;
		this.options = options;
	}
	void printQuestion()
	{
		System.out.println(id+" ."+title);
		for (int i = 0; i < options.length; i++)
		{
			System.out.println(options[i]);
		}
	}
	boolean check(String[] ans)
	{
		return false; //模擬
	}
}