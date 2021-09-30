package exception;

public class UnCheckedException {
	public static void main(String[] args) {
		
//		if(args.length ==  2) {
//			// ArrayIndexOutOfBoundsException
//			String data1 = args[0];
//			String data2 = args[1];
//			
//			System.out.println("args[0] "+data1);
//			System.out.println("args[1] "+data2);
//		}
		
		String data1 = null;
		String data2 = null;
		
		try { //예외가 발생할 수 있는 구문
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			// 예외가 발생하면 어떻게 처리할 것인지 작성
			System.out.println("실행 매개 변수 수가 부족합니다.");
		}

	}
}



















