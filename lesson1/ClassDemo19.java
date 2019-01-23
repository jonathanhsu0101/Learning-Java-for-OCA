package lesson1;

public class ClassDemo19 {
	static {
		System.out.println("hello world");
		System.exit(0);//退出程序
	}//靜態塊
	//主函數本身就是靜態的成員函數
	public static void main(String[] args) {
		//靜態塊不一定是在創建對象的時候加載，是在第一次用到類就加載，並且只加載一次
		Person19.printData();
	}
}
class Person19{
	double h = 175;
	//static int diqiu = 1; //靜態定義初始化
	static int diqiu;
	static {
		diqiu = 1;
		System.out.println("static...");
	}
	static void printData() {
		System.out.println(diqiu);
		//System.out.println(h); 錯誤，靜態成員函數只能訪問靜態成員
	}
}