package classTest;

public class AccountEx2 {
	public static void main(String[] args) {
		Account2 acc1 = new Account2();
//		acc1.acc = "122-01-12222";
//		acc1.mon = 100000;
//		acc1.name = "ȫ�浿";
		
		//�����ڸ� ������� �ʰ� ������� �� �ʱ�ȭ
		//���¹�ȣ
		acc1.setAcc("122-01-12222");
		//�̸�
		acc1.setName("ȫ�浿");
		//�ܾ�
		acc1.setMon(10000);
		
		//�Ա� 
		acc1.addmon(10000);
		System.out.println("�Ա� �� �ܾ� : "+acc1.getMon());
		
		//���
		System.out.println("�ܾ� : "+acc1.minmon(1000));
		
		
		//���������
		Account2 acc2 = new Account2("122-01-13333","������");
		System.out.println("���� �ܾ� ��ȸ : "+acc2.getMon());
		
		//�ں��˰���
		Account2 acc3 = new Account2("122-01-14444", 10, "�ں���");
		System.out.println("���� �ܾ� ��ȸ : "+acc3.getMon());
		
	}
}
