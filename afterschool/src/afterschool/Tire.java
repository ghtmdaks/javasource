package afterschool;

public class Tire {
	//�ִ� ȸ����(Ÿ�̾� ����)
	int maxRotation;
	//���� ȸ����
	int accumulatoeRotation;
	//Ÿ�̾� ��ġ
	String location;
	
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		++accumulatoeRotation;
		if (accumulatoeRotation < maxRotation) {
			System.out.println(location + "Tire ���� : "+(maxRotation-accumulatoeRotation)+"ȸ");
			return true;
		}else {
			System.out.println(location + " Tire ��ũ ");
			return false;
			
		}
	}
}
