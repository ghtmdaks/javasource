package test;

public class DoWhileTest1 {
	public static void main(String[] args) {
		
		int i = 0;

		//실행문을 우선 실행하고 조건 검사하여
		//다음 반복을 수행할 지 결정
		
		
		do { //무조건 해
			System.out.println("안녕하세요");
		}while(i>0); //나중에 조건을 볼까? 
						//어? 조건 안맞네 그럼 끝
	}

}
