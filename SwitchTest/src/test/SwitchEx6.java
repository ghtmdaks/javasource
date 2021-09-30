// 조건문 => if/switch
// 연산자 => 관계 연산자
//			>, <,	>=....
//			&&(and), ||(or)


package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 가위(1), 바위(2), 보(3)
		// 상대방 = 컴퓨터
		// 랜덤 1~3 자동으로 생성 => 3
		int com = (int)(Math.random()*3)+1;
		
		// 나 = 입력자 => 2
		System.out.println("안내면진거 1(가위), 2(바위), 3(보)");
		int me = sc.nextInt();
		
		System.out.println("나 : "+me+", 컴퓨터 : "+com);
		
		// 출력문은 나를 기준 패배 / 승리 / 무승부	
		switch (me-com) {// 3-2
		case 1: case -2:
			System.out.println("승리");
			break;
		case 2: case -1:
			System.out.println("패배");
			break;
		case 0:
			System.out.println("무승부");
			break;

		}
	}

}
