package classTest;

public class SubscriberInfoEX {

	public static void main(String[] args) {
	
		SubscriberInfo aaa = new SubscriberInfo("홍길동", "hong", "gildong");
		//홍길동 전화번호 추가
		aaa.setPh(01022223333);
		
		SubscriberInfo bbb = new SubscriberInfo("성춘향", "sung", "chunhyang", 0100000000, "종로구");
		//성춘향 주소 변경
		bbb.setAddr("성동구");
		
		System.out.println();

	}
}
