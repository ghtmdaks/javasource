package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest1 extends JFrame {
	
	public BorderLayoutTest1(){
		setTitle("BorderLayout �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�⺻ ���̾ƿ� BorderLayout
		JButton btn1 = new JButton("��ư1");
		add(btn1,BorderLayout.EAST); // �������̾ƿ� �����¿� ���
		
		JButton btn2 = new JButton("��ư2");
		add(btn2,BorderLayout.WEST);
		
		JButton btn3 = new JButton("��ư3");
		add(btn3,BorderLayout.CENTER);
		
		JButton btn4 = new JButton("��ư4");
		add(btn4,BorderLayout.SOUTH);
		
		JButton btn5 = new JButton("��ư5");
		add(btn5,BorderLayout.NORTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		BorderLayoutTest1 f = new BorderLayoutTest1();
	}

}