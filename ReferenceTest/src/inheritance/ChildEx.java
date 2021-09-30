package inheritance;

public class ChildEx {
	public static void main(String[] args) {
		//Child ��ü�� �����ϴ� 2����
		
		//��ü�� ����
		//1) super(age); => Parent ������ ȣ��
		//1) super(); => Object ������ ȣ��
		//2) this.age = age ����
		//3) super(age); => Parent ������ ȣ��
		//4) Child ��ü ����
		
		Child child = new Child(25); //Child�� int �� �Ǿ������ϱ� ��ȣ �ȿ� ���� �־���/ ���� 2������ 1��
		System.out.println("child age "+child.getAge());
		child.play();
		child.print();
		
		Parent parent = new Child(26); //���ʺθ� ������ �ڽ� ���� 2������ 2��
		System.out.println("child age "+parent.getAge());
		//parent.play(); ���θ� �θ� ������ �۱� ������ í�ϵ� �ȿ� �ִ� �÷��̸� ���ҷ�
		parent.print();
	}
}
