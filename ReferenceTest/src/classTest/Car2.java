package classTest;

public class Car2 {
	//�ʵ� : ����ȸ��, �𵨸�, ����, �ִ�ӵ�....
	private String company; //�Ӽ��� �ܺο��� ���������� �������� ���ϰ� �Ⱥ��̰�
	private String model;	// ó���ϱ� ������ private �� ������ߵ� ��
	private String color;
	private int maxSpeed;
	
	//*������*
	//Ŭ���� �̸��� ������ / ���� Ÿ���� ���� / �ߺ��� ������ (������ ���� �ε�)
	//							 ���⼭�� �ߺ��� �Ȱ��� ������ �� �ƴϾ�
	//							 Ÿ���� ���� �ϴ°ž� (��ȣ���� �ٸ���)
	//���� - �ʵ忡 �ʱⰪ�� ����/��ü�� �����ϸ鼭 �غ��ؾ��ϴ� �۾� ����

	Car2(){ // ���� Ÿ���� Car �տ� �ƹ��͵� �ȳ־ ��
		System.out.println("car2 �⺻ ������");
	}
//	Car2(){//Duplicate method Car2() in type Car2 �ߺ��Ǵµ�?
//		System.out.println("car2 �⺻ ������");
	
	Car2(String model){
		System.out.println("car2 �⺻ ������ - model �ʱ�ȭ");
	}
	Car2(String color, String model){
		System.out.println("car2 �⺻ ������ - model, color �ʱ�ȭ");
	}
	Car2(String company, String model, String color, int maxSpeed){
		System.out.println("car2 �⺻ ������ - �ʵ� ��� �ʱ�ȭ");
	}//- �ϳ��� Ŭ������ �������� �����ڰ� �����ϴ°� �����ε��̾�
			//=> car2(���ξȿ� ���´� �޶���Ѵ�.)
	
	//�޼ҵ� : ����/����
	void foward() {
		System.out.println("�����ϴ�");
	}
	void backwarf() {
		System.out.println("�����ϴ�");
	}
	
}
