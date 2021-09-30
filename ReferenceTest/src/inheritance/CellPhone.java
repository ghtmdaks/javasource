package inheritance;

public class CellPhone {
	String model;
	String color;
	
	void poweron() {
		System.out.println("���� on");
	}
	
	void poweroff() {
		System.out.println("���� off");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	
	void sendVoice(String msg) {
		System.out.println("���� : "+msg);
	}
	
	void receiveVoice(String msg) {
		System.out.println("���� "+msg);
	}
	
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
