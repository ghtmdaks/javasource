package classTest;

public class Card {
	//�������
	//��ü����
	private String kind; //ī�� ��� ����
	private int number; //ī�� ���� ����

	//static(����) : Ŭ������ ������ ���
	//				��ü�� �������� �ʰ� ����ϼ���
	//				Ŭ������ �޸𸮿� �ε�� �� ����
	//Ŭ��������
	//��ü���� ������ �����Ǹ鼭 �׶����� ����� ������ ī���� ũ�⸣ �����ϰ� �ʹ�
	//�׷��� ����ƽ�� ���� ��
	static int height = 10; //���� ���� ����
	static int width = 7; //���� ���� ����
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public int getNumber() {
		return number;
	}

	// static(����) �޼ҵ� : ��ü�� �������� �ʰ� ���
	//					  Ŭ������ �޸𸮿� �ε�� �� ����
	//					 static �޼ҵ� �ȿ��� �ν��Ͻ� ��� ���Ұ�
	public static int getHeight() {
		//kind=""; �ν��Ͻ���� ��� �Ұ�
		//getNumber(); �ν��Ͻ���� ��� �Ұ�
		
		//getHeight(); O~K!!
		return height;
	}

	public static int getWidth() {
		return width;
	}
	
	
	

	
	
	
}
