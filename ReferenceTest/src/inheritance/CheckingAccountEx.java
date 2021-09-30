package inheritance;

public class CheckingAccountEx {

	public static void main(String[] args) {
		CheckingAccount checkinAccount = new CheckingAccount("122-12", 200000, "홍길동", "122-12-133");
		
		//카드 번호 안맞는 경우
		//System.out.println(checkinAccount.pay("322-12", 20000));
		
		//카드번호 맞는 경우
		System.out.println("현재 잔액 " + checkinAccount.pay("122-12-133", 20000));
	}

}
