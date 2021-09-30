package classTest;

public class AccountEx3 {
	public static void main(String[] args) {
		//Account3 객체를 5개를 생성하고 싶어
		Account3 acc1 = new Account3("122-12", 250000, "홍길동");
		Account3 acc2 = new Account3("122-13", 260000, "장길동");
		Account3 acc3 = new Account3("122-14", 270000, "김길동");
		Account3 acc4 = new Account3("122-15", 280000, "최길동");
		Account3 acc5 = new Account3("122-16", 290000, "이길동");
		
		//동일한타입으로 객체를 생성한다면 좀 더 효율적인 방법이 없을까?
		//클래스 배열
		//타입	 배열명					5개
		Account3 accArr[] = new Account3[5];
		System.out.println(accArr[0]); // null 이나와
		
		accArr[0] = new Account3("122-12", 250000, "홍길동");
		accArr[1] = new Account3("122-13", 260000, "장길동");
		accArr[2] = new Account3("122-14", 270000, "김길동");
		accArr[3] = new Account3("122-15", 280000, "최길동");
		accArr[4] = new Account3("122-16", 290000, "이길동");
					
		// int a,b,c,d,e,.....; => int arr[]=new int[10];
		// arr[0] print => 0
		// double arr[] => new double[5]; arr[0] => 0.0
		
//		for(int i=0; i<accArr.length; i++) {
//			System.out.println(accArr[i].getName+"\t");
//			System.out.println(accArr[i].getAcc()+"\t");
//			System.out.println(accArr[i].getBalance());
//		}
		
		
		
		
		
	}
}
