// 24 1<<0 : 1
// ���� 1<<1 : 2
// ���� 1<<2 : 4
// �������� 1<<3 :8
// ��� 1<<4 : 16

// ���� : ctrl(����) + F11
// ����� : F11

// �극��ũ ����Ʈ ���� �� F11
public class ShiftOperatorMain {
	public static void main(String[] args) {
		int value = 9;
		
		if (value >= (1<<4)) {
			System.out.println("���");
			value -= (1<<4);
		}
		
		if (value >= (1<<3)) {
			System.out.println("��������");
			value -= (1<<3);
		}
		
		if (value >= (1<<2)) {
			System.out.println("����");
			value -= (1<<2);
		}
		
		if (value >= (1<<1)) {
			System.out.println("����");
			value -= (1<<1);
		}
		
		if (value >= (1<<0)) {
			System.out.println("24��");
			value -= (1<<0);
		}

	}
}
