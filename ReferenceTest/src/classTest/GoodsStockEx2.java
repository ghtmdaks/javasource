package classTest;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		
		//ù��° ��ǰ ��� ����
		GoodsStock2 product1 = new GoodsStock2("p12345",30);
		//Ŭ���� �ܺο��� �Ӽ��� ���� �����ϴ� ���� �ȵ�
		//private => The field GoodsStock2.code is not visible
		//product1.code ="p12345";
		//product1.inven = 30;
		
		//��ǰ�Ǹ� => ��� ����
		//�޼ҵ� ȣ�� => ���ϰ��� �ִٸ� ���ϰ��� �ޱ�(syso, ����)
		//System.out.println("���� ������ : "+product1.invenDown(15));
		//��������
		int inven = product1.invenDown(15);
		//������ ó���� �ϸ� ���ķε� inven�� ��� �� �� �־�
		System.out.println("���� ������ : " + inven);
		
		
		//��ǰ=> ��� ����
		//�޼ҵ� ȣ�� => ����Ÿ���� ������ ȣ�⸸ �ϸ� ��
		//System.out.println(product1.invenUp(5));
		//���̵�� ��¹��� �ȵǰ� ������ �ȵ�
		product1.invenUp(5);
		System.out.println("���� ������ : " + product1.inven());
		
	}
}
