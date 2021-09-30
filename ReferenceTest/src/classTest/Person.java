package classTest;

// final : 수정불가 / 초기화 무조건 필요
// 사용되는 곳 : 클래스,메서드,멤버변수,지역변수
// 클래스 : 상속 불가
// 메소드 : 오버라이딩 불가
// 멤버변수, 지역변수 : 수정 불가


public class Person {
	final String nation = "Korea";
	final String ssn; //The blank final field ssn may not have been initialized
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}	
	
	
}
