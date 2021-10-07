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
		setTitle("�ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//���� ������ ���̾ƿ� ���ֱ�
		setLayout(null);
		
		//���̺� ��ġ
		lbl.setLocation(50, 50);
		lbl.setSize(100,20);
		add(lbl);
		
		//���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		Container contentPane = getContentPane();
		contentPane.addMouseListener(new MyMouseAdapter());
//		contentPane.setFocusable(true);
//		//Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
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

	
	
	
	

