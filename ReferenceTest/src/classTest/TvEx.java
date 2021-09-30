package classTest;

public class TvEx {

	public static void main(String[] args) {
		// 객체 선언, 생성
		TV tv = new TV();
		
		//주소 찍어내면 힙에서 값을 가져와
		System.out.println(tv);
		
		//객체 조작
		tv.power = true; //on 전원을 켰어
		tv.channel = 2; //틀자마자 나오는 채널이 2번이야
		
		tv.channelUp(); // 메소드 호출 일 시킬려고
						// 리모컨에서 위방향으로 눌러준거야
		
		System.out.println("채널 상태 : " +tv.channel);
	}

}
