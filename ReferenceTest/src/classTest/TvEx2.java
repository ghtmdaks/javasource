package classTest;

public class TvEx2 {

	public static void main(String[] args) {
		// 객체 선언, 생성
		// 나 설계도 TV2를 쓸거야
		TV2 tv1 = new TV2("black", 8);
		//TV2 tv1 = new TV2
		//tv1.color="black";
		//tv1.channel=8;
		// 컬러는 블랙이고 티비를 키면 처음은 채널8번으로 세팅해줘
		TV2 tv2 = new TV2();
		// 2번째는 기본 모양으로 만들어줘
		tv2.color="white";
		


		System.out.println("채널 상태 : " + tv1.channel);
		System.out.println("채널 상태 : " + tv2.channel);
	}

}
