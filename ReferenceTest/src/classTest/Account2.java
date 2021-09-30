package classTest;

public class Account2 {
	//속성 : 계좌번호(122-01-12222), 잔액(정수), 이름
	private String acc;
	private int mon;
	private String name;
	
	//생성자 작성
	//[마우스오른쪽]->[source]-[generate..fields]
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
	
	//기본 생성자
	//[마우스오른쪽]->[source]-[generate..spuerclass]
	public Account2() {
		super();
	}
	
	//외부로부터 값을 받아서 멤버변수의 값을 변경하는 작업시
	// 'set~ 으로 메소드를 작성해야해 (암묵적 약속이얌)
	
	//멤버변수 : 계좌번호를 변경하고 싶다면
	public void setAcc(String acc) {
		this.acc = acc;
	}
	//이름을 변경하고 싶다면
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMon(int mon) {
		this.mon = mon;
	}
	

	//멤버 변수의 값을 리턴하고 싶다면?
	//'get~ 으로 시작을 해라
	public int getMon() {
		return mon;
	}
	
	


	//기능 : 입금한다.(입력값:입금액, 반환값 없음)=>현재잔액 +=입금액
	void addmon(int cash) {
		mon += cash;
	}
	//		출금한다.(입력값: 출금액, 반환값:현재잔액)=>현재잔액 -= 출금액
	int minmon(int cash) {
		if(mon > cash) {
			mon -= cash;
		}
		return mon;
	}
}
