package layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MixLayout extends JFrame {
	
	public MixLayout() {
		setTitle("¿©·¯ ·¹ÀÌ¾Æ¿ô È¥ÇÕ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel1 = new JPanel(); //FlowLayout ÀÌ Default ¾ä
		panel1.setBackground(Color.orange);
		
		
		JButton btn1 = new JButton("¹öÆ°1");
		btn1.setBackground(Color.MAGENTA);
		panel1.add(btn1);
		panel1.add(new JButton("¹öÆ°2"));
		panel1.add(new JButton("¹öÆ°3"));
		
		add(panel1,BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel(); //FlowLayout ÀÌ Default ¾ä
		panel2.setLayout(new BorderLayout());
		
		panel2.add(new JButton("Swing"));
		
		add(panel2, BorderLayout.CENTER);
		
		
		
		setSize(300,300);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new MixLayout();
	}

}
