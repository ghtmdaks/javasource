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
		
		EventQueue.invokeLater(new Runnable() {//Thread �� ������ �־�
												// Thred�� ����� �׷��� �����ϰԸ�
													//  
			
			public void run() {
				try {
					MyFrame frame = new MyFrame(); //��ü���� ��
					frame.setVisible(true); //�������� �ȿ��� �߾�
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() { //������ �ͺ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���������� ���α׷� ���� ����
		
		setBounds(100, 100, 450, 300);// (�������� �ߴ� ��ġ x, y, ũ�� ����, ����)
		
		contentPane = new JPanel(); //������ new JPnel ���� �� ����
		
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
