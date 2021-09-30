package interfaceTest;

public class PlayEx {
	public static void main(String[] args) {
		// Cannot instantiate the type PlayingCard 추상클래스에서 봤던 키워드야!
		// 얘도 객체 생성이 안돼!
		// PlayingCard card = new PlayingCard();
		
		// PlayingCard.DIAMOND; 
		
		PlayingCard card = new Playing();
		card.getCardKind();
		
	}
}
