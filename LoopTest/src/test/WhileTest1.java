package test;

public class WhileTest1 {
	public static void main(String[] args) {
//	for(int i=1;i<10;1++) {
//		//반복해야할 작업
//		syso("안녕하세요")
//	}

		
		int i=0;
		while(i<10) {
			//반복해야할 작ㅇ업
			System.out.println("안녕하세요");
			i++;
			
		}
		System.out.println();
		
		i=1;
		while(i<11) {
			System.out.print(i+"\t");
			i++;
			
		}
		System.out.println();
		//2의 배수
		i=0;
		while(i<11) {
			System.out.print(i+"\t");
			i+=2;
			
		}
		System.out.println();
		//3의 배수
		i=3;
		while(i<101) {
			System.out.print(i+"\t");
			i+=3;
			
		}
		
	}
}
