package test;

public class ForTest1 {
	public static void main(String[] args) {
		// ; 
		//for ���� ����
		//�� int i = 0; 		=> 0���� ���۵�
		//�� i < 10; 		=> i�� 10���� �����
		//�� �ݺ��ؾ� �� �۾� ���� 	=> System.out.println("�ȳ��ϼ���");
		//�� i++ (i=i+1) i=1 			=> i�� 1�� ����
		//�� i < 10;			
		//�� �ݺ��ؾ� �� �۾� ���� 	=> System.out.println("�ȳ��ϼ���");
		//�� i++ (i=i+1) i=2
		//�� i < 10;
		//�� �ݺ��ؾ� �� �۾� ���� 	=> System.out.println("�ȳ��ϼ���");
		//�ݺ�...
		//i=9
		//i<10;
		//�� �ݺ��ؾ� �� �۾� ���� 	=> System.out.println("�ȳ��ϼ���");
		//i=10
		//i<10; ���� �Ҹ��� => for ������ �������� => for ����
		
		
		for (int i = 0; i < 10; i++) {//10�� �����ž� 
			//�ݺ��ؾ��� �۾�
			System.out.println("�ȳ��ϼ���");
		}
		
		System.out.println();
		
		//1~10���� ���
		//1)	int i=1;
		//2)	i<11;
		//3)	System.out.println(i);
		//4)	i++
		//5)	i<11;
		//6)	System.out.println(i);

		for(int i=1;i<11;i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//i=i+i; => i++;
		//I=i+2; => i+=2;
		
		// 0~10���� ¦���� ���
		for(int i=0;i<11;i+=2) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		
		// 3�� ��� 100����
		for(int i=3;i<100;i+=3) {
			System.out.print(i+"  ");
		}
		
		
		
		//1~100 ���� ���� �߿��� 3�� ������� ���ϴ� ���α׷� �ۼ�
		int sum = 0 ;
		for(int i=1;i<100;i+=3) {
			if(i%3==0 && i%9!=0) {
						//��, 9�� ����� ������ �ʱ�
				sum = sum+i; // sum+=i
			}
			System.out.println("3�� ����̰� 9�� ����� �ƴ� �� :  " +sum);
			System.out.println();
			
			//1~100 ���� ���� �߿��� 3�� ��� �̰ų�, 5�� ����� ���� ��
			sum = 0 ;
			for(int j=1;j<101;j++) {
				if(j%3==0 || j%5==0) {
							//��, 9�� ����� ������ �ʱ�
					sum = sum+j; // sum+=j
				}
			
			}
		} 
		
			System.out.println("3�� ����̰ų� 5�� ����� ���� �� :  " +sum);
		
		
	}
}