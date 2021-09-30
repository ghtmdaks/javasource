package afterschool;

public class IPTV extends ColorTV {

	private String ip;

	public IPTV(int size, int color, String ip) {
		super(size, color);
		this.ip = ip;
	}
	
	// @overrid 없어도 오버라이딩 한거야 자동완성 안해서 그래
	public void printPrioerty(){
		System.out.printf("나의 IPTV는 %s 주소의 %d 인치 %d 컬러",ip,getSize(),getColor());
	}
}
