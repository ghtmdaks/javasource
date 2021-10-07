package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventTset3 extends JFrame{
	
	private JLabel lbl = new JLabel("HELLO");
	
	public MouseEventTset3() {
		setTitle("텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//현재 설정된 레이아웃 없애기
		setLayout(null);
		
		//레이블 배치
		lbl.setLocation(50, 50);
		lbl.setSize(100,20);
		add(lbl);
		
		//레이블이 포커스를 받을 수 있도록 설정
		Container contentPane = getContentPane();
		contentPane.addMouseListener(new MyMouseAdapter());
//		contentPane.setFocusable(true);
//		//키 입력을 받을 수 있도록 포커스 강제 지정
//		contentPane.requestFocus();
		
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEventTset3();
	}
	
	class MyMouseAdapter extends MouseAdapter{
		
	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		lbl.setLocation(x, y);
		}
	}


}

	
	
	
	

