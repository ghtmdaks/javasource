package array;

public class ArrayTest7 {
	public static void main(String[] args) {
		int score[]= {78,65,95,88,36,45,25,47,87,43};
		
		int max = score[0];
		int min = score[0]; //�ϴ� ù��° �� �ְ� ����
		
		//�ְ�����
		//��������
		
		for (int i = 0; i < score.length; i++) {
			if(max < score[i]) { //�ƽ���� Ŭ�� ���� ����
				max = score[i]; // �ƽ����� ũ�� ���� �ٲ���
			}else if (score[i]<min) {
				min = score[i];
			}
		}
		
		System.out.printf("�ְ����� : %d , �������� : %d",max,min);
		
	}
}
