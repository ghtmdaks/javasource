package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame3 extends JFrame implements ActionListener {
	
	private JButton btn1, btn2;
	
	
	public MyFrame3() {
		setTitle("액션이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lbl = new JLabel("버튼을 누르세오");
		
		btn1 = new JButton("click");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("첫번째 버튼 클릭");
				lbl.setText("첫번째 버튼 클릭");
			}
		}); 
		add(btn1);
		
		//lbl.setText("레이블"); 텍스트 변경 
		add(lbl);
		
		btn2 = new JButton("click2");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("두번째 버튼 클릭");
				lbl.setText("두번째 버튼 클릭");
			}
		}); 
		add(btn2);

		
		setBounds(100, 100, 300, 200);
		setVisible(true);// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		new MyFrame3();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1){
			System.out.println("버튼이 눌러졌습니다.");
		} else if (e.getSource() == btn2) {
			System.out.println("두번째 버튼이 눌러졌습니다.");
		}
	}

}
