package container;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame {

	public FrameTest3() {
		setTitle("MyFrame");
		setSize(300,300);//사이즈 지정 안하면 위에만 떠
		
		//프레임을 닫으면 프로그램 종료
		//원래 x 버튼을 누른다고 해서 프로그램은 종료되지 않고 화면에만 안보여
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		// 프레임 크기에 맞춰서 가운데 정렬 버튼 만들어줘 크기가 일정하게 배치가 돼
		setLayout(new FlowLayout()); 
		
		//컴포넌트 : JBustton, JCheckBox,JRadio...
		JButton btn1 = new JButton("버튼1");
		add(btn1); // 보더레이아웃 상하좌우 가운데
		
		JButton btn2 = new JButton("버튼2");
		add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		add(btn4);
		
		JButton btn5 = new JButton("버튼5");
		add(btn5);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		FrameTest3 f = new FrameTest3();
		
	}
}
