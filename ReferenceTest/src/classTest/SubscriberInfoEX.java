package classTest;

public class SubscriberInfoEX {

	public static void main(String[] args) {
	
		SubscriberInfo aaa = new SubscriberInfo("ȫ�浿", "hong", "gildong");
		//ȫ�浿 ��ȭ��ȣ �߰�
		aaa.setPh(01022223333);
		
		SubscriberInfo bbb = new SubscriberInfo("������", "sung", "chunhyang", 0100000000, "���α�");
		//������ �ּ� ����
		bbb.setAddr("������");
		
		System.out.println();

	}
}
