package afterschool;

public class Exam13 {

	public static void main(String[] args) {
		//	       �࿭			    ��  ��
		int arr[][] = new int[3][3];
		// �ʱ�ȭ ���� 0���� �̹� �� �־�
		System.out.println("���� ���� "+arr.length);
		System.out.println("���� ���� "+arr[0].length);
		System.out.println("���� ���� "+arr[1].length);
		//						���� ���̸� ������� ��ȣ�� �����������
		//for���� ������ 1���� �̱� ������ 2�� ����ߵ�
		for(int i=0; i<arr.length; i++) {//���� ����
			for(int j=0; j<arr[i].length; j++) {//���� ���̱��� ���������
				arr[i][j]=j+1; 
				//�� ��ǥ��     �� ���� �־���
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {//���� ����
			for(int j=0; j<arr[i].length; j++) {//���� ���̱��� ���������
				System.out.printf("%2d",arr[i][j]);
			}					//2�ڸ����·� �������
			System.out.println();
		}
		
	}
}
