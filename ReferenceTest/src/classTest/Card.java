package classTest;

public class Card {
	//멤버변수
	//객체생성
	private String kind; //카드 모양 지정
	private int number; //카드 숫자 지정

	//static(정적) : 클래스에 고정된 멤버
	//				객체를 생성하지 않고 사용하세요
	//				클래스가 메모리에 로드될 때 생성
	//클래스변수
	//객체들이 여러개 생성되면서 그때마다 공통된 값으로 카드의 크기르 고정하고 싶다
	//그럴때 스태틱을 쓰면 돼
	static int height = 10; //세로 길이 지정
	static int width = 7; //가로 길이 지정
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public int getNumber() {
		return number;
	}

	// static(정적) 메소드 : 객체를 생성하지 않고 사용
	//					  클래스가 메모리에 로드될 때 생성
	//					 static 메소드 안에서 인스턴스 멤버 사용불가
	public static int getHeight() {
		//kind=""; 인스턴스멤버 사용 불가
		//getNumber(); 인스턴스멤버 사용 불가
		
		//getHeight(); O~K!!
		return height;
	}

	public static int getWidth() {
		return width;
	}
	
	
	

	
	
	
}
