package test;

public class WhileTest2 {
	public static void main(String[] args) {
		
		int sum=0, i=1;
		
		while(i<101) {
			sum = sum+i;
			//1+1 > 3
			//1+2 > 4
			
			i++;
		}
		System.out.println(sum);
		
		System.out.println();
		
		i=1;
		while(i<10) {
			System.out.printf("2 * %d = %d\t",i,(2*i));
			i++;
		}
	}
}
