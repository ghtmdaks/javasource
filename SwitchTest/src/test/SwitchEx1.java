package test;

/*switch(int,double,float,char,String,enum){
 * case 값1:
 * 		해야할 일;
 * 		break;
 * case 값2:
 * 		해야할 일;
 * 		break;
 * default:
 * 		해야할 일;
 * }
 * 
 * if ~ else if ~ else 대체해서 사용 가능
 */

public class SwitchEx1 {
	public static void main(String[] args) {
		//주사위 
		
		// 1~6 사이의 수를 자동으로 생성
		// 0.0 <= 어떤값 < 1.0
		
		int num = (int)(Math.random()*6)+1; //우항은 실순데 정수로 만들고 싶어 앞에다가 인트
		
//		if (num==1) {
//			System.out.println("1번 나옴");
//		}else if (num==2) {
//			System.out.println("2번 나옴");
//		}else if (num==3) {
//			System.out.println("3번 나옴");
//		}else if (num==4) {
//			System.out.println("4번 나옴");
//		}else if (num==5) {
//			System.out.println("5번 나옴");
//		}else {
//			System.out.println("6번 나옴");
//		}
		
		switch (num) {
		case 1:				//num이 1이라면
			System.out.println("1번 나옴");
			break;
		case 2:
			System.out.println("2번 나옴");
			break;
		case 3:
			System.out.println("3번 나옴");
			break;
		case 4:
			System.out.println("4번 나옴");
			break;
		case 5:
			System.out.println("5번 나옴");
			break;
		default:
			System.out.println("6번 나옴");
		}
	}
}
