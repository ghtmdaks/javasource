import java.util.Scanner;

public class BMI {
	public static void main(String[] args) throws InterruptedException {
		Scanner k = new Scanner(System.in);
	
		System.out.println("�� �˻� ����");
		
		System.out.print("�̸� : ");
		String name = k.next();
		
		System.out.print("Ű(m) : ");
		double t = k.nextDouble();
			if (t >=3) {
				t /= 100;
			}

		System.out.print("������ : ");
		double w = k.nextDouble();
		
		System.out.println("---------------");
		
		double bmi = w / (t * t);
		Thread.sleep(2000);
		System.out.printf("BMI = %.1f\n", bmi);
		
		if (bmi >= 35) {
			System.out.println("�� ��");
		}else if (bmi >= 30) {
			System.out.println("�ߵ� ��");
		}else if (bmi >= 25) {
			System.out.println("�浵 ��");
		}else if (bmi >= 23) {
			System.out.println("��ü��");
		}else if (bmi >= 18.5) {
			System.out.println("����");
		}else {
			System.out.println("��ü��");
		}
//------------------------------------------------------------------	
		String result = "��ü��";
		if (bmi >= 35) {
			result = "�� ��";
		}else if (bmi >= 30) {
			result = "�ߵ� ��";
		}else if (bmi >= 25) {
			result = "�浵 ��";
		}else if (bmi >= 23) {
			result = "��ü��";
		}else if (bmi >= 18.5) {
			result = "����";
		}
		Thread.sleep(3000);
		System.out.printf("%s�� %sn\", name, result");
	}
}
