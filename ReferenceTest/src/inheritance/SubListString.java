package inheritance;

public class SubListString extends ListString{
	String name = "������";
	
	@Override
	public void List() {
		super.List(); //�θ��� list�� ȣ��(����)�ϰ� �־��
		System.out.println(name+" ���� Ŭ����");
	}
	
	
	public void writer() {
		//�θ� ������ �ִ� �̸� ���
		System.out.println(super.name); //super�� �θ�
		
		super.List();
	}
}
