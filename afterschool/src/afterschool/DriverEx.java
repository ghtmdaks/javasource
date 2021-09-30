package afterschool;

public class DriverEx {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus(); //public void drive() 여기로 받으려면 당연히 public void drive(Bus bus) 로 받아야해!
							// int 로 보내려고 하는데 받는쪽에서도 int로 받을 준비를 해야지 안그래?
		//Vehicle bus = new Bus();
		//bus.run(); => Driver 를 통해 실행하고 싶어
		driver.drive(bus);
		
		
		
		
		Taxi taxi = new Taxi();//public void drive() 여기로 받으려면 당연히 public void drive(Taxi taxi) 로 받아야해!
		driver.drive(taxi);					// int 로 보내려고 하는데 받는쪽에서도 int로 받을 준비를 해야지 안그래?
		//Vehicle taxi = new Taxi();
		//taxi.run(); => Driver 를 통해 실행하고 싶어
		
	}

}
