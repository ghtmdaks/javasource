package poly;

public class PolyArgumentEx {
	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
				
		//Tv tv = new Tv(100);
				
				
		buyer.buy(new Tv(100));
		buyer.buy(new Computer(150));
		buyer.buy(new Audio(50));
		
		System.out.println("현재 잔액은 "+buyer.money);
		System.out.println("현재 포인트는 "+buyer.bonusPoint);
	}

}
