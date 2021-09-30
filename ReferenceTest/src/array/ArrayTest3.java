package array;

public class ArrayTest3 {
	public static void main(String[] args) {
		// int 타입의 배열 5개 생성
		// 0 10 20 30 40
		
		 int arr[] = {0, 10, 20, 30, 40};
		 
//		 for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+"\t");
//		}
		
			//String 타입의 배열 5개 생성
		 	// 과일 이름 초기화
		 
//		 String fruit[] = {"사과", "멜론", "키위"};
//		 for (int i = 0; i < fruit.length; i++) {
//			System.out.print(fruit[i]+ "\t");
//		}
		 
		//향상된 for 문
				for(int idx:arr) {
					System.out.print(idx+"\t");
				}

	}

}
// 복습//////////////////////////////