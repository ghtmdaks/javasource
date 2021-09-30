package inheritance;

public class TV2 {
	// �Ӽ�(�ʵ�, �������, ������Ƽ) => ����, ��������, ä���� ����̳�, ....
	private String color; //red, blue, black... (null)
	private boolean power;	//true:on, false:off (false)
	private int channel;	//					(0) ()�� ���� �ʱ�ȭ �Ǿ��ִ� ��
	
	
//	public TV2() {
//		super();
//	}
	
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
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

	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}

	public int getChannel() {
		return channel;
	}
	
	
}
