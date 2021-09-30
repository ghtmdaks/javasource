package afterschool;

public class Exam06 {

	public static void main(String[] args) {
		// a~z 출력 아스키 코드표 참고 a=97 A=65
		for(char ch='a'; ch<='z';ch++) {
			System.out.println(ch+" ");
		}
		for(char ch='A'; ch<='Z';ch++) {
			System.out.println(ch+" ");
		}
		for(char ch='ㄱ'; ch<='ㅎ';ch++) {
			System.out.println(ch+" ");
			//한글은 순차적으로 뽑을 수 있지만 이상하게 나와
			
		}
	}
}


