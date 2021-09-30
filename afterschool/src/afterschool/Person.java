package afterschool;

public class Person {
	private String name;
	private String addr;
	
	//생성자 alt+s, a
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
	//set 은 생성자를 만들지 않고 입력값을 넣고 싶을때나 기존에 있는 값을 변경하고 싶을때 사용하면 돼
	
}
