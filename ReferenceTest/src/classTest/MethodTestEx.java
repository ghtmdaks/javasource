package classTest;

public class MethodTestEx {

	public static void main(String[] args) {
		MethodTest1 obj = new MethodTest1();
		
		//�޼ҵ� ȣ�� �� ���ϵǴ� ���� �ִ� ���
		// print()
		// �����ϵǴ� �� �ޱ�
		System.out.println(obj.isRedirect());
		// ���ϵǴ� �� �ޱ�
		boolean result=obj.isRedirect(); // 1. ���� �Ѿ��~
		//	   3. result�� �޴µ�~
		
		
		int var1 = obj.sum();
		
		System.out.println(obj.add(25,35));
		
		
	}

}
