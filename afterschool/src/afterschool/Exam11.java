package afterschool;

public class Exam11 {

	public static void main(String[] args) {
		// ���� Ÿ���� ���� �׸��� ���ӵ� ���� ���� �׷��� ������ �迭�� �����
		// �迭�� for �� ������ �������
		
		// �迭 => ��(new)
		
		// �迭 ����� ����, �ʱ�ȭ ���� 
		int arr[]= {1,25,37,45,50,69,77,58,19,10};
	

		//���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int j:arr) {
			// ���������� �迭�̸� �ƹ��ų�: �迭��
			// arr �̶�� �迭���� �ϳ��� ���� �� �����Ÿ� j�� ��� ��� �ǹ�
			System.out.print(j+" ");
			// �׷��� ���� j�� ����ϸ� ��
			// ���� for ���� ���� ����ϴ� ���� ���� �� �����ϰ� ����� �ϰ� ���� ��, �ƹ��볪 ���°� �ƴϾ�
			
			
		}
		
		
		
	}
}
