package test;

public class SwitchEx2 {

	public static void main(String[] args) {
		char grade='b';
		
		// A or a => ���ȸ��
		// B or b => �Ϲ�ȸ��
		// �ƹ��͵� ���� => ��ȸ��
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ��");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ��");
			break;	
		default:
			System.out.println("��ȸ��");
			break; //����Ʈ�� �극��ũ�� ���� ����
		}
		
		System.out.println("----------");

		//if~elseif~else
		
		if (grade=='A') {
			System.out.println("���ȸ��");
		}else if (grade=='a') {
			System.out.println("���ȸ��");
		}else if (grade=='B') {
			System.out.println("�Ϲ�ȸ��");
		}else if (grade=='b') {
			System.out.println("�Ϲ�ȸ��");
		}else {
			System.out.println("��ȸ��");
		}
		
		System.out.println("----------");
		
		if (grade=='a' || grade=='A') {
			System.out.println("���ȸ��");
		}else if (grade=='b' || grade=='B') {
			System.out.println("�Ϲ�ȸ��");
		}else {
			System.out.println("�մ�");
		}
	}
}
