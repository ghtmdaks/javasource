package classTest;

public class Account2 {
	//�Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�(����), �̸�
	private String acc;
	private int mon;
	private String name;
	
	//������ �ۼ�
	//[���콺������]->[source]-[generate..fields]
	public Account2(String acc, int mon, String name) {
		super();
		this.acc = acc;
		this.mon = mon;
		this.name = name;
	}
	
	public Account2(String acc, String name) {
		super();
		this.acc = acc;
		this.name = name;
	}
	
	//�⺻ ������
	//[���콺������]->[source]-[generate..spuerclass]
	public Account2() {
		super();
	}
	
	//�ܺηκ��� ���� �޾Ƽ� ��������� ���� �����ϴ� �۾���
	// 'set~ ���� �޼ҵ带 �ۼ��ؾ��� (�Ϲ��� ����̾�)
	
	//������� : ���¹�ȣ�� �����ϰ� �ʹٸ�
	public void setAcc(String acc) {
		this.acc = acc;
	}
	//�̸��� �����ϰ� �ʹٸ�
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMon(int mon) {
		this.mon = mon;
	}
	

	//��� ������ ���� �����ϰ� �ʹٸ�?
	//'get~ ���� ������ �ض�
	public int getMon() {
		return mon;
	}
	
	


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
