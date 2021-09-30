package interfaceTest;

public class Audio implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		}else if (volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
			
		}
		System.out.println("AudioÇöÀç º¼·ý : " +volume);
	}

}
