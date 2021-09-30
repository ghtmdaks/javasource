package classTest;

public class NumbersEx {

	public static void main(String[] args) {
		
		int num[]= {5,6,7,8,9};
		//배열을 하나 만들어 절로 보내야행
		Numbers numbers = new Numbers(num);
		
		System.out.println("합계 : "+numbers.getTotal());
		System.out.println("평군 : "+numbers.getAverage());
		
		
		
	}

}
