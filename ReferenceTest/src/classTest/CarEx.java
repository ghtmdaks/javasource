package classTest;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		//��ü�� �����ϸ� ������ �����ڸ� �ҷ�
		
		System.out.println(car);
		car.company = "����";
		car.model = "KONA";
		car.color = "red";
		car.maxSpeed=200;
		
		car.foward();
		

	}

}
