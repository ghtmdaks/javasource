import java.util.Scanner;

public class ConsoleInputMain {
	public static void main(String[] args) {
		
		// Ű���� �Է¹��� �غ��ؼ�  k�� ������
		Scanner k = new Scanner(System.in);
		
		//�Ĵ� �̸� �Է¹ޱ�
		System.out.print("�Ĵ� �̸� : ");
		
		// �ֿܼ� �Է��� ������ name�� ����
		String name = k.next();

		System.out.print("�Ĵ� ũ�� : ");
		double size = k.nextDouble();
		
		System.out.print("���̺� �� : ");
		int table = k.nextInt();
		
		System.out.print("������ : ");
		boolean open = k.nextBoolean();
		k.close();
		
	}
}
