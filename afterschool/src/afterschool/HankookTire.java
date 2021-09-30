package afterschool;

public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		++accumulatoeRotation;
		if (accumulatoeRotation < maxRotation) {
			System.out.println(location + "HankookTire ¼ö¸í : "+(maxRotation-accumulatoeRotation)+"È¸");
			return true;
		}else {
			System.out.println(location + "HankookTire ÆãÅ© ");
			return false;
			
		}
	}
}
