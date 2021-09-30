package classTest;

public class SubscriberInfo {
	//속성 - 이름,아이디,패스워드,전화번호,주소
	private String name;
	private String id;
	private String pass;
	private int ph; 
	private String addr;
	
	
	//생성자 - 이름, 아이디, 패스워드만 초기화를 한후 객체 생성
	public SubscriberInfo(String name, String id, String pass) {
		super();
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	//	   - 이름, 아이디, 패스워드,전화번호, 주소를 초기화 한 후 객체 생성
	public SubscriberInfo(String name, String id, String pass, int ph, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.ph = ph;
		this.addr = addr;
	}
	
	//기능 - 패스워드 변경, 전화번호 변경, 주소 변경
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
