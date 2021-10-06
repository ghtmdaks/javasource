package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {//Thread 랑 관련이 있어
												// Thred는 어려워 그래서 간단하게만
													//  
			
			public void run() {
				try {
					MyFrame frame = new MyFrame(); //객체생성 후
					frame.setVisible(true); //비져블을 안에다 했어
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() { //생성자 와보면
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //엑스눌러서 프로그램 완전 종료
		
		setBounds(100, 100, 450, 300);// (프레임이 뜨는 위치 x, y, 크기 가로, 세로)
		
		contentPane = new JPanel(); //맨위에 new JPnel 선언 후 생성
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2);
		
		JButton btn4 = new JButton("\uBC84\uD2BC4");
		btn4.setBackground(Color.PINK);
		contentPane.add(btn4);
		
		JButton btnNewButton_3 = new JButton("New button");
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
