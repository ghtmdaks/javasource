package afterschool;

public class Exam02 {

	public static void main(String[] args) {
		
		int i = 1;
		if (i<10) {
			System.out.println(i);
			System.out.println("�ȳ��ϼ���");
		} // if�� �� ��������� �ʼ��� �ƴϾ� �Ѳ����� ó���ϴ� �ž� ��� �׷��� �������ִ°ž�
		  // �����Ұ� �����Ը� �߰�ȣ�� �Ἥ �˾ƺ��� ���� �������
		
		for(i=0; i<10; i++) 
		//(int i;...)�� ���� �Ǹ� ������ �̸����� �Ȱ��� �����ؼ�
		//������ ����
			System.out.println(i);// �����Ұ� �����̸� �ȹ�� ��

		switch (i) {
		case 1:
			
			break;

		default:
			break;
		}
	}

}
