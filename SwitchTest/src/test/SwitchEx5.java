package test;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {
		// 사용자한테 숫자 2개 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 : ");
		int a = sc.nextInt();
		
		System.out.print("숫자2 : ");
		int b = sc.nextInt();
		
		// 연산자 입렵받기(+,-,*,/,%)
		
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		// + / * => '+' or "+"
		String op = sc.next();

		//switch(연산자)
		// 연산 후 계산 결과 출력
		int result =0;
		switch (op) {
		case "+":
			result = a + b;
			//System.out.println(a + op + b + "=" + (a+b));
//								  op가 문자(string)
			break;
		case "-":
			result = a - b;
			//System.out.println(a + op + b + "=" + (a-b));
			break;
		case "/":
			result = a / b;
			//System.out.println(a + op + b + "=" + (a/b));
			break;
		case "*":
			result = a * b;
			//System.out.println(a + op + b + "=" + (a*b));
			break;
		case "%":
			result = a % b;
			//System.out.println(a + op + b + "=" + (a%b));
			break;
//		default:
//			System.out.println("연산자를 확인해 주세요.");
//			break;
		}
		System.out.printf("%d %s %d = %d",a,op,b,result);
		//				   정수  문자  정수  정수로 잡아 넣을거야, 뒤에 순서대로 밀어넣는 방식이야 %c, %f 도 있어
		//																	문자, 실수
	}

}
