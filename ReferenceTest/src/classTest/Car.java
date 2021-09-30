package classTest;

public class Car {
	//필드 : 제조회사, 모델명, 색상, 최대속도....
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//car(){} => 기본생성자(default)
	//클래스 내에 선언된 생성자가 하나도 없으면
	//컴파일러가 자동으로 기본 생성자를 만들어줌
	
	
	//메소드 : 전진/후진
	//	리턴타입 메소드명 (){}
	//	리턴타입 메소그명 (타입 변수명,.....){}
	void foward() {
		System.out.println("전진하다");
	}
	void backward() {
		System.out.println("후진하다");
	}
	
}
