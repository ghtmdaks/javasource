package classTest;

public class TV2 {
	// �Ӽ�(�ʵ�, �������, ������Ƽ) => ����, ��������, ä���� ����̳�, ....
	String color; //red, blue, black... (null)
	boolean power;	//true:on, false:off (false)
	int channel;	//					(0) ()�� ���� �ʱ�ȭ �Ǿ��ִ� ��
	
	// ������
	TV2(){
		//��ȣ�ȿ� �ƹ��͵� ���� �����ڸ� default(�⺻) �����ڶ����
		//��������� �����ڰ� �ϳ��� ������� �ʾҴٸ� �����Ϸ��� �ڵ����� ������
	}
	TV2(String color, int channel){
		this.color = color;
		this.channel = channel;
//		this�� ���� ���� �ִ� �÷�
//		���� ���� �ִ� ä���� �ǹ���
		//������ �ΰ����� �����ε��̶����
		//��ȣ���� ���°� �޶����
	}
	
	
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
