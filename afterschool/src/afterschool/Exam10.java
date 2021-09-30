package afterschool;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		
		int sum = 0;

		//int 타입을 5개 저장하는 배열 생성
		int arr[] = new int[5];
		// 배열의 초기화를 위해 사용자로부터 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5명의 점수를 입력하세요");
		
//		System.out.print("첫번째 점수 입력");
//		arr[0] = sc.nextInt(); // arr0번 방에 점수를 넣을거야
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"번째 점수 입력 : ");
			arr[i] = sc.nextInt();
		}
		//입력받은 값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			//10 20 30 40 50 출력
			sum += arr[i];
		
		}
		System.out.println();
		System.out.printf("합계 : %d, 평균 : %.1f", sum, (double)sum/arr.length);
		// 배열 안에 합계를 구하려면 for 문을 써야해								5개의 방을 가지고 있는 length
	}
}

