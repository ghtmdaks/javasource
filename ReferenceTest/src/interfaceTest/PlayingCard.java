package interfaceTest;

public interface PlayingCard {
	int SPADE = 4; // public static final 생략 가능
	final int DIAMOND = 3; // public static final
	static int HEART = 2;
	
	public abstract String getCardNumber();
	String getCardKind();//public abstract 생략가능
	
}
