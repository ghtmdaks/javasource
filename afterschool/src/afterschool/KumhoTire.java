package afterschool;
//금호타이어는 타이어기 때문에 상속관계를 만든거야
public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		++accumulatoeRotation;
		if (accumulatoeRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : "+(maxRotation-accumulatoeRotation)+"회");
			return true;
		}else {
			System.out.println(location + "KumhoTire 펑크 ");
			return false;
			
		}
	}
}
