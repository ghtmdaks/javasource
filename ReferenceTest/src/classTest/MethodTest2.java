package classTest;

public class MethodTest2 {
	
	//두 개의 숫자(정수, 실수)를 받아서 더한 결과를 보내주기
	//정수형의 두 개 의 숫자를 받을 거야 (입력값) 좀더 정확하게 두루뭉실하게 하면 안돼
	//가로 안에 넣으면 돼
	int sum(int num1, int num2) { //2개 숫자 받기

		//return num1+num2; 한줄형태야
		int result = num1 + num2; //더하기
		return result; //(출력갑(반환값)) 더한 결과 보내주기
	}
	
	//구구단을 2~9단 출력하기
	//입력값 : 없음, 반환값 : 없음
	void print99dan() {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
	}
	
	//두 개의 정수를 받아서 (입력값) 곱하기한 결과를 리턴(반환값)하기
	int multiply(int x, int y) {
		return x*y;
		
	}
}









