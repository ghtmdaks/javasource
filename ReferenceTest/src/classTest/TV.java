package classTest;

public class TV {
	// �Ӽ�(�ʵ�, �������, ������Ƽ) => ����, ��������, ä���� ����̳�, ....
	String color; //red, blue, black... (null)
	boolean power;	//true:on, false:off (false)
	int channel;	//					(0) ()�� ���� �ʱ�ȭ �Ǿ��ִ� ��
	
	// ����(�޼ҵ�) => ä���� �����ϴ�, ������ �Ѵ�/����
	//				�Ӽ��� ���� � ����� �ο��ϰ� ������
	void channelUp() {
		//channelUp �� �ؾ��ϴ� �۾� �ۼ�, ���� ä�� 7 => 8,9,10...
		channel++;
	
	}
	void channelDown() {
		//channelDown �� �ؾ��ϴ� �۾� �ۼ�, ���� ä�� 7 => 6,5,4...
		channel--;
	}
	
	void power() {
		//power �� �ؾ��ϴ� �۾� �ۼ� on => off, off => on
		power = !power; //���� �Ŀ��� ������ �ִ� �Ÿ� �Ŀ��� �ݴ�ɷ� �ٲ㼭 ����
	}
}
