import java.util.Scanner;

// 	shift연산자
//	<< >> <<<
// 다중 선택문제에서 사용

// 예제) 카페
// 24시간 = 1<<0	:1
// 주차 = 1<<1	:2
// 흡연실= 1<<2	:4
// 와이파이 1<<3	:8
// A특성 = 1 -> 24시간
// B특성 = 3 -> 24시간 + 주차
// C특성 = 12 -> 흡연실 + 와이파이
// D특성= 13 -> 24시간 + 흡연실 + 와이파이

//	대부분 2항 연산
//		a > 2
//		1 + 2

//	1항(단항) 연산
//		!d

//	3항 연산
//	조건을 따져서 넣고 싶을 때 넣는 연산

//	연산자라는 것들은 Stack 영역이 대상; *면접포인트

public class OperatorMain2 {
	public static void main(String[] args) {
		int a = 3 << 2; // 10진수 3을 2진수 11로 바꾼다음 왼쪽으로 2칸 밀어주고 민 만큼 00을 붙여준다
						// 3(10) - > 11(2)
						//			1100 => 12
		System.out.println(a);
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = k.next();

		System.out.print("나이 : ");
		int age = k.nextInt();

		// 3항 연산
		// 		조건식 ? 만족시켰을때 값 : 만족 못 시켰을 때 값
		// 20살 이상이면 ?	 안녕하세요	 :	  나가
		
		// 이름이 홍길동이면 어? 야!!!, 아니면 어서오세요
		//String say2 = (name == "홍길동") ? "어? 야!!!" : "어서오세요"; 
		// == stack 영역인데 string 은 힙영역이라서 안돼 그래서 .equals 로 표현해줘야해
		String say2 = (name.equals("홍길동")) ? "어? 야!!!" : "어서오세요";
		System.out.println(say2);
		
		String say = (age >= 20) ? "안녕하세요" : "나가";
		System.out.println(say);
		
		// 나이가 짝수면 짝, 홀수면 홀
		String oe = (age % 2 == 0) ? "짝" : "홀";
		System.out.println(oe);
			
	}
}