package chapter4;

public class StringDemo1 {

	public static void main(String[] args) {
		char a = 'a';
		//表示姓名，需要有多個字符組成，那就是字符串
		
		String name = "張三";
		String name2 = "李四";
		
		String[] names = {"張三", "李四","王五","tom","jim"};
		for (int i = 0; i < names.length; i++)
		{
			System.out.println(names[i]);
		}
		String[][] teamNames = 
			{{"張三","李四","王五"},{"趙六","天七"}};
		for (int i = 0; i < teamNames.length; i++)
		{
			for (int j = 0; j < teamNames[i].length; j++)
			{
				System.out.print(teamNames[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
