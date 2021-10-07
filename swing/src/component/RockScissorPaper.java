package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaper extends JFrame implements ActionListener {
   
   private JTextField textField;
   private JButton btnR,btnS,btnP;
   
   static final int ROCK = 0;
   static final int PAPER = 1;
   static final int SCISSOR = 2;
   
   public RockScissorPaper() {
      setTitle("���������� ����");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //���� contentPane ��������
      Container contentPane = getContentPane();
      
      
      //��� �޼��� ���
      JLabel label = new JLabel("�Ʒ��� ��ư�߿��� �ϳ��� Ŭ���Ͻÿ�");
      label.setFont(new Font("����",Font.BOLD,18));
      contentPane.add(label,BorderLayout.NORTH);
      
      //��� �̹��� ���
      //JPanel �� ���Ϳ� ���� => JPanel �׸��� ���̾ƿ����� ���� => ��ư 3�� ���� ����
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(0,3));
      contentPane.add(panel,BorderLayout.CENTER);
      
      btnR = new JButton();
      btnR.setIcon(new ImageIcon(RockScissorPaper.class.getResource(("/component/rock.png"))));
      btnR.setActionCommand("rock");
      btnR.addActionListener(this);
      panel.add(btnR);
      
      btnP = new JButton();
      btnP.setIcon(new ImageIcon(RockScissorPaper.class.getResource(("/component/paper.png"))));
      btnP.setActionCommand("paper");
      btnP.addActionListener(this);
      panel.add(btnP);
      
      btnS = new JButton();
      btnS.setIcon(new ImageIcon(RockScissorPaper.class.getResource(("/component/scissor.png"))));
      btnS.setActionCommand("scissor");
      btnS.addActionListener(this);
      panel.add(btnS);
      
      
      contentPane.add(panel,BorderLayout.CENTER);
      
      
      //�ϴ� ��� ���
      textField = new JTextField();
      textField.setFont(new Font("����",Font.BOLD,18));
      contentPane.add(textField,BorderLayout.SOUTH);
      
      
      pack();
      setVisible(true);
      
   }
   
   
   public static void main(String[] args) {
      new RockScissorPaper();
   }
   
   
   
   @Override
   public void actionPerformed(ActionEvent e) {
      // �����ڰ� ���� ����,����,�� ��������
	   String cmd = e.getActionCommand(); // rock, paper, scissor 
      // ��ǻ���� ����,����,�� ����   
      int computer = (int)(Math.random()*3); //0,1,2 �߿��� �ϳ��� ���ðž�
	   System.out.println(computer);
	   
	   
	   
      // ��ǻ�Ϳ� ������ ���̿��� ���� �̰���� ���
	   if(cmd.equals("rock")) {// ����ڰ� �ָ��� �� ���
		   if(computer==ROCK) {
			   textField.setText("���. �ٽ�");
		   } else if(computer == SCISSOR) {
			   textField.setText("���� �̱�");
		   } else {
			   textField.setText("��ǻ�Ͱ� �̱�");
		   }   
	   } else if(cmd.equals("scissor")) {// ����ڰ� ������ �� ���
		   if(computer==ROCK) {
			   textField.setText("��ǻ�Ͱ� �̱�");
		   } else if(computer == SCISSOR) {
			   textField.setText("���. �ٽ�");
		   } else {
			   textField.setText("���� �̱�");
		   }   
	   } else {// ����ڰ� ���ڱ⸦ �� ���
		   if(computer==ROCK) {
			   textField.setText("���� �̱�");
		   } else if(computer == SCISSOR) {
			   textField.setText("��ǻ�Ͱ� �̱�");
		   } else {
			   textField.setText("���. �ٽ�");
		   }   
	   }
	   
   }

}
