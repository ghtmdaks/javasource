package classTest;

public class MethodTestEx2 {

	public static void main(String[] args) {
		// ��ü ����
		MethodTest2 obj = new MethodTest2();
		
		//���� ������ ����ϴ� ����̾�
		obj.print99dan();
		
		//���� ���
		//�޼ҵ带 ȣ���ϴ� �ʿ��� �Է°��� �־��ֱ�
		obj.sum(11, 15);
		//obj. sum (10.5, 11.5);
		//�������� �ƴѰŴ� �Է°����� �ָ� �ȵ�
		
		//����ȯ
		//1) �ڵ�����ȯ (���θ��) ����  Ÿ���� ū Ÿ�Կ� �ִ°�
		//2) ��������ȯ (ĳ����) ex) int =(int)float
		//					ū Ÿ���� ���� Ÿ�Կ� �ִ°�
		//���� �ѰŴ� ���θ��
		byte b1 = 3;
		byte b2 = 5;
		obj.sum(b1, b2);
		
		

	}

}
