package abstractTest;

public class AiCarEx {

	public static void main(String[] args) {
		AiCar ai = new AiCar("Black");
				
		ai.start();
		ai.drive();
		ai.stop();
		
		//Cannot instantiate the type Car ��ü������ �Ұ����� ��
		//�߻�Ŭ������ ��ü ������ �Ұ�
		//Car car = new Car();
		Car car = new AiCar("White");
		car.start();
		car.drive();
		car.stop();
		
		
	}

}
