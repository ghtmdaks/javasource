package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame implements ActionListener {
	
	private JButton btn1, btn2;
	private JLabel lbl;
	
	public MyFrame2() {
		setTitle("액션이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		btn1 = new JButton("click");
		btn1.addActionListener(this); 
		add(btn1);
		
		lbl = new JLabel("버튼을 누르세오");
		add(lbl);
		
		btn2 = new JButton("click2");
		btn2.addActionListener(this); 
		add(btn2);

		
		setBounds(100, 100, 300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1){
			//System.out.println("버튼이 눌러졌습니다.");
			lbl.setText("1번 버튼 클릭");
		} else if (e.getSource() == btn2) {
			//System.out.println("두번째 버튼이 눌러졌습니다.");
			lbl.setText("2번 버튼 클릭");
		}
	}

}
