package layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// GridLayout : 격자모양

public class GridLayoutTest1 extends JFrame {
	
	public GridLayoutTest1() {
		setTitle("GridLayout 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//레이아웃 변경
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 4, 5, 5));
		
		//버튼 10개 생성
		for (int i = 0; i < 12; i++) {
			JButton btn = new JButton(i+"");
			add(btn);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutTest1();
	}

}
