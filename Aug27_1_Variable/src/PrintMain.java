import java.util.Scanner;

//��ǰ�� : 
//���� : 
//���� : 

public class PrintMain {
	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
			System.out.print("��ǰ�� : ");
			String name = b.next();
			
			System.out.print("���� : ");
			int price = b.nextInt();
			
			System.out.print("���� : ");
			double weight = b.nextDouble();
			
			Double pct = 88.5;
			
			System.out.println("-------");
			System.out.println(name);
			System.out.println(price);
			System.out.println(weight);
			
			//��������
			//	Ư������ 
			//		%s : String ���� �ڸ�
			//		%d : ���� ���� �ڸ�
			//		%d�� ���� %05d�� ���� 5�ڸ��� �ڸ��� ���缭 ���� 100 -> 00100
			//		%f : float �Ǽ� ���� �ڸ�
			//		%f�� ���� %.3f�� ���� �ݿø� �Ҽ��� 3�ڸ� ���Ϸ� ����
			//		%b : boolean
			
			// \ ���ڷ� ������ \\ �ΰ� ��ߵ�
			// % �� %% �ΰ� ��ߵ�
			
			System.out.printf("-ǰ�� : %s-\n", name);
			System.out.printf("-���� : %d-\n", price);
			System.out.printf("-���� : %05d-\n", price);
			System.out.printf("-���� : %f-\n", weight);
			System.out.printf("-���� : %.3f-\n", weight);
			System.out.printf("-%.2f%%-\n", pct);
			System.out.printf("%s[%d��] - %fg", name, price, weight);
	}
}

