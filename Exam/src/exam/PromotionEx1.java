package exam;

public class PromotionEx1 {

	public static void main(String[] args) {
		// ���� ����
		// ���� Ÿ�� => byte(1byte=8bit) < char(2byte) < short(2byte) < int(4byte) < long(8byte)
		//			  2^8 = 256
		//			   -128 ~ 127
		// �Ǽ� Ÿ�� => float(4byte) < double(8byte)
		
		byte bytevalue = 10;
		
		// �ڵ� ����ȯ = promotion ������ ū���� ��� �� �װ� �� ū���� ���
		int intvalue = bytevalue;
		System.out.println(intvalue);
		
		intvalue = 500;
		long longvalue=intvalue;
		
		char charvalue = 'A';
		char chatvalue2 = 1;
		
		int chavalue3 = charvalue+chatvalue2; // 'A' + 1
		
		System.out.println(chavalue3); // 66 �ƽ�Ű �ڵ�ǥ�� ���ͼ� 'A' = 65 �׷��� +1 �ϱ⶧���� 66 �� ����
		
		// ���� ����ȯ (casting)
		System.out.println((char)chavalue3); // ()�� ������ ��ȯ������ ��� ���̾�
											 //��������ȯ casting �̶���� �ƽ�Ű �ڵ�ǥ�� ���ؼ� B�� ����
		
		
	}

}
