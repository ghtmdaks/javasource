package afterschool;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i < 6; i++) {
			int problemLcation = car.run(); //syso �� �ϴ��� ��������~
			
			switch (problemLcation) {
			case 1://�տ���
				System.out.println("�� ���� ��ũ - �ѱ�Ÿ�̾� ��ü");
				//�� ���� Ÿ�̾� ��ü
				car.frontLeftTire = new HankookTire(15, "�� ����");
				break;
			case 2://�տ�����
				System.out.println("�� ������ ��ũ - ��ȣŸ�̾� ��ü");
				car.frontRightTire = new KumhoTire(10, "�� ������");
				break;
			case 3://�ڿ���
				System.out.println("�� ���� ��ũ");
				break;
			case 4://�ڿ�����
				System.out.println("�� ������ ��ũ");
				break;
			default:
				break;
			}
			System.out.println();
		}
	}
}
