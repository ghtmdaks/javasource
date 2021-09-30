package inheritance;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 dmb 방송시작");
	}
	void turnOffDmb() {
		System.out.println("채널 "+channel+"번 dmb 방송종료");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널 "+channel+"번 변경");
	}
}
