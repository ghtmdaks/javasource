package classTest;
// ���� Ŭ���� ���� �ٸ� �޼ҵ带 ȣ���غ���
public class Calc {
	//����
	int plus(int x, int y) {
		return x+y;
	}
	
	//���
	double avg(int x, int y) {
		//return (x+y)/2; ���� �����Ѱ� ������ �����ϱ� �̰� �̿��غ���
		
		//return plus(x,y)/2; //�÷����� �ҷ��� ����� ������
		//���� Ǯ� �غ���?
		int sum = plus(x,y);
		return sum/2; //���ư����� ���� ȣ���ߴ� ������ ���ư���
	}
	
	void execute() {
		//��� �޼ҵ� ȣ��
		double result = avg(7,10);
		//����Ʈ �޼ҵ� ȣ��
		println("������"+result);
	}
	
	void println(String msg) {
		System.out.println(msg);
		
	}
}
