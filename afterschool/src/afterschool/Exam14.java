package afterschool;

public class Exam14 {

	public static void main(String[] args) {
		//	       행열			   
		int arr[][] = {
			  {45,55},
			  {65,66,77},
			  {88,99,22,33}
		};
				
		System.out.println("행의 길이 "+arr.length);
		System.out.println("열의 길이 "+arr[0].length);
		System.out.println("열의 길이 "+arr[1].length);
		System.out.println("열의 길이 "+arr[2].length);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%d ",arr[i][j]);
			}					
			System.out.println();
		}
		
	}
}
