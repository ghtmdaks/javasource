package classTest;

public class MyMath {
	//멤버 변수 long 변수 2개
	long a, b;	
	
	//메소드 : add,subtract,multiply,divide
	//       : 입력값 없음, 반환값은 연산결과
	
	long add(){
		return a+b;
	}
	long subtract(){
		return a-b;
	}
	long multiply(){
		return a*b;
	}
	double divide(){
		return a/b;
	}
	
	static long add(long a, long b){
		return a+b;
	}
	static long subtract(long a, long b){
		return a-b;
	}
	static long multiply(long a, long b){
		return a*b;
	}
	static double divide(double a, double b){
		return a/b;
	}
}







