package classTest;

public class AccountEx3 {
	public static void main(String[] args) {
		//Account3 ��ü�� 5���� �����ϰ� �;�
		Account3 acc1 = new Account3("122-12", 250000, "ȫ�浿");
		Account3 acc2 = new Account3("122-13", 260000, "��浿");
		Account3 acc3 = new Account3("122-14", 270000, "��浿");
		Account3 acc4 = new Account3("122-15", 280000, "�ֱ浿");
		Account3 acc5 = new Account3("122-16", 290000, "�̱浿");
		
		//������Ÿ������ ��ü�� �����Ѵٸ� �� �� ȿ������ ����� ������?
		//Ŭ���� �迭
		//Ÿ��	 �迭��					5��
		Account3 accArr[] = new Account3[5];
		System.out.println(accArr[0]); // null �̳���
		
		accArr[0] = new Account3("122-12", 250000, "ȫ�浿");
		accArr[1] = new Account3("122-13", 260000, "��浿");
		accArr[2] = new Account3("122-14", 270000, "��浿");
		accArr[3] = new Account3("122-15", 280000, "�ֱ浿");
		accArr[4] = new Account3("122-16", 290000, "�̱浿");
					
		// int a,b,c,d,e,.....; => int arr[]=new int[10];
		// arr[0] print => 0
		// double arr[] => new double[5]; arr[0] => 0.0
		
//		for(int i=0; i<accArr.length; i++) {
//			System.out.println(accArr[i].getName+"\t");
//			System.out.println(accArr[i].getAcc()+"\t");
//			System.out.println(accArr[i].getBalance());
//		}
		
		
		
		
		
	}
}
