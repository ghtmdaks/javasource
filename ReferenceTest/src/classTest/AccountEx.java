package classTest;

public class AccountEx {
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.acc = "122-01-12222";
		acc1.mon = 100000;
		acc1.name = "ho";
		
		acc1.addmon(10000);
		System.out.println("ภÜพื : "+ acc1.mon);
		
		int mon = acc1.minmon(1000);
		System.out.println("ภÜพื : "+mon);
		
		
	}

}
