package inheritance;

public class BonusPointAccountEx {
	public static void main(String[] args) {
		BonusPointAccount bonus = new BonusPointAccount("122-12",10000,"ȫ�浿",100);
		bonus.addmon(100000);
		
		System.out.println("�����ܾ� : "+ bonus.getMon());
		System.out.println("���纸�ʽ�����Ʈ : "+ bonus.getBonusPoiunt());
	}

}
