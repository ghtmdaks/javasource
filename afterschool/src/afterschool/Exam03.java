package afterschool;

public class Exam03 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55
		
		int sum = 0;
		for (int i = 1; i < 11; i++) { //규치적인 프로그램을 하려면 for문이 좋아
			sum+=i;
			System.out.print(i);	
//			1 2 3 4 5 6 7 8 9 10
			if (i<10) {
				System.out.print(" + ");
//			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
			} 
		}System.out.printf(" = %d", sum);
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
	}
}
