package test;

public class TypeTest1 {
	public static void main(String[] args) {
		// Ÿ�� -1) �⺻ ž��	2) ���� Ÿ��
		// ������ �޸� ���Ǵ� ����� �޸���
		
		//�⺻Ÿ�� => stack�� ����
		int age = 25; 
		double price = 299.3; 
		
		
		//����Ÿ�� => heap�� ���� / ����Ÿ�Ը� null �� �ʱ�ȭ�� ������ /
		//���ڿ� ������ �� ������ �̷��� ����� String name = new String("java");
		String name = "java";
		String name2 = new String("java");
		String hobby = null; //null�� ���� �� ������ �Ҵ���� ���� ���� �ǹ�
		
		// String ���� �� �� �ϰ� �;�
		// ���� ==, != 
		// String ���� ���� �Ҷ��� �̰� equals() �����
		// String �� Stack �� ������ ���� Heap ������ ������ ���� ���� ������ Ȯ���� �ϰ� �;��� 
		// Ȯ���� �� ���� stack ������ �ƴ� heap �������� Ȯ���� �ؼ� ���� �ٸ��� ����
		System.out.println(name==name2 ? "������" : "�ٸ�");
		System.out.println(name.equals(name2) ? "������" : "�ٸ�");
		System.out.println(hobby);
		System.out.println(hobby.length());
		
		
	}
}
