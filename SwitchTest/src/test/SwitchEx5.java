package test;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {
		// ��������� ���� 2�� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int a = sc.nextInt();
		
		System.out.print("����2 : ");
		int b = sc.nextInt();
		
		// ������ �Էƹޱ�(+,-,*,/,%)
		
		System.out.print("������ �Է�(+,-,*,/,%) : ");
		// + / * => '+' or "+"
		String op = sc.next();

		//switch(������)
		// ���� �� ��� ��� ���
		int result =0;
		switch (op) {
		case "+":
			result = a + b;
			//System.out.println(a + op + b + "=" + (a+b));
//								  op�� ����(string)
			break;
		case "-":
			result = a - b;
			//System.out.println(a + op + b + "=" + (a-b));
			break;
		case "/":
			result = a / b;
			//System.out.println(a + op + b + "=" + (a/b));
			break;
		case "*":
			result = a * b;
			//System.out.println(a + op + b + "=" + (a*b));
			break;
		case "%":
			result = a % b;
			//System.out.println(a + op + b + "=" + (a%b));
			break;
//		default:
//			System.out.println("�����ڸ� Ȯ���� �ּ���.");
//			break;
		}
		System.out.printf("%d %s %d = %d",a,op,b,result);
		//				   ����  ����  ����  ������ ��� �����ž�, �ڿ� ������� �о�ִ� ����̾� %c, %f �� �־�
		//																	����, �Ǽ�
	}

}
