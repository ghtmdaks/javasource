package classTest;

public class Account3 {
	//�Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�(����), �̸�
	private String acc;
	private int mon;
	private String name;
	
	public Account3(String acc, String name) {
		super();
		this.acc = acc;
		this.name = name;
	}
	public Account3(String acc, int mon, String name) {
//		super();
//		this.acc = acc;
//		this.name = name;
		this(acc,name);//this() : �ٸ������ڸ� ȣ��
		this.mon = mon;
	}
	
	
	
	//�⺻ ������
	//[���콺������]->[source]-[generate..spuerclass]
	public Account3() {
		super();
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMon(int mon) {
		this.mon = mon;
	}
	public int getMon() {
		return mon;
	}

	void addmon(int cash) {
		mon += cash;
	}
	int minmon(int cash) {
		if(mon > cash) {
			mon -= cash;
		}
		return mon;
	}
}
