package afterschool;

public class IPTV extends ColorTV {

	private String ip;

	public IPTV(int size, int color, String ip) {
		super(size, color);
		this.ip = ip;
	}
	
	// @overrid ��� �������̵� �Ѱž� �ڵ��ϼ� ���ؼ� �׷�
	public void printPrioerty(){
		System.out.printf("���� IPTV�� %s �ּ��� %d ��ġ %d �÷�",ip,getSize(),getColor());
	}
}
