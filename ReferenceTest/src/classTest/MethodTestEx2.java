package classTest;

public class MethodTestEx2 {

	public static void main(String[] args) {
		// 객체 생성
		MethodTest2 obj = new MethodTest2();
		
		//나는 구구단 출력하는 기능이야
		obj.print99dan();
		
		//덧셈 기능
		//메소드를 호출하는 쪽에서 입력값을 넣어주기
		obj.sum(11, 15);
		//obj. sum (10.5, 11.5);
		//정수형이 아닌거는 입력값으로 주면 안돼
		
		//형변환
		//1) 자동형변환 (프로모션) 작은  타입을 큰 타입에 넣는거
		//2) 강제형변환 (캐스팅) ex) int =(int)float
		//					큰 타입을 작은 타입에 넣는거
		//지금 한거는 프로모션
		byte b1 = 3;
		byte b2 = 5;
		obj.sum(b1, b2);
		
		

	}

}
