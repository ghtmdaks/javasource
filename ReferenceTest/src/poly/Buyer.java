package poly;

public class Buyer {
	int money = 2000;
	int bonusPoint = 0;
	
	void buy(Product p) { // p�� ���� ����Ű�°Ŵ� �θ𲫵� 
						//toString�� ���ؼ� �ڽ��� ����ų �� �ְ� �Ǿ���
		if(money < p.getPrice()) {
			System.out.println("�ܾ� �������� ���� ���� ���� ����");
			return;
		}
		
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		System.out.println(p+"��(��) �����ϼ̽��ϴ�.");
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
