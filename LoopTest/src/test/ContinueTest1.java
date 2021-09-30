package test;

// continue; 반복문안에서 사용되며, 블록 내에서 continue 문이
// 실행되면 'for문'의 증감식, while 조건식으로 이동


public class ContinueTest1 {

	public static void main(String[] args) {
		for(int i = 0; i< 10; i++) {
			if(i%2!=0) {
				continue;
				
			}
			System.out.println(i);
		}
	}

}
