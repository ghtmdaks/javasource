package classTest;

public class TV {
	// 속성(필드, 멤버변수, 프로퍼티) => 색상, 전원상태, 채널이 몇번이냐, ....
	String color; //red, blue, black... (null)
	boolean power;	//true:on, false:off (false)
	int channel;	//					(0) ()는 현재 초기화 되어있는 값
	
	// 동작(메소드) => 채널을 변경하다, 전원을 켜다/끄다
	//				속성을 통해 어떤 기능을 부여하고 싶으냐
	void channelUp() {
		//channelUp 가 해야하는 작업 작성, 현재 채널 7 => 8,9,10...
		channel++;
	
	}
	void channelDown() {
		//channelDown 가 해야하는 작업 작성, 현재 채널 7 => 6,5,4...
		channel--;
	}
	
	void power() {
		//power 가 해야하는 작업 작성 on => off, off => on
		power = !power; //현재 파워가 가지고 있는 거를 파워의 반대걸로 바꿔서 너줘
	}
}
