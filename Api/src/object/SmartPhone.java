package object;

public class SmartPhone {
	private String company;
	private String os;
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() { //객체가 가지고 있는 멤버 변수의 값을 출력하는 용도
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}
	
	
}
