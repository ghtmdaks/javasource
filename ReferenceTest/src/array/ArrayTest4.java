package array;

public class ArrayTest4 {
	public static void main(String[] args) {
		int score[]= {78,65,95,88,36,45,25,47,87,43};
		
		//평균 = 합계 / 개수 (scotr.length)
		
		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			sum = sum + score[i]; //sun+=score[1];
//			
//		}
		
		for(int point:score) { // score 다 가지고 있는 걸 하나씩 자동으로 가지고 나와서 포인트에 담아줘
			sum += point;
		}
		
		
		System.out.printf("합계 : %d, 평균 : %d",sum,sum/score.length);
		
	}
}
