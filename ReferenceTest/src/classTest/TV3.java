package classTest;

public class TV3 {
	// 속성(필드, 멤버변수, 프로퍼티) => 색상, 전원상태, 채널이 몇번이냐, ....
	private String color; //red, blue, black... (null)
	private boolean power;	//true:on, false:off (false)
	private int channel;	//					(0) ()는 현재 초기화 되어있는 값
	
	// 생성자
	TV3(){
		//괄호안에 아무것도 없는 생성자를 default(기본) 생성자라고해
		//명시적으로 생성자가 하나도 선언되지 않았다면 컴파일러가 자동으로 만들어내줘
	}
	TV3(String color, int channel){
		this.color = color;
		this.channel = channel;
		//this는 내가 갖고 있는 컬러
		//내가 갖고 있는 채널을 의미해
		//생성자 두개부터 오버로딩이라고해
		//괄호안의 형태가 달라야해
	}
	public TV3(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
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
