package afterschool;

public class CreditLineAccount extends Account2{
	private int creditLine; // ���̳ʽ� �ѵ�
	
	public CreditLineAccount(String acc, int mon, String name,int creditLine) {
		super(acc, mon, name);
		this.creditLine=creditLine;
	}
	//���¹�ȣ,������,�ܾ�,���̳ʽ��ѵ�  /�Ա��ϴ�, ����ϴ�
	
	
	//����ϴ� �������̵�
	//�θ��� ��� : �ܾ� = �ܾ� - ��ݾ�
	//�ڽ� : �ܾ�(�����ܾ� + ���̳ʽ� �ѵ�) - ��ݾ�
	@Override
	int minmon(int cash) {
		// �����ܾ�+���̳ʽ� �ѵ� �ʵ� ���� ���ݾ��� ������ ����Ұ� �޼��� ���, 0�� ����
		if (getMon()+creditLine < cash) {
			System.out.println("�ѵ��ʰ�");
			return 0;
		}
		// �ܾ�(�����ܾ� + ���̳ʽ� �ѵ�) - ��ݾ�
		setMon(getMon()-cash);
		
		return getMon();
		
	}


	@Override
	public String toString() {
		return "CreditLineAccount [creditLine=" + creditLine + "]";
	}
}
