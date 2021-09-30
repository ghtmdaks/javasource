package test;

public class Exam2 {
	public static void main(String[] args) {
		//중첩 for 문을 사용해서 방정식 4x+5y=60 의 모든 해를
		
		
		//단, x,y는 10이하 자연수
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4*x+5*y==60) {
					
				}
				//구해서 x,y 형태로 출력하기
				System.out.printf("(%d, %d)\n",x,y);
			}
		}
	}
}

// 복습///////////////////////////////////////////////////////