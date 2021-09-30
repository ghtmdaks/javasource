package afterschool;

public class Tire {
	//최대 회전수(타이어 수명)
	int maxRotation;
	//누적 회전수
	int accumulatoeRotation;
	//타이어 위치
	String location;
	
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		++accumulatoeRotation;
		if (accumulatoeRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : "+(maxRotation-accumulatoeRotation)+"회");
			return true;
		}else {
			System.out.println(location + " Tire 펑크 ");
			return false;
			
		}
	}
}
