package abstractTest;

public class AiCarEx {

	public static void main(String[] args) {
		AiCar ai = new AiCar("Black");
				
		ai.start();
		ai.drive();
		ai.stop();
		
		//Cannot instantiate the type Car 객체생성이 불가능해 ㅠ
		//추상클래스는 객체 생성이 불가
		//Car car = new Car();
		Car car = new AiCar("White");
		car.start();
		car.drive();
		car.stop();
		
		
	}

}
