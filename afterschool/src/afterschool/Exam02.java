package afterschool;

public class Exam02 {

	public static void main(String[] args) {
		
		int i = 1;
		if (i<10) {
			System.out.println(i);
			System.out.println("안녕하세요");
		} // if문 에 블록지정은 필수는 아니야 한꺼번에 처리하는 거야 라고 그룹을 지정해주는거야
		  // 실행할게 여러게면 중괄호를 써서 알아보기 쉽게 해줘야해
		
		for(i=0; i<10; i++) 
		//(int i;...)를 쓰게 되면 동일한 이름으로 똑같이 선언해서
		//오류가 생겨
			System.out.println(i);// 실행할게 한줄이면 안묶어도 돼

		switch (i) {
		case 1:
			
			break;

		default:
			break;
		}
	}

}
