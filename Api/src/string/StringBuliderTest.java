package string;

public class StringBuliderTest {
	public static void main(String[] args) {
		String data = "ABC";
		data += "DEF"; //ABC�� DEF�� �߰��ϴ°� �ϴ϶� ABC�� �����ϰ� �ƽθ� ABCDEF�� ���� �����
						//��, ���� ���ڿ� ������ �� ���Ӱ� ���ڿ� ���� => StringBuffer, StringBuilder ����
		
		
		//��Ƽ ������ ����
		//StringBuffer buffer = new StringBuffer();

		//���� ������ ����
		StringBuilder builder = new StringBuilder();
		
		//�߰� ������ �޼ҵ尡 �ϳ��־�
		builder.append("ABC");
		builder.append("DEF");
		System.out.println(builder);
		
		//����
		builder.insert(3, "34"); //3��° ��ġ�� 34�� �־��ּ���
		System.out.println(builder);

		builder.delete(1, 3);//������ġ, ����ġ
		System.out.println(builder);
		
		String str1 = "Java Programing"; // �̹� str1���� ������ ���ȴµ� �����Ұ� �ʹ� ����
		StringBuilder builder1 = new StringBuilder(str1); // �׷��� �̷��� ������༭ ��� �۾�����
		builder1.append(3.14);
		
		builder1.deleteCharAt(1); //1���� ��������
		System.out.println(builder1);
	}
}
