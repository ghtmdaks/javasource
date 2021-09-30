package test;

public class SwitchEx4 {

	public static void main(String[] args) {
		// 8 : 출근을 합니다.
		// 9 : 회의를 합니다.
		// 10 : 업무를 봅니다.
		// 나머지 : 외근을 나갑니다.
		
		// 8~11 사이의 숫자가 나오도록 작성

		// (int)(Math.random()*6) => 0~5 주사위
		// (int)(Math.random()*4) => 0~3
		int time = (int)(Math.random()*4)+8;
		
		switch (time) {
		case 8:
			System.out.println("출근을 합니다.");
			break;
		case 9:
			System.out.println("퇴근을 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}	
	}
}
