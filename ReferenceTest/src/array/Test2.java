package array;

public class Test2 {
	public static void main(String[] args) {
		//������ ���� 3���� �־�
		int oldArr[] = {10,20,30};
		// �ٵ� 4���� �ʿ��� ���� ���Ӱ� ���� ��Ҿ�
		int newArr[] = new int[4];
		//�������� ���ο� ������ ����
//		for (int i = 0; i < oldArr.length; i++) {
//			newArr[i]=oldArr[i]; // ���� *****
//		} ���� �����ϴ� ���
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
//			(�� �����Ұž�?, ������ �����Ұž�?, ���� �����ϰž�?, ������ �����ġ�� �ű�ž�?, ���ŭ�ű�ž�?)
//		�ڹٰ� �������ִ� �����	
		
		newArr[3]= 40; //���ο� ������ �߰��� �ϰ�
		
		for(int i:newArr) {
			System.out.print(i+" ");
		}
		
		
		
		}
		
	}

