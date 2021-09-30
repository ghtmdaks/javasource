package afterschool;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		// 정수를 입력하고 마지막에 0을 입력하세요
		System.out.println("정수 입력하고 마지막에 0을 입력하세요.");
		int num;
		int count = 0;
		double sum = 0;
		
		//사용자한테 int 값을 입력받고 , num이라는 변수에 담고,
		//num이 0이 아니어야 한다.
		while((num = sc.nextInt())!= 0) { //소괄호를 묶어서 우선순위를 정해주자
			sum += num;
			count++;
		}
		// 입력한 개수는 몇 번 돌았냐와 관련있어
		System.out.println(count);
		// 입력한 수의 개수는 *개 이며 평균은 **.* 입니다
		//System.out.printf("입력한 수의 개수는 %d개 이며 평균은 %.1f 입니다",count,sum/count);
		//System.out.printf("입력한 수의 개수는 %d개 이며 평균은 %.1f 입니다",count,sum/(double)count);
		//System.out.print("입력한 수의 개수는 "+count+"개 이며 평균은 "+sum/count+" 입니다");
	}
}

		
