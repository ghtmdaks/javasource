package classTest;

public class DataEX {
	public static void main(String[] args) {
		Data data = new Data();
		System.out.println("data"+data);
		//dataclassTest.Data@2a139a55
		
		//���� �����͸� ����ְ� �����Ͱ� �ϳ� �������
		
		//x�� �� 10���� ����
//		data.x=10;
//		change(data.x); //data ��ü ���� x��������� ������ ���� ����
//		System.out.println("after change()x = "+data.x);
//		//���ƿ��� �� �츮�� x �� 10�� �ǹ��Ⱦ��̤� 
		
		System.out.println();
		//�ٵ� ���� 10000���� ����� ����
		change(data);
		System.out.println("after change()x = "+data.x);
		
	}
	static void change(int x) {//x�� �޾Ƽ�
		x = 10000; // x�� 10000���� �����߾�
		System.out.println("change() x= "+x);
	}
	static void change(Data d) {
		//d ����2a139a55�� �ּҰ� �� �־� 
		System.out.println(d);
		//�� ���� d�� �Ѿ���� ���� 10000���� �ٲ㺼��?
		d.x = 10000;
		
		
		
	}
}
