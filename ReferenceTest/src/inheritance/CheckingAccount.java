package inheritance;

public class CheckingAccount extends Account2 {
	//���¹�ȣ, ������, �ܾ� => �θ�
	//�Ա��ϴ�, ����ϴ� => �θ�
	
	//ī���ȣ(111-11-1234)
	private String cardNo;

	public CheckingAccount(String acc, int mon, String name, String cardNo) {
		super(acc, mon, name);
		this.cardNo = cardNo;
	}
	//�Է°� : ī���ȣ, ���ݾ�
	//��ȯ�� : ����(int)
	//ī�尪�� �����Ѵ�(�Ѿ�� ī���ȣ�� ���� �߱޵� ī���ȣ�� ������,
	//	���ݾ��� ���� �ܾ׺��ٴ� ������ Ȯ���� �� ī�尪 ����)
	
	int pay (String carNo, int cash) {
		
		if(!cardNo.equals(this.cardNo)||getMon()<cash) {
			System.out.println("ī���ȣ�� ���ݾ��� Ȯ���� �ּ���");
			return 0;
		}
			
		//�ܾ� = ���� �ܾ� - ī�����
		//setMon(getMon() - cash);
		//�θ��� minmon�� ������ ��ɰ� ����
		//���� �ٽ� ������ ���� �θ��� minmon�� ����ϸ� ��
		return minmon(cash);
		
	}
	
	
}
