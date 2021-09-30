package afterschool;

public class Exam9 {

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
		
		
		
	}
}
