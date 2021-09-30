package classTest;

public class CarEx2 {
	public static void main(String[] args) {
		
		//첫번째 차
		//객체 생성 시 생성자 자동 호출됨
		Car2 car = new Car2(); //car2 기본 생성자
		// 기본 속성 값은 String =>null, int =>0 
		//			boolean =>false, double => 0.0 즉, 비어있는값
		
//		car.company = "현대";
//		car.model = "KONA";
//		car.color = "red";
//		car.maxSpeed=200;
		
		car.foward(); //전진하다
		
		
		//The field Car2.company is not visible 안보인대
//		car2.company = "현대";
//		car2.model = "산타페";
//		car2.color = "black";
//		car2.maxSpeed=250;
		
		//두번째 차
		Car2 car2 = new Car2("kona"); //car2 기본 생성자
		car2.foward(); //전진하다
		
		//세번째 차
		Car2 car3 = new Car2("kona", "black");
		
		//네번째 차
		Car2 car4 = new Car2("현대", "kona", "black", 250);

		
	}
}
