package classTest;

public class Triangle2 {
	//�ﰢ�� ���� ���ϱ�
	//�Ӽ� : �غ�, ���� 
	private int b;
	private int h;
	

	
	//�����ڴ� �⺻ ������
	//Triangle(){} �⺻�����ڴ� �ȸ��� �� �ڵ����� �������ְŵ�
	
	//Triangle2() is undefined
	
	Triangle2(int b, int h){
		this.b = b;
		this.h = h;
	}
	
	//���(�޼ҵ�) : �غ� * ���� / 2 ��� ����
	int area(){
		return (b*h)/2;
		
	}

}
