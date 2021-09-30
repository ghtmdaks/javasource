package inheritance;

public class CreditLineAccountEx {

	public static void main(String[] args) {
		CreditLineAccount credit = new CreditLineAccount("122-12", 10000, "홍길동", 1000000);
		
		//System.out.println(credit.minmon(1500000)); 한도초과
		System.out.println(credit.minmon(800000)); //-790000

	}

}
