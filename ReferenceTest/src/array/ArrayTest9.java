package array;

public class ArrayTest9 {
	public static void main(String[] args) {
		int score[][] = {
			{100,100,100},
			{20,20,20},
			{30,40,30},
			{40,50,20},
			{50,60,50},
		};
//		int result[][] = new int [6][4]; //6행 4열로 만들어줘
		int result[][] = new int[score.length+1][score[0].length+1];

//		score 값을 result로 옮기기
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j <score[i].length; j++) {
//				옮기기
				result[i][j] = score[i][j];
//				행합계
//			 	result[0]. length => 4
				result[i][result[i].length-1]+=result[i][j];
				result[5][3] += score[i][j];
				
				//전체합계
				result[result.length-1][result[i].length-1]+=score[i][j];
			}
//			열합계
			result[result.length-1][0] += result[i][0];
			result[result.length-1][1] += result[i][1];
			result[result.length-1][2] += result[i][2];
		}
//		확인
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d",result[i][j]);
			}
			System.out.println();
		}
	}
}
