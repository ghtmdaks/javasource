package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


	/*ActionListenrt
	 * JButton, JMenuItem, JTextField 컴포넌트의 이벤트 담장
	 * 
	 * JButton => 마우스나 enter 버튼을 선택하는 거를  액션리스너가 감지 할 수 있어
	 * JMenuItem => 메뉴 선택
	 * JTextField => Enter 키 입력
	 */



public class MyListener1 implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//액션이 일어난 객체의 command 가져옴
		System.out.println("e.getActionCommand() " +e.getActionCommand());
		System.out.println("e.getID()" +e.getID());
		
		System.out.println("e.getSource()" +e.getSource());
	
	
	}

}
