package afterschool;

public class Exam8 {

	public static void main(String[] args) {
		// 같은 타입을 원해 그리고 연속된 값을 원해 그러면 무조건 배열을 써야해
		// 배열은 for 문 무조건 써줘야해
		
		// 배열 => 힙(new)
		
		// 배열 선언
		int arr[];
		
		// 생성
		arr = new int[10];
		//0~9번 index(방)이 생겼고 그 안에 0이 하나씩 다 들어가 있어
		
		
		// 초기화
		// 1 ~ 10까지 값을 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;	//[] index(방) 안에 i+1 을 넣어줘
			
		}
		//사용
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}
