package poly;

public class EmployeeEx {
	public static void main(String[] args) {
		Worker worker = new Worker();
		
		Employee e1 = new Employee();
		e1.setName("ȫ�浿");
		e1.setPosition("���");
		worker.work(e1); // ��ũ��� �޼ҵ忡�� ������ ��Ű������  �׷��� ��Ŀ��� ���� ���̵� ���� �θ� �־���
		
		Ceo ceo = new Ceo();
		ceo.setName("�ں���");
		ceo.setPosition("����");
		worker.work(ceo);
		
		Manager manager = new Manager();
		manager.setName("�����");
		manager.setPosition("������");
		worker.work(manager);
		
		PartTime partime = new PartTime();
		partime.setName("������");
		partime.setPosition("�Ƹ�����Ʈ");
		worker.work(partime);
		
	}

}
