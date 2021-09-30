package poly;

public class Buyer {
	int money = 2000;
	int bonusPoint = 0;
	
	void buy(Product p) { // p가 원래 가리키는거는 부모껀데 
						//toString을 통해서 자식을 가리킬 수 있게 되었어
		if(money < p.getPrice()) {
			System.out.println("잔액 부족으로 인해 물건 구매 실패");
			return;
		}
		
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		System.out.println(p+"을(를) 구입하셨습니다.");
	}
	
	
//	void buy(Tv tv) { 
//		
//	}
//	void buy(Computer computer) { 
//		
//	}
//	void buy(Audio audio) { 
//		
//	}
	
	
}
