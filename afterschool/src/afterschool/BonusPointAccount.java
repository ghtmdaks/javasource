package afterschool;

public class BonusPointAccount extends Account2{

//���¹�ȣ ������ �ܾ�  
//���ʽ�����Ʈ 
	private int bonusPoiunt;
//�Ա��ϴ�(���ʽ� ����Ʈ �߰�) ����ϴ� 
	public BonusPointAccount(String acc, int mon, String name, int bonusPoiunt) {
		super(acc, mon, name);
		// TODO Auto-generated constructor stub
		this.bonusPoiunt = bonusPoiunt; // ���ʽ�����Ʈ��ī��Ʈ ��ȣ�� �� �������� ��Ʈ ���� �߰�, 
										// �𽺺��ʽ�����Ʈ �߰��� �ʱ�ȭ �����ش�.
	}
	
	
	@Override
		void addmon(int cash) {
			// �����ϴ�,
			//setMon(getMon()+cash);
			super.addmon(cash);
			
			//���ݾ��� 0.1%�� ���ʽ� ����Ʈ�� ��� �;�
			bonusPoiunt += cash * 0.001; // ���ʽ� ����Ʈ 0.1 ��������ؼ� 0.001�� �����ش�
			
			
			
		}


	public int getBonusPoiunt() {
		return bonusPoiunt;
		
		
	}


	@Override
	public String toString() {
		return "BonusPointAccount [bonusPoiunt=" + bonusPoiunt + "]";
	}
}




