package classTest;

public class GoodsStock {
	//속성 : 상품 코드(p12345), 재고수량(100)
	String code;
	int inven; // 재고가 10개 남았는데 다른데에서 20개 하면 안되니까
	
	//기능 : 재고수량 증가(입력값 수량, 출력값 없음), 
	//	      재고수량 감소(입력값 수량, 출력값은 현재 재고수량을 리턴)
	
	void invenUp(int amount) {
		inven += amount;
	}
	int invenDown(int amount) {
		if(inven>amount) {
			inven -= amount;
		}
		return inven; //반환하는게 int 타입이야 타입을 맞춰주고
					  // 그래서 변수선언 할 때 이름을 맞춰줘
	}
}
