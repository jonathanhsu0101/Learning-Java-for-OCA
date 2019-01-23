package corelesson7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("我的第一個窗體");
		JButton button = new JButton("確定");
		JButton button1 = new JButton("11");
		JButton button2 = new JButton("22");
		JButton button3 = new JButton("33");
		JButton button4 = new JButton("44");
		JButton button5 = new JButton("55");
		JButton button6 = new JButton("66");
		JButton button7 = new JButton("77");
		frame.setSize(300, 300);
		//frame.setResizable(false);
		// 關閉程序自動退出
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		/*frame.setLayout(new FlowLayout());//設置水平布局
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);*///水平布局示範
		/*frame.setLayout(new BorderLayout());
		frame.add(button,BorderLayout.NORTH);
		frame.add(button1,BorderLayout.SOUTH);
		frame.add(button2,BorderLayout.EAST);
		frame.add(button3,BorderLayout.WEST);
		frame.add(button4);*///邊界布局示範
		frame.setLayout(new GridLayout(2,3));
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);//網格布局示範
		frame.setVisible(true);
	}
}
