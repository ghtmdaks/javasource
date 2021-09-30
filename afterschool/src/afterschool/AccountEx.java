package afterschool;

public class AccountEx {
	public static void main(String[] args) {
		Account2 account = new Account2("122-12", 20000, "È«±æµ¿");
		print(account);
		
		CheckingAccount checkingAccount = new CheckingAccount("122-13", 20000, "¼ºÃáÇâ", "333");
		print(checkingAccount);
		
		CreditLineAccount creditLineAccount = new CreditLineAccount("122-14", 3000, "±è½Ã½À", 1000000);
		print(creditLineAccount);
		
		BonusPointAccount bonusPointAccount = new BonusPointAccount("122-15", 4000, "Àå±¹¿µ", 10);
		print(bonusPointAccount);
		
		TrafficCardAccount trafficCardAccount = new TrafficCardAccount("122-16", 5000, "ÀÚ¹Ù", "555", true);
		print(trafficCardAccount);
	}
	
	public static void print(Account2 account) {
		System.out.println(account);
	}
}
