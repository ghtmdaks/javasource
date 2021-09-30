package test;

public class ForTest2 {
	public static void main(String[] args) {
		// 1~10 까지 합 출력
		int sum=0;
		for(int i=1;i<11;i++) {
			sum = sum+i;
			
		}
		System.out.println(sum);
		
		// 1~100 까지 합 출력
		sum=0;
		for(int i=1;i<101;i++) {
			sum = sum+i;
			
		}
		System.out.println("1 ~ 100 까지 합 "+sum);
	}
}
