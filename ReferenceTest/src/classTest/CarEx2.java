package classTest;

public class CarEx2 {
	public static void main(String[] args) {
		
		//ù��° ��
		//��ü ���� �� ������ �ڵ� ȣ���
		Car2 car = new Car2(); //car2 �⺻ ������
		// �⺻ �Ӽ� ���� String =>null, int =>0 
		//			boolean =>false, double => 0.0 ��, ����ִ°�
		
//		car.company = "����";
//		car.model = "KONA";
//		car.color = "red";
//		car.maxSpeed=200;
		
		car.foward(); //�����ϴ�
		
		
		//The field Car2.company is not visible �Ⱥ��δ�
//		car2.company = "����";
//		car2.model = "��Ÿ��";
//		car2.color = "black";
//		car2.maxSpeed=250;
		
		//�ι�° ��
		Car2 car2 = new Car2("kona"); //car2 �⺻ ������
		car2.foward(); //�����ϴ�
		
		//����° ��
		Car2 car3 = new Car2("kona", "black");
		
		//�׹�° ��
		Car2 car4 = new Car2("����", "kona", "black", 250);

		
	}
}
