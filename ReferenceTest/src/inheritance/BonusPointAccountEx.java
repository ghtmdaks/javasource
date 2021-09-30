package inheritance;

public class BonusPointAccountEx {
	public static void main(String[] args) {
		BonusPointAccount bonus = new BonusPointAccount("122-12",10000,"홍길동",100);
		bonus.addmon(100000);
		
		System.out.println("현재잔액 : "+ bonus.getMon());
		System.out.println("현재보너스포인트 : "+ bonus.getBonusPoiunt());
	}

}
