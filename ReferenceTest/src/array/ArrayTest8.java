package array;

public class ArrayTest8 {

	public static void main(String[] args) {
		// ī�� 45�� ����(1~45��)
		int card [] = new int[45]; //{1,2,3,4,5,.... 45} �̹���� �� �ƴ϶� �ڵ����� ����
		
		for (int i = 0; i < card.length; i++) {
			card[i] = i+1;
		}
		for(int no:card) {	
			System.out.print(no+" ");
		}
		// ī�� ����
		for (int i = 0; i < card.length; i++) { //'�ڸ�'�� 0~44 ���̾�
			//�ٲ� ��ġ ����
			int pos = (int)(Math.random()*45);
			int temp = card[i]; //�ӽ÷� i���� �ִ°Ÿ� �ϳ� �Ű�
			card[i] = card[pos]; //ī�� 
			card[pos] = temp;
		}	
		System.out.println();
		
		for(int no:card) {	
			System.out.print(no+" ");
		}
	
	}

}
