import java.util.Scanner;

//�帧����
//	���ǹ�
//	�ݺ���

// ���ǹ� : Ư�� ���� ���� �帧�� �Ѿ������
// 	if
// 	switch

//��Ʈ
//���� : 
//------------
//xxxx�� ��ġ ������
//���� ����Ʈ : ���� 1%
//10000�� �̻� ���� �� ����Ʈ ����Ʈ 50�� ��
//2���� �ʰ� 5���� �̸��̸� ����Ʈ 100�� ��, �ƴϸ� 10�� �߰�
public class CSMain {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("ȣȣ��Ʈ");
		
		System.out.print("���� : ");
		int p = k.nextInt();
		System.out.println("------------");
		System.out.printf("%d ����ġ ����\n", p);
		
		int point = p / 100;
		
		if (p >= 10000) {
			point += 50;
		}
		
		if ((p > 20000) && (p < 50000)) {
			point += 100;
			
		} else {
			point += 10;
		}
		
		System.out.printf("���� ����Ʈ : %d\n", point);
		
		
	}
}
