package classTest;

public class Triangle3 {
	//�ﰢ�� ���� ���ϱ�
	//�Ӽ� : �غ�, ���� 
	private int b;
	private int h;
	
	//�����ڴ� �⺻ ������
	//Triangle(){} �⺻�����ڴ� �ȸ��� �� �ڵ����� �������ְŵ�
	
	//Triangle2() is undefined
	
	Triangle3(int b, int h){
		this.b = b;
		this.h = h;
	}
	
	
	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getH() {
		return h;
	}


	public void setH(int h) {
		this.h = h;
	}


	//���(�޼ҵ�) : �غ� * ���� / 2 ��� ����
	int area(){
		return (b*h)/2;
		
	}

}
