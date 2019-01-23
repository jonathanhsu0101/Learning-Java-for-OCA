package corelesson5;

public class ThreadDemo1
{
	public static void main(String[] args)
	{
		A a = new A();
		Thread t1 = new Thread(a);
		t1.start(); //啟動線程
		//主函數本身是一個線程，習慣稱為主線程
		for(;;)
			System.out.println("world");
		/*
		 * 觀察運行結果，兩個線程同時運行
		 * 其實t1和main切換運行
		 * cpu在同時只運行一個線程 (看起來所有線程
		 * 同時運行，其實是線程在切換，肉眼
		 * 感覺很多線程在同時運行，因為
		 * 肉眼感覺的時間對cpu來說已經很長了
		 */
	}
}

class A implements Runnable
{
	@Override
	public void run()  // 線程要執行的任務
	{
		for (;;)
			System.out.println("hello");
	}
}