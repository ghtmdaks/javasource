package array;

public class ArrayTest1 {
	public static void main(String[] args) {
		//int 타입의 변수 10개 생성
		//int a=1, b=2, c=3, d=4...;
		
//		int sum;
//		sum =0;
//		System.out.println(sum);
		
		// 배열 (참조타입)
		// 참조타입 : 힙/null/자동으로 초기화
		// 정수:0, 실수:0.0, 불린:false 로 초기화 할 수 있어
		int arr[]=new int[10];

		// 개별 요소에 접근 0번부터 시작
		System.out.println(arr[0]);
		System.out.println(arr[9]);

		arr[3]=90;
		arr[5]=85;
		arr[7]=65;
		
		// 배열 전체 요소 출력
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);
		System.out.println(arr[9]);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}
}
