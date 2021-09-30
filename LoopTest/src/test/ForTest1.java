package test;

public class ForTest1 {
	public static void main(String[] args) {
		// ; 
		//for 실행 순서
		//① int i = 0; 		=> 0으로 시작돼
		//② i < 10; 		=> i가 10까지 실행돼
		//③ 반복해야 할 작업 실행 	=> System.out.println("안녕하세요");
		//④ i++ (i=i+1) i=1 			=> i가 1씩 증가
		//⑤ i < 10;			
		//⑥ 반복해야 할 작업 실행 	=> System.out.println("안녕하세요");
		//⑦ i++ (i=i+1) i=2
		//⑧ i < 10;
		//⑨ 반복해야 할 작업 실행 	=> System.out.println("안녕하세요");
		//반복...
		//i=9
		//i<10;
		//ㅇ 반복해야 할 작업 실행 	=> System.out.println("안녕하세요");
		//i=10
		//i<10; 조건 불만족 => for 루프를 빠져나감 => for 종료
		
		
		for (int i = 0; i < 10; i++) {//10번 돌릴거야 
			//반복해야할 작업
			System.out.println("안녕하세요");
		}
		
		System.out.println();
		
		//1~10가지 출력
		//1)	int i=1;
		//2)	i<11;
		//3)	System.out.println(i);
		//4)	i++
		//5)	i<11;
		//6)	System.out.println(i);

		for(int i=1;i<11;i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//i=i+i; => i++;
		//I=i+2; => i+=2;
		
		// 0~10까지 짝수만 출력
		for(int i=0;i<11;i+=2) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		
		// 3의 배수 100까지
		for(int i=3;i<100;i+=3) {
			System.out.print(i+"  ");
		}
		
		
		
		//1~100 까지 정수 중에서 3의 배수만을 더하는 프로그램 작성
		int sum = 0 ;
		for(int i=1;i<100;i+=3) {
			if(i%3==0 && i%9!=0) {
						//단, 9의 배수는 더하지 않기
				sum = sum+i; // sum+=i
			}
			System.out.println("3의 배수이고 9의 배수는 아닌 합 :  " +sum);
			System.out.println();
			
			//1~100 까지 정수 중에서 3의 배수 이거나, 5의 배수인 수의 합
			sum = 0 ;
			for(int j=1;j<101;j++) {
				if(j%3==0 || j%5==0) {
							//단, 9의 배수는 더하지 않기
					sum = sum+j; // sum+=j
				}
			
			}
		} 
		
			System.out.println("3의 배수이거나 5의 배수인 수의 합 :  " +sum);
		
		
	}
}