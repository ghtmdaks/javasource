package inheritance;

public class CarEx {

	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
		//f = a; �ƹ� ������� ��鳢���� ������ �ȵ�! �θ� ������ ��Ӱ��谡 �ȵ�
		//			��, ��� ���谡 �ƴ� Ŭ�������� ����ȯ �Ұ�
		
		f = new FireEngine();
		
		//Car car = new FireEngine();
		Car car = f; //�̰Ŵ� �θ��ڽ� ����� 
					 //��Ӱ��谡 �ִ� ���¿����� ����ȯ�� ������ upcasting (��ȣ ����ȯ�� ���� ������)
		
		FireEngine f2;
		f2 = (FireEngine) car; //���������� �ƿ� Ʋ�Ⱦ�
								//��ȣ�� ���� ������ ĳ�����̶���� Downcasting(�����Ұ�)
		f2.water(); //Car(�θ�)�� ȣ���� �� �ְ� �ڽŲ��� ȣ���� �� �־�
		
		
	}

}
