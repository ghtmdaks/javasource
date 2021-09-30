package inheritance;

//Account2
//CheckingAccoung

public class TrafficCardAccount extends CheckingAccount{

// CheckingAccount => ���¹�ȣ, ������, �ܾ�, ī���ȣ, 
// CheckingAccount => �Ա��ϴ�, ����ϴ�, üũī�� ����, 

	//����ī�� ��� ����
	private boolean hasTrafficCard;
	
	public TrafficCardAccount(String acc, int mon, String name, 
							String cardNo, boolean hasTrafficCard) {
		super(acc, mon, name, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}
	
	
	//����ī�� ����� �ִٸ� ����� �����Ѵ�.
	// �Է°� : ī���ȣ, ����� ����
	// ��ȯ�� : ����
	int payTrafficCard(String cardNo, int cash) {
		if(!hasTrafficCard) {// hasTrafficCard!=true
			System.out.println("����ī�� ����� �����");
			return 0;
		}
		return pay(cardNo, cash);
	}
}







