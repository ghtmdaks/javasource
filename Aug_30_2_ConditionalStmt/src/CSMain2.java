import java.util.Scanner;

//�߰���� :
//�⸻��� :
//---------
//��� : �Ҽ��� ���ڸ�
//����� 90�� ������ ����� ���, �ƴϸ� ��!��� ���

//	if (A) {	
//		A�� ������������
//	}else if(B) {
//		A�� �ƴϰ� B�� ���������� ��
//	}else {
//	} 	���� �ϳ��� �´°� ������


public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("�߰���� : ");
		int mE = k.nextInt();

		System.out.print("�⸻��� : ");
		int fE = k.nextInt();
		
		System.out.println("---------------");
		
		double aV = (mE + fE) / 2.0;
		System.out.printf("��� : %.1f\n", aV);
		
		if (aV>=90) {
			System.out.println("��");
		}else if (aV>=80) {
			System.out.println("��");
		}else if (aV>=70) {
			System.out.println("��");
		}else if (aV>=60) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
		
		
		
		if (aV >= 90) {
			System.out.println("��");
		}else {
			if (aV>=80) {
				System.out.println("��");
			}else {
				if (aV>=70) {
					System.out.println("��");
				}else {
					if (aV>=60) {
						System.out.println("��");
						
					}
				}
			}
		}

	}
}
