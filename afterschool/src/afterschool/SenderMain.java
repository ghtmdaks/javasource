package afterschool;

public class SenderMain {
	public static void main(String[] args) {
		// MessageSender messageSender = new MessageSender(); 객체생성을 안할거야! 대신 나는 자식을 통해서만 쓸거야
		
		// 객체 생성을 할 때 아래 2가지 방식을 허용하는 형태는 extends, implements
		// 2개의 차이점
		// 왼쪽이 부모인 경우는 매개변수(괄호안에 들어오는 인자)의 형태로 쓰일 때
		// 		직접적으로 호출하는 메소드를 제공하지 않을 거고 
//		EmailSender emailSender = new EmailSender("홍길동", "안녕하세요", "성춘향", "안녕");
//		MessageSender messageSender = new EmailSender("홍길동", "안녕하세요", "성춘향", "안녕");
	}

}
