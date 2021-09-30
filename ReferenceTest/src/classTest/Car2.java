package classTest;

public class Car2 {
	//필드 : 제조회사, 모델명, 색상, 최대속도....
	private String company; //속성은 외부에서 직접적으로 변경하지 못하게 안보이게
	private String model;	// 처리하기 때문에 private 로 막아줘야돼 꼭
	private String color;
	private int maxSpeed;
	
	//*생성자*
	//클래스 이름과 동일해 / 리턴 타입은 없어 / 중복이 가능해 (생성자 오버 로딩)
	//							 여기서의 중복은 똑같이 만들라는 게 아니야
	//							 타입을 같게 하는거야 (괄호안을 다르게)
	//목적 - 필드에 초기값을 저장/객체를 생성하면서 준비해야하는 작업 실행

	Car2(){ // 리턴 타입은 Car 앞에 아무것도 안넣어도 돼
		System.out.println("car2 기본 생성자");
	}
//	Car2(){//Duplicate method Car2() in type Car2 중복되는데?
//		System.out.println("car2 기본 생성자");
	
	Car2(String model){
		System.out.println("car2 기본 생성자 - model 초기화");
	}
	Car2(String color, String model){
		System.out.println("car2 기본 생성자 - model, color 초기화");
	}
	Car2(String company, String model, String color, int maxSpeed){
		System.out.println("car2 기본 생성자 - 필드 모두 초기화");
	}//- 하나의 클래스의 여러개의 생성자가 존재하는게 오버로딩이야
			//=> car2(가로안에 형태는 달라야한다.)
	
	//메소드 : 전진/후진
	void foward() {
		System.out.println("전진하다");
	}
	void backwarf() {
		System.out.println("후진하다");
	}
	
}
