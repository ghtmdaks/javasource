package afterschool;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		
	}
	//public void drive(Taxi taxi) {
	//	taxi.run();
	//}
	// 만약에 비행기도 생기고 기차도 생기고 탈 거 많이 생기면 보이드를 계속 만들어야 되잖아
	// 그럼 그렇게 하지 말고 나중에 만들거를 부모로 다 상속 받은 클래스를 만들고  괄호안을 부모로 받아
}	// 자식들이 가지고 있는 동일한 메소드를 실행시킬거를 호출해! [여기서는.run()]