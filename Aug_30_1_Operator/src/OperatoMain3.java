//ǥ��ü�� = (Ű-100) * 0.9
//�񸸵� = (������ / ǥ��ü��) * 100
//�񸸵� 120 �ʰ��ϸ� ��, �ƴϸ� ����





import java.util.Scanner;

public class OperatoMain3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
			
			System.out.println("�񸸵��˻�");
			
			System.out.print("�̸� : ");
			String name = k.next();
			
			System.out.print("Ű : ");
			double h = k.nextDouble();
			
			System.out.print("������ : ");
			double w = k.nextDouble();
			
			System.out.println("----------");
		
			
			double sW = (h-100) * 0.9;
			System.out.printf("ǥ��ü�� : %.2f kg\n", sW);
			
			double bC = (w / sW) * 100;
			System.out.printf("�񸸵� : %.2f %%\n", bC);
			
			String say = (bC > 120) ? "��" : "����";
			System.out.printf("%s���� %s\n", name, say);
			
			System.out.println("���� ������ ���� �Ŀ�");
			String t = k.next();
			
					
	}
}
