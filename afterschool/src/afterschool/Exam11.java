package afterschool;

public class Exam11 {

	public static void main(String[] args) {
		// 같은 타입을 원해 그리고 연속된 값을 원해 그러면 무조건 배열을 써야해
		// 배열은 for 문 무조건 써줘야해
		
		// 배열 => 힙(new)
		
		// 배열 선언과 생성, 초기화 까지 
		int arr[]= {1,25,37,45,50,69,77,58,19,10};
	

		//사용
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int j:arr) {
			// 변수의형태 배열이름 아무거나: 배열명
			// arr 이라는 배열에서 하나씩 꺼내 그 꺼낸거를 j에 담아 라는 의미
			System.out.print(j+" ");
			// 그래서 나는 j만 출력하면 돼
			// 향상된 for 문은 보통 출력하는 곳에 쓰면 돼 간편하게 출력을 하고 싶을 때, 아무대나 쓰는거 아니야
			
			
		}
		
		
		
	}
}
