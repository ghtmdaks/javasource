package afterschool;

//��� �� ���� ���踦 ����� ��� �� ��� ���踦 ���鲨��
//�ڵ����� Ÿ�̾��. X �ڵ����� Ÿ�̾ �ƴϱ� ������ ����� ������ �ʾҾ�
//�ڵ����� Ÿ�̾ ������ �ִ�. O hasup

public class Car {
	//Car �� Tire �� �ƹ�������µ� ��������� �ҷ� 
	//�ҷ��� �����ϴ� ����� ���� �� �־�
	//�����ʿ��� ���� ���� ����
	//�׻� ������ ���� 1���� �ڱ�Ÿ�� 2���� �θ��ڽ� ���谡 �ִ�  Ŭ������ ã�Ƽ� ������ ��
	Tire frontLeftTire = new Tire(6, "�տ���"); //�ʱ�ȭ�� ���ؼ� ������ NULL ���¾� new �� ����� ���� �޸𸮿� �ö� �� ����Ű�ŵ�
	Tire frontRightTire = new Tire(4, "�տ�����");
	Tire backLeftTire = new Tire(3, "�ڿ���");
	Tire backRightTire = new Tire(4, "�ڿ�����");
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		//if (!forntLeftTire.roll()), forntLeftTire.roll()!=true ��,false ���
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
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
