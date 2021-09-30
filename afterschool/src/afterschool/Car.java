package afterschool;

//어느 때 포함 관계를 만들고 어느 때 상속 관계를 만들꺼냐
//자동차는 타이어다. X 자동차는 타이어가 아니기 때문에 상속을 만들지 않았어
//자동차는 타이어를 가지고 있다. O hasup

public class Car {
	//Car 랑 Tire 랑 아무관계없는데 멤버변수로 불러 
	//불러서 포함하는 관계로 만들 수 있어
	//오른쪽에는 뭐를 넣을 꺼냐
	//항상 왼쪽을 보고 1순위 자기타입 2순위 부모자식 관계가 있는  클래스를 찾아서 넣으면 돼
	Tire frontLeftTire = new Tire(6, "앞왼쪽"); //초기화를 안해서 지금은 NULL 상태야 new 를 해줘야 힙에 메모리에 올라간 걸 가르키거든
	Tire frontRightTire = new Tire(4, "앞오른쪽");
	Tire backLeftTire = new Tire(3, "뒤왼쪽");
	Tire backRightTire = new Tire(4, "뒤오른쪽");
	
	int run() {
		System.out.println("자동차가 달립니다.");
		//if (!forntLeftTire.roll()), forntLeftTire.roll()!=true 즉,false 라면
		if (!frontLeftTire.roll()) {
			stop(); 
			return 1;
		}if (!frontRightTire.roll()) {
			stop(); 
			return 2;
		}if (!backLeftTire.roll()) {
			stop(); 
			return 3;
		}if (!backRightTire.roll()) {
			stop(); 
			return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
