package afterschool;

public class Exam4 {
//	for (int i = 1; i < 11; i++)

//	for => while
//	int i = 1
//	while(i < 11)
//	i++ while �� �� �������� �־��ָ� ��		
	
	
	
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i<11) {
			sum+=i;
			System.out.print(i);
//			12345678910			
			i++;
			if(i<11) {
				System.out.print("+");
//				1+2+3+4+5+6+7+8+9+10				
			}else { //if�� ����Ǹ� else�� ������ �ȵ�
				System.out.print("=");
//				1+2+3+4+5+6+7+8+9+10=				

				System.out.print(sum);
//				1+2+3+4+5+6+7+8+9+10=55
			}
		}
	}
}
