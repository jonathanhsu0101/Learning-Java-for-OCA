/*
 * 			1.4 動態 binding
 * 					1.4.1 父類的引用可引用任何子類的實例對象
 * 					1.4.2 如果父類引用了子類的實例 --->
 * 								調用方法時，如果方法構成重寫 ---> 就調用子類的方法
 * 								---> 否則調用父類的方法
 * 								這叫做動態綁定 (binding)
 */
package chapter6;

public class Demo7
{
	public static void main(String[] args)
	{
		SingleQuestion question1 = new SingleQuestion(1,
				"最好的視頻就業課程是？", new String[]{"A.我贏教育","B.其他教育"}, "A");
		question1.printQuestion();
		System.out.println(question1.check(new String[]{"A"}));
		SingleQuestion question2 = new SingleQuestion(2,
				"愛情電影是？", new String[]{"A.我們曾經是戰士","B.失戀33天","C.風語者"}, "B");
		question2.printQuestion();
		System.out.println(question2.check(new String[]{"B"}));
		System.out.println("=========================");
		/*Question question = new Question(2, "愛情電影是？",
		  		new String[]{"A.我們曾經是戰士","B.失戀33天","C.風語者"});
		question.printQuestion();
		System.out.println(question.check(new String[]{"A","B"}));*/
		Question question = new  SingleQuestion(2, "愛情電影是？",
				new String[]{"A.我們曾經是戰士","B.失戀33天","C.風語者"}, "B");
		System.out.println(question.check(new String[]{"B"})); //調用子類的方法
	}
}

class SingleQuestion extends Question
{
	private String answer;
	SingleQuestion(int id, String title, String[] options, String answer)
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
class Question
{
	int id;
	String title;
	String[] options;
	Question(int id, String title, String[] options)
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