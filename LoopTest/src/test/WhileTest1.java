package test;

public class WhileTest1 {
	public static void main(String[] args) {
//	for(int i=1;i<10;1++) {
//		//�ݺ��ؾ��� �۾�
//		syso("�ȳ��ϼ���")
//	}

		
		int i=0;
		while(i<10) {
			//�ݺ��ؾ��� �ۤ���
			System.out.println("�ȳ��ϼ���");
			i++;
			
		}
		System.out.println();
		
		i=1;
		while(i<11) {
			System.out.print(i+"\t");
			i++;
			
		}
		System.out.println();
		//2�� ���
		i=0;
		while(i<11) {
			System.out.print(i+"\t");
			i+=2;
			
		}
		System.out.println();
		//3�� ���
		i=3;
		while(i<101) {
			System.out.print(i+"\t");
			i+=3;
			
		}
		
	}
}
