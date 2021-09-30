// ���ǹ� => if/switch
// ������ => ���� ������
//			>, <,	>=....
//			&&(and), ||(or)


package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ����(1), ����(2), ��(3)
		// ���� = ��ǻ��
		// ���� 1~3 �ڵ����� ���� => 3
		int com = (int)(Math.random()*3)+1;
		
		// �� = �Է��� => 2
		System.out.println("�ȳ������� 1(����), 2(����), 3(��)");
		int me = sc.nextInt();
		
		System.out.println("�� : "+me+", ��ǻ�� : "+com);
		
		// ��¹��� ���� ���� �й� / �¸� / ���º�	
		switch (me-com) {// 3-2
		case 1: case -2:
			System.out.println("�¸�");
			break;
		case 2: case -1:
			System.out.println("�й�");
			break;
		case 0:
			System.out.println("���º�");
			break;

		}
	}

}
