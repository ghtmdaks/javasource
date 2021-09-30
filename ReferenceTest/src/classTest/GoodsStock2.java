package classTest;

public class GoodsStock2 {
	//속성 : 상품 코드(p12345), 재고수량(100)
	private String code;
	private int inven; // 재고가 10개 남았는데 다른데에서 20개 하면 안되니까
	
	GoodsStock2(){} //디폴트 생성자를 만들어줭
	
	//생성자 오버로딩
	//가로안을 다르게하기
	//가로안에는 매개변수 위와 동일하게 속성을 채워줘
	//멤버변수 초기화를 목적으로 하고 있어
	GoodsStock2(String code, int inven){
		this.code = code; // this.은 파란색 내꺼
		this.inven = inven;
	}
	
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
	//현재 재고수량을 리턴하는 기능을 가진 메소드를 만들거야
	int inven() {
		return inven;
	}
	
}
