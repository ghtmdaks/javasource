package classTest;

public class AccountEx2 {
	public static void main(String[] args) {
		Account2 acc1 = new Account2();
//		acc1.acc = "122-01-12222";
//		acc1.mon = 100000;
//		acc1.name = "홍길동";
		
		//생성자를 사용하지 않고 멤버변수 값 초기화
		//계좌번호
		acc1.setAcc("122-01-12222");
		//이름
		acc1.setName("홍길동");
		//잔액
		acc1.setMon(10000);
		
		//입금 
		acc1.addmon(10000);
		System.out.println("입금 후 잔액 : "+acc1.getMon());
		
		//출금
		System.out.println("잔액 : "+acc1.minmon(1000));
		
		
		//성춘향계좌
		Account2 acc2 = new Account2("122-01-13333","성춘향");
		System.out.println("현재 잔액 조회 : "+acc2.getMon());
		
		//박보검계좌
		Account2 acc3 = new Account2("122-01-14444", 10, "박보검");
		System.out.println("현재 잔액 조회 : "+acc3.getMon());
		
	}
}
