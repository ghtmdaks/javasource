package test;

import java.util.Scanner;

public class DoWhileTest3 {
	public static void main(String[] args) {
		// 컴퓨터가 1~100사이의 정수를 임의로 선정
		// 사용자는 컴퓨터가 가지고 있는 숫자가 무엇인지 알아맞추기
		Scanner sc = new Scanner(System.in);
		
		// 0~99
		int answer = (int)(Math.random()*100)+1; //컴퓨터가 65를 가지고 있다고 치자
		int input = 0;
		do {
		
			System.out.print("어팬다운어팬다운 >> ");
			input = sc.nextInt(); //나는 50을 입력했지 그럼 아닌거잖아 컴퓨터가 낸거 맞추는 건데
			
			if(input < answer) {
				System.out.println("Up");
			}else {
				System.out.println("Down");
			}
			
			
			
		}while(input != answer);
		 
		 System.out.println("정답");
		 
	}
}
