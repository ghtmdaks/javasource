package afterschool;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		// 저는 3명의 학생이 있고 3과목의 시험에 대한 점수를 입력 받고자 해
		// 2차원 배열
		int student[][] = new int [3][3];
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		System.out.println("각 학생의 과목별 점수를 입력해 주세요");

		for (int i = 0; i < student.length; i++) {
			System.out.printf("%d번\n",i+1); //첫번째 사람부터 입력해봐 (친절을 배풀어)
			for (int j = 0; j < student[i].length; j++) {
				student[i][j]=sc.nextInt();
			}
		}
		
		// 출력
		System.out.println("----------------학생별 점수 현황-----------------");
		System.out.println("번호\t국어\t영어\t수학\t총합\t평균");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < student.length; i++) {
			System.out.printf("%d번\t",i+1); //첫번째 사람부터 입력해봐 (친절을 배풀어)
			for (int j = 0; j < student[i].length; j++) {
				System.out.print(student[i][j]+"\t");
				sum+=student[i][j]; // sum 을 어떻게 하는지 작업하기
			}
			System.out.printf("%d\t%.1f\n",sum,(double)sum/student.length);
		}
	}
}