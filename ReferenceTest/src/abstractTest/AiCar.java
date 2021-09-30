package abstractTest;

public class AiCar extends Car {

	public AiCar(String color) {
		super(color);
	}

	@Override
	void drive() {
		System.out.println("자율주행");
	}

	@Override
	void stop() {

		System.out.println("자동으로 멈춤");
	}

}
