package afterschool;

public class Exam13 {

	public static void main(String[] args) {
		//	       행열			    행  열
		int arr[][] = new int[3][3];
		// 초기화 값은 0으로 이미 들어가 있어
		System.out.println("행의 길이 "+arr.length);
		System.out.println("열의 길이 "+arr[0].length);
		System.out.println("열의 길이 "+arr[1].length);
		//						열의 길이를 물어보려면 번호를 지정해줘야해
		//for문은 무조건 1차원 이기 때문에 2개 써줘야돼
		for(int i=0; i<arr.length; i++) {//행의 길이
			for(int j=0; j<arr[i].length; j++) {//열의 길이까지 돌아줘야해
				arr[i][j]=j+1; 
				//이 좌표에     이 값을 넣어줘
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {//행의 길이
			for(int j=0; j<arr[i].length; j++) {//열의 길이까지 돌아줘야해
				System.out.printf("%2d",arr[i][j]);
			}					//2자리형태로 출력해줘
			System.out.println();
		}
		
	}
}
