package chapter1;

public class DataTypeDemo6
{
	public static void main(String[] args)
	{
		//自動類型轉換 ---> 小範圍往大範圍
		// byte --> 	short --> 	int 	---->	long --> 	float --> 	double
		// 1字節 --> 	2字節 --> 	4字節 --> 	8字節 --> 	4字節 --> 	8字節
		double d = 10;
		float f1 = 10.2f;
		double d1 = f1;
		byte f2 = 1;
		short f3 = 10;
		
		//強制類型轉換 ---> 大範圍往小範圍
		double d2 = 10.5;
		int a1 = (int)d2;
	}
}
