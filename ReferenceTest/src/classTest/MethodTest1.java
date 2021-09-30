package classTest;

/*
 * 리턴타입 메소드명(....){
 * 
 * 	리턴타입이 void 인 것을 제외한다면
 * 	무조건 return 키워드가 들어와야 함
 * 
 * 
 */

public class MethodTest1 {
	// 리턴값이 true/false 메소드 생성 => boolean
	boolean isRedirect() { 
		return false; // 2. 리턴 되서 다시 넘어간디~
		
		
		
	}
	
	
	// 리턴값이 int 타입인 메소드 생성
	int sum() { // 나 인트타입으로 된거 너한테 보낼게
		return 3;
		
	}
	
	// 리턴값이 int, 두 개의 전달 인자(int)를 받기
	int multiply(int num1, int num2) {
		return num1*num2;
		
	}
	
	// 리턴값 : long, 두 개의 전달 인자 (int)를 받기
	long add(long num1, long num2) {
		return num1+num2;
	}
	
	// 리턴값 : char 메소드
	char method() {
		return 'c';
	}
	
	void method1() { // void 는 넘기는 값 없음의 의미가 있어
	}
		
	//리턴타입 : int형 1차원 배열
	//전달인자 : int형 1차원 배열
	int[]print(int arr[]){
		return arr;
	}
	
	//리턴타입 : double, 매개변수 : 두개의 double
	//해야할 일 : 받은 두개의 매개변수를 나누기한 결과 리턴
	double divide(double a, double b) {
		return a/b;
	}
	
		
	}

