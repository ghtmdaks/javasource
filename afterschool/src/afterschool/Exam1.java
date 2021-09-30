package afterschool;

public class Exam1 {

	public static void main(String[] args) { //main 은 특수한 메소드
		// TODO Auto-generated method stub	
		
		int a = 3;
		{
			System.out.println(a);
			
		}
		//a cannot be resolved to a variable a를 해결 못하겠어
		System.out.println(a); //변수가 어디에 생기냐에 따라서 출력을 할 수 있냐 없냐
								// 구역 밖에서 a를 출력하려고 하면 오류떠 
								// a를 밖으로 빼버리면 오류를 해결 할 수 있어
	}

}
