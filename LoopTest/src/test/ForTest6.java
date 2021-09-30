package test;

/* 2*1=2
 * 2단 끝나면 3단 시작 쭉
 */
public class ForTest6 {
	public static void main(String[] args) {
		
		
		for(int i=2;i<10;i++) {  //앞쪽
			for(int j=1;j<10;j++) { //뒤쪽
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				
				
			}
		}
	System.out.println();
	
		for(int i=2;i<10;i++) {  //앞쪽
			for(int j=1;j<10;j++) { //뒤쪽
				System.out.printf("%d * %d = %2d\t",i,j,i*j);
			}
			System.out.println();
		}

		
	}
}
