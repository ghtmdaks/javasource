
//	��������
//	>	>=	==	!=		<=	<
//	�ʰ�	�̻�	����	�ٸ���	����	�̸�

// �����տ�����
//	&& &	| ||	!		^
//	and		or		not		xor(eXclusive OR - ��Ÿ�� OR)

//


// Ű : 
// ���� :
// -----------
// Ű cm, ���� ��

import java.util.Scanner;

public class OperatorMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("Ű : ");
		double zl = k.nextDouble();
		
		System.out.print("���� : ");
		int sk = k.nextInt();
		
		System.out.println("-----------");
		System.out.printf("Ű %.1fcm, ���� %d��\n", zl, sk);
		
		// Ű�� 150 �ѳ�
		boolean a = (zl > 150);
		System.out.println(a);
		
		// ���̰� 10�� ����
		boolean b = (sk <= 10); //�ε�ȣ�� 2���� �׷��� �ް����� ��ȣ�� ���� ���� �������
		System.out.println(b);
		
		// ���̰� 5�� �̻��̰�, Ű�� 200cm �̻��ΰ�
		boolean c = (sk >= 5) && (zl >= 200);
		System.out.println(c);
		
		// Ű�� 200cm �̻��̰ų� ���̰� 5�� �̻��ΰ�
		boolean d = (zl >= 200) || (sk >= 5);
		System.out.println(d);
		
		// d�� true �� e�� false
		// d�� false �� e�� true
		boolean e = !d; 			//!�տ��� ������ �ݴ�� �ֱ�
		System.out.println(e);

	}
}
