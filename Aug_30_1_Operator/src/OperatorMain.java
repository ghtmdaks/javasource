

import java.util.Scanner;

public class OperatorMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("���� : ");
		int x = k.nextInt();
		
		System.out.print("���� : ");
		double y = k.nextDouble();
		
		System.out.print("���� : ");
		int z = k.nextInt();
		
		System.out.print("���� : ");
		double w = k.nextDouble();
		
		System.out.println("-----------------");
		
		double v = x * y * z;
		System.out.printf("���� : %.1f\n", v);
		System.out.printf("���� : %.1f\n", w);

		// &�� ��� ������
		// && ó���ӵ��� ������. ��ǻ�� �� ���� �ٿ��� �� �־�
		// & �����ڰ� ���ϴ�. �뷮�� �� ������
		// �׷��� && �� �� ���� Ȯ���� ���� ���� ���� ����
		
		//���ǰ� 10 �̻��̰�, ���԰� 1000 �̻� �̸� 
		boolean a = (v >= 10) && (w >= 1000);
			//boolean a = (w >= 1000) && (v >= 10);
			System.out.println(a);
		
		// |�� ��밡�� 
		// || �� ���� Ȯ���� �����Ÿ� ���� ����.
		// ���ǰ� 10 �̸��̰ų�, ���԰� 1000�̸��̸�
		boolean b = (v <= 10) || (w <= 1000);
			//boolean b = (w <= 1000) || (v <= 10);
			System.out.println(b);
			
		// ���ǰ� 10 �̸� �̴���, ���ǰ� 1000 �̸��̵���
		boolean d = (v < 10) ^ (v < 1000);
			System.out.println(d);
			
		// ���԰� 20�̻��̰� ���԰� 30�̻��̸�
		boolean c = (w >= 20) && (w >= 30);
			//boolean c = w>=20;
			System.out.println(c);
			
		 
	}
}
