package afterschool;
//��ȣŸ�̾�� Ÿ�̾�� ������ ��Ӱ��踦 ����ž�
public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		++accumulatoeRotation;
		if (accumulatoeRotation < maxRotation) {
			System.out.println(location + "KumhoTire ���� : "+(maxRotation-accumulatoeRotation)+"ȸ");
			return true;
		}else {
			System.out.println(location + "KumhoTire ��ũ ");
			return false;
			
		}
	}
}
