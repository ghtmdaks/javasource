package classTest;

public class Account {
	//�Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�(����), �̸�
	String acc;
	int mon;
	String name;
	
	//�⺻������
	//��� : �Ա��Ѵ�.(�Է°�:�Աݾ�, ��ȯ�� ����)=>�����ܾ� +=�Աݾ�
	void addmon(int cash) {
		mon += cash;
	}
	//		����Ѵ�.(�Է°�: ��ݾ�, ��ȯ��:�����ܾ�)=>�����ܾ� -= ��ݾ�
	int minmon(int cash) {
		if(mon > cash) {
			mon -= cash;
		}
		return mon;
	}
}
