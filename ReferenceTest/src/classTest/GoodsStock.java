package classTest;

public class GoodsStock {
	//�Ӽ� : ��ǰ �ڵ�(p12345), ������(100)
	String code;
	int inven; // ��� 10�� ���Ҵµ� �ٸ������� 20�� �ϸ� �ȵǴϱ�
	
	//��� : ������ ����(�Է°� ����, ��°� ����), 
	//	      ������ ����(�Է°� ����, ��°��� ���� �������� ����)
	
	void invenUp(int amount) {
		inven += amount;
	}
	int invenDown(int amount) {
		if(inven>amount) {
			inven -= amount;
		}
		return inven; //��ȯ�ϴ°� int Ÿ���̾� Ÿ���� �����ְ�
					  // �׷��� �������� �� �� �̸��� ������
	}
}
