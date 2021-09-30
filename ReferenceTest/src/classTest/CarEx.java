package classTest;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		//객체를 생성하면 무조건 생성자를 불러
		
		System.out.println(car);
		car.company = "현대";
		car.model = "KONA";
		car.color = "red";
		car.maxSpeed=200;
		
		car.foward();
		

	}

}
