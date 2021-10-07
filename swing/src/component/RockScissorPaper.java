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
      setTitle("가위바위보 게임");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //현재 contentPane 가져오기
      Container contentPane = getContentPane();
      
      
      //상단 메세지 출력
      JLabel label = new JLabel("아래의 버튼중에서 하나를 클릭하시오");
      label.setFont(new Font("굴림",Font.BOLD,18));
      contentPane.add(label,BorderLayout.NORTH);
      
      //가운데 이미지 출력
      //JPanel 을 센터에 부착 => JPanel 그리드 레이아웃으로 변경 => 버튼 3개 만들어서 부착
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
      
      
      //하단 결과 출력
      textField = new JTextField();
      textField.setFont(new Font("굴림",Font.BOLD,18));
      contentPane.add(textField,BorderLayout.SOUTH);
      
      
      pack();
      setVisible(true);
      
   }
   
   
   public static void main(String[] args) {
      new RockScissorPaper();
   }
   
   
   
   @Override
   public void actionPerformed(ActionEvent e) {
      // 게임자가 누른 가위,바위,보 가져오기
	   String cmd = e.getActionCommand(); // rock, paper, scissor 
      // 컴퓨터의 가위,바위,보 결정   
      int computer = (int)(Math.random()*3); //0,1,2 중에서 하나가 나올거야
	   System.out.println(computer);
	   
	   
	   
      // 컴퓨터와 게임자 사이에서 누가 이겼는지 출력
	   if(cmd.equals("rock")) {// 사용자가 주먹을 낸 경우
		   if(computer==ROCK) {
			   textField.setText("비김. 다시");
		   } else if(computer == SCISSOR) {
			   textField.setText("내가 이김");
		   } else {
			   textField.setText("컴퓨터가 이김");
		   }   
	   } else if(cmd.equals("scissor")) {// 사용자가 가위를 낸 경우
		   if(computer==ROCK) {
			   textField.setText("컴퓨터가 이김");
		   } else if(computer == SCISSOR) {
			   textField.setText("비김. 다시");
		   } else {
			   textField.setText("내가 이김");
		   }   
	   } else {// 사용자가 보자기를 낸 경우
		   if(computer==ROCK) {
			   textField.setText("내가 이김");
		   } else if(computer == SCISSOR) {
			   textField.setText("컴퓨터가 이김");
		   } else {
			   textField.setText("비김. 다시");
		   }   
	   }
	   
   }

}
