package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


	/*ActionListenrt
	 * JButton, JMenuItem, JTextField ������Ʈ�� �̺�Ʈ ����
	 * 
	 * JButton => ���콺�� enter ��ư�� �����ϴ� �Ÿ�  �׼Ǹ����ʰ� ���� �� �� �־�
	 * JMenuItem => �޴� ����
	 * JTextField => Enter Ű �Է�
	 */



public class MyListener1 implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//�׼��� �Ͼ ��ü�� command ������
		System.out.println("e.getActionCommand() " +e.getActionCommand());
		System.out.println("e.getID()" +e.getID());
		
		System.out.println("e.getSource()" +e.getSource());
	
	
	}

}
