package classTest;

public class SubscriberInfo {
	//�Ӽ� - �̸�,���̵�,�н�����,��ȭ��ȣ,�ּ�
	private String name;
	private String id;
	private String pass;
	private int ph; 
	private String addr;
	
	
	//������ - �̸�, ���̵�, �н����常 �ʱ�ȭ�� ���� ��ü ����
	public SubscriberInfo(String name, String id, String pass) {
		super();
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	//	   - �̸�, ���̵�, �н�����,��ȭ��ȣ, �ּҸ� �ʱ�ȭ �� �� ��ü ����
	public SubscriberInfo(String name, String id, String pass, int ph, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.ph = ph;
		this.addr = addr;
	}
	
	//��� - �н����� ����, ��ȭ��ȣ ����, �ּ� ����
	//setter 
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
	
	
	
}
