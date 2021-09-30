package classTest;
// 같은 클래스 내에 다른 메소드를 호출해보쟈
public class Calc {
	//덧셈
	int plus(int x, int y) {
		return x+y;
	}
	
	//평균
	double avg(int x, int y) {
		//return (x+y)/2; 내가 덧셈한걸 가지고 있으니까 이걸 이용해보자
		
		//return plus(x,y)/2; //플러스를 불러서 평균을 구하쟝
		//좀더 풀어서 해보까?
		int sum = plus(x,y);
		return sum/2; //돌아가세요 나를 호출했던 곳으로 돌아가요
	}
	
	void execute() {
		//평균 메소드 호출
		double result = avg(7,10);
		//프린트 메소드 호출
		println("실행결과"+result);
	}
	
	void println(String msg) {
		System.out.println(msg);
		
	}
}
