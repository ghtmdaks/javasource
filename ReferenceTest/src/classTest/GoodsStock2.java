package classTest;

public class GoodsStock2 {
	//�Ӽ� : ��ǰ �ڵ�(p12345), ������(100)
	private String code;
	private int inven; // ��� 10�� ���Ҵµ� �ٸ������� 20�� �ϸ� �ȵǴϱ�
	
	GoodsStock2(){} //����Ʈ �����ڸ� �����a
	
	//������ �����ε�
	//���ξ��� �ٸ����ϱ�
	//���ξȿ��� �Ű����� ���� �����ϰ� �Ӽ��� ä����
	//������� �ʱ�ȭ�� �������� �ϰ� �־�
	GoodsStock2(String code, int inven){
		this.code = code; // this.�� �Ķ��� ����
		this.inven = inven;
	}
	
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
	//���� �������� �����ϴ� ����� ���� �޼ҵ带 ����ž�
	int inven() {
		return inven;
	}
	
}
