package inheritance;

public class CheckingAccountEx {

	public static void main(String[] args) {
		CheckingAccount checkinAccount = new CheckingAccount("122-12", 200000, "ȫ�浿", "122-12-133");
		
		//ī�� ��ȣ �ȸ´� ���
		//System.out.println(checkinAccount.pay("322-12", 20000));
		
		//ī���ȣ �´� ���
		System.out.println("���� �ܾ� " + checkinAccount.pay("122-12-133", 20000));
	}

}
