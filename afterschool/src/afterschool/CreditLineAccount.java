package afterschool;

public class CreditLineAccount extends Account2{
	private int creditLine; // 마이너스 한도
	
	public CreditLineAccount(String acc, int mon, String name,int creditLine) {
		super(acc, mon, name);
		this.creditLine=creditLine;
	}
	//계좌번호,계좌주,잔액,마이너스한도  /입금하다, 출금하다
	
	
	//출금하다 오버라이딩
	//부모의 기능 : 잔액 = 잔액 - 출금액
	//자식 : 잔액(현재잔액 + 마이너스 한도) - 출금액
	@Override
	int minmon(int cash) {
		// 현재잔액+마이너스 한도 필드 보다 사용금액이 많으면 인출불가 메세지 출력, 0을 리턴
		if (getMon()+creditLine < cash) {
			System.out.println("한도초과");
			return 0;
		}
		// 잔액(현재잔액 + 마이너스 한도) - 출금액
		setMon(getMon()-cash);
		
		return getMon();
		
	}


	@Override
	public String toString() {
		return "CreditLineAccount [creditLine=" + creditLine + "]";
	}
}
