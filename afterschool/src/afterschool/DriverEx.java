package afterschool;

public class DriverEx {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus(); //public void drive() ����� �������� �翬�� public void drive(Bus bus) �� �޾ƾ���!
							// int �� �������� �ϴµ� �޴��ʿ����� int�� ���� �غ� �ؾ��� �ȱ׷�?
		//Vehicle bus = new Bus();
		//bus.run(); => Driver �� ���� �����ϰ� �;�
		driver.drive(bus);
		
		
		
		
		Taxi taxi = new Taxi();//public void drive() ����� �������� �翬�� public void drive(Taxi taxi) �� �޾ƾ���!
		driver.drive(taxi);					// int �� �������� �ϴµ� �޴��ʿ����� int�� ���� �غ� �ؾ��� �ȱ׷�?
		//Vehicle taxi = new Taxi();
		//taxi.run(); => Driver �� ���� �����ϰ� �;�
		
	}

}
