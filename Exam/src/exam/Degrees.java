package exam;

import java.util.Scanner;

public class Degrees {
	public static void main(String[] args) {
		// ȭ�� => ����
		
		//����
		// ȭ���µ� �̷ƹޱ�(����)
		// ���� ȭ�� �µ� => �����µ��� ��ȯ �� ���
		// (ȭ��-32)*5/9
		Scanner k = new Scanner(System.in);
		System.out.print("ȭ���µ� : ");
		int f = k.nextInt();
		System.out.println("-------");
		
		double c = (f-32)*5/9.0;
		System.out.printf("�����µ� : %.1f��\n", c);
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("ȭ���µ� : ");
		//int fahr = sc.nextInt();
		//double=(fahr-32)*5/9;
		//sysoln("�����µ�: "+cels);
		//sysof("�����µ� : %.4f",cels);
	}

}
