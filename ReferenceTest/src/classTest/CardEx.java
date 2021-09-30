package classTest;

public class CardEx {
	public static void main(String[] args) {
		Card card1 = new Card("spade",8);
		cardPrint(card1);//나 카드 원 너한테 보낼게~
		
		//The static field Card.width should be accessed in a static way
		//card1.width = 10;
		//card1.height = 7;
		//정적으로 카드를 접근하는 방식은 클래스이름. 으로 만들어서 사용해야행
		//Card.width=8;
		//Card.height=4;
		
		Card card2 = new Card("heart",2);
		cardPrint(card2);
	}
	static void cardPrint(Card card){
		System.out.println("숫자"+card.getNumber());
		System.out.println("모양"+card.getKind());
		System.out.printf("카드 크기(%d,%d)\n",Card.width,Card.height);
		System.out.println();
	}
}
