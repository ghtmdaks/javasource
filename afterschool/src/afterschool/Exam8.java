package afterschool;

public class Exam8 {

	public static void main(String[] args) {
		// ���� Ÿ���� ���� �׸��� ���ӵ� ���� ���� �׷��� ������ �迭�� �����
		// �迭�� for �� ������ �������
		
		// �迭 => ��(new)
		
		// �迭 ����
		int arr[];
		
		// ����
		arr = new int[10];
		//0~9�� index(��)�� ����� �� �ȿ� 0�� �ϳ��� �� �� �־�
		
		
		// �ʱ�ȭ
		// 1 ~ 10���� ���� ����
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;	//[] index(��) �ȿ� i+1 �� �־���
			
		}
		//���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}
