package afterschool;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		
		int sum = 0;

		//int Ÿ���� 5�� �����ϴ� �迭 ����
		int arr[] = new int[5];
		// �迭�� �ʱ�ȭ�� ���� ����ڷκ��� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5���� ������ �Է��ϼ���");
		
//		System.out.print("ù��° ���� �Է�");
//		arr[0] = sc.nextInt(); // arr0�� �濡 ������ �����ž�
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"��° ���� �Է� : ");
			arr[i] = sc.nextInt();
		}
		//�Է¹��� �� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			//10 20 30 40 50 ���
			sum += arr[i];
		
		}
		System.out.println();
		System.out.printf("�հ� : %d, ��� : %.1f", sum, (double)sum/arr.length);
		// �迭 �ȿ� �հ踦 ���Ϸ��� for ���� �����								5���� ���� ������ �ִ� length
	}
}

