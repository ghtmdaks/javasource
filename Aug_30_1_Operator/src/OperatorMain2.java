import java.util.Scanner;

// 	shift������
//	<< >> <<<
// ���� ���ù������� ���

// ����) ī��
// 24�ð� = 1<<0	:1
// ���� = 1<<1	:2
// ����= 1<<2	:4
// �������� 1<<3	:8
// AƯ�� = 1 -> 24�ð�
// BƯ�� = 3 -> 24�ð� + ����
// CƯ�� = 12 -> ���� + ��������
// DƯ��= 13 -> 24�ð� + ���� + ��������

//	��κ� 2�� ����
//		a > 2
//		1 + 2

//	1��(����) ����
//		!d

//	3�� ����
//	������ ������ �ְ� ���� �� �ִ� ����

//	�����ڶ�� �͵��� Stack ������ ���; *��������Ʈ

public class OperatorMain2 {
	public static void main(String[] args) {
		int a = 3 << 2; // 10���� 3�� 2���� 11�� �ٲ۴��� �������� 2ĭ �о��ְ� �� ��ŭ 00�� �ٿ��ش�
						// 3(10) - > 11(2)
						//			1100 => 12
		System.out.println(a);
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = k.next();

		System.out.print("���� : ");
		int age = k.nextInt();

		// 3�� ����
		// 		���ǽ� ? ������������ �� : ���� �� ������ �� ��
		// 20�� �̻��̸� ?	 �ȳ��ϼ���	 :	  ����
		
		// �̸��� ȫ�浿�̸� ��? ��!!!, �ƴϸ� �������
		//String say2 = (name == "ȫ�浿") ? "��? ��!!!" : "�������"; 
		// == stack �����ε� string �� �������̶� �ȵ� �׷��� .equals �� ǥ���������
		String say2 = (name.equals("ȫ�浿")) ? "��? ��!!!" : "�������";
		System.out.println(say2);
		
		String say = (age >= 20) ? "�ȳ��ϼ���" : "����";
		System.out.println(say);
		
		// ���̰� ¦���� ¦, Ȧ���� Ȧ
		String oe = (age % 2 == 0) ? "¦" : "Ȧ";
		System.out.println(oe);
			
	}
}