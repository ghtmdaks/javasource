package afterschool;

public class Person {
	private String name;
	private String addr;
	
	//������ alt+s, a
	public Person(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	
	//getset alt+s, r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//set �� �����ڸ� ������ �ʰ� �Է°��� �ְ� �������� ������ �ִ� ���� �����ϰ� ������ ����ϸ� ��
	
}
