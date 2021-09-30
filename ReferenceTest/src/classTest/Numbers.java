package classTest;

public class Numbers {
	private int num[]; // 기본타입으로 배열을 멤버변수로 선언해썸

	public Numbers(int[] num) {//생성자를 만드러떵
		super();
		this.num = num;//{5,6,7,8,9} 가 넘에 들어와이썽
	}
	
	//합계 => 반환  리턴하는거는 int  입력값은 없어
	//	 => 멤버변수 num 배열에 들어있는 값의 합계 리턴
	// 내가 가지고 있는 넘의 합계를 구할꼬얌
	int getTotal() {
		int sum=0;
		for(int i =0 ; i<num.length; i++) {
		sum+=num[i];
	}
	return sum;
	}
	
	
	//평균 => 반환값 double, 입력값은 없음
	// 	 => 합계 메소드를 이용해서 평균 구한 후 리턴
	double getAverage() {
		//  15 / 5
		return getTotal()/num.length;
	}
}
