package classTest;

public class MethodTest2 {
	
	//�� ���� ����(����, �Ǽ�)�� �޾Ƽ� ���� ����� �����ֱ�
	//�������� �� �� �� ���ڸ� ���� �ž� (�Է°�) ���� ��Ȯ�ϰ� �η繶���ϰ� �ϸ� �ȵ�
	//���� �ȿ� ������ ��
	int sum(int num1, int num2) { //2�� ���� �ޱ�

		//return num1+num2; �������¾�
		int result = num1 + num2; //���ϱ�
		return result; //(��°�(��ȯ��)) ���� ��� �����ֱ�
	}
	
	//�������� 2~9�� ����ϱ�
	//�Է°� : ����, ��ȯ�� : ����
	void print99dan() {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
	}
	
	//�� ���� ������ �޾Ƽ� (�Է°�) ���ϱ��� ����� ����(��ȯ��)�ϱ�
	int multiply(int x, int y) {
		return x*y;
		
	}
}









