package classTest;

public class CardEx {
	public static void main(String[] args) {
		Card card1 = new Card("spade",8);
		cardPrint(card1);//�� ī�� �� ������ ������~
		
		//The static field Card.width should be accessed in a static way
		//card1.width = 10;
		//card1.height = 7;
		//�������� ī�带 �����ϴ� ����� Ŭ�����̸�. ���� ���� ����ؾ���
		//Card.width=8;
		//Card.height=4;
		
		Card card2 = new Card("heart",2);
		cardPrint(card2);
	}
	static void cardPrint(Card card){
		System.out.println("����"+card.getNumber());
		System.out.println("���"+card.getKind());
		System.out.printf("ī�� ũ��(%d,%d)\n",Card.width,Card.height);
		System.out.println();
	}
}
