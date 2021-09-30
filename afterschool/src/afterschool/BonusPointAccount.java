package afterschool;

public class BonusPointAccount extends Account2{

//계좌번호 계좌주 잔액  
//보너스포인트 
	private int bonusPoiunt;
//입금하다(보너스 포인트 추가) 출금하다 
	public BonusPointAccount(String acc, int mon, String name, int bonusPoiunt) {
		super(acc, mon, name);
		// TODO Auto-generated constructor stub
		this.bonusPoiunt = bonusPoiunt; // 보너스포인트어카운트 괄호안 맨 마지막에 인트 내꺼 추가, 
										// 디스보너스포인트 추가로 초기화 시켜준다.
	}
	
	
	@Override
		void addmon(int cash) {
			// 예금하다,
			//setMon(getMon()+cash);
			super.addmon(cash);
			
			//예금액의 0.1%를 보너스 포인트를 닮고 싶어
			bonusPoiunt += cash * 0.001; // 보너스 포인트 0.1 백분율로해서 0.001로 곱해준다
			
			
			
		}


	public int getBonusPoiunt() {
		return bonusPoiunt;
		
		
	}


	@Override
	public String toString() {
		return "BonusPointAccount [bonusPoiunt=" + bonusPoiunt + "]";
	}
}




