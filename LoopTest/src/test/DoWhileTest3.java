package test;

import java.util.Scanner;

public class DoWhileTest3 {
	public static void main(String[] args) {
		// ��ǻ�Ͱ� 1~100������ ������ ���Ƿ� ����
		// ����ڴ� ��ǻ�Ͱ� ������ �ִ� ���ڰ� �������� �˾Ƹ��߱�
		Scanner sc = new Scanner(System.in);
		
		// 0~99
		int answer = (int)(Math.random()*100)+1; //��ǻ�Ͱ� 65�� ������ �ִٰ� ġ��
		int input = 0;
		do {
		
			System.out.print("���Ҵٿ���Ҵٿ� >> ");
			input = sc.nextInt(); //���� 50�� �Է����� �׷� �ƴѰ��ݾ� ��ǻ�Ͱ� ���� ���ߴ� �ǵ�
			
			if(input < answer) {
				System.out.println("Up");
			}else {
				System.out.println("Down");
			}
			
			
			
		}while(input != answer);
		 
		 System.out.println("����");
		 
	}
}
