package classTest;

public class GoodsStockEx {

	public static void main(String[] args) {
		
		//첫번째 상품 재고 관리
		GoodsStock product1 = new GoodsStock();
		product1.code ="p12345";
		product1.inven = 30;
		
		//상품판매 => 재고 감소
		//메소드 호출 => 리턴값이 있다면 리턴값을 받기(syso, 변수)
		//System.out.println("현재 재고수량 : "+product1.invenDown(15));
		//변수선언
		int inven = product1.invenDown(15);
		//변수로 처리를 하면 이후로도 inven을 사용 할 수 있어
		System.out.println("현재 재고수량 : " + inven);
		
		
		//반품=> 재고 증가
		//메소드 호출 => 리턴타입이 없으면 호출만 하면 돼
		//System.out.println(product1.invenUp(5));
		//보이드는 출력문도 안되고 변수도 안돼
		product1.invenUp(5);
		System.out.println("현재 재고수량 : " + product1.inven);
		
	}
}
