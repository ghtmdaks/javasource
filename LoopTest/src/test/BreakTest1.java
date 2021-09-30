package test;

// break; 반복문을 중지시켜줘!
public class BreakTest1 {
	public static void main(String[] args) {
	
		while(true) {
			//주사위를 돌려서 6이 나오면 반복문 종료
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num==6) {
				break;
			}
		}
	}
}
