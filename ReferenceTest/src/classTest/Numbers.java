package classTest;

public class Numbers {
	private int num[]; // �⺻Ÿ������ �迭�� ��������� �����ؽ�

	public Numbers(int[] num) {//�����ڸ� ���巯��
		super();
		this.num = num;//{5,6,7,8,9} �� �ѿ� �����̽�
	}
	
	//�հ� => ��ȯ  �����ϴ°Ŵ� int  �Է°��� ����
	//	 => ������� num �迭�� ����ִ� ���� �հ� ����
	// ���� ������ �ִ� ���� �հ踦 ���Ҳ���
	int getTotal() {
		int sum=0;
		for(int i =0 ; i<num.length; i++) {
		sum+=num[i];
	}
	return sum;
	}
	
	
	//��� => ��ȯ�� double, �Է°��� ����
	// 	 => �հ� �޼ҵ带 �̿��ؼ� ��� ���� �� ����
	double getAverage() {
		//  15 / 5
		return getTotal()/num.length;
	}
}
