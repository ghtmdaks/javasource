package afterschool;

public abstract class EmailSender extends MessageSender {
	
	private String tilte;

	public EmailSender(String receiverName, String message, String sendName, String tilte) {
		super();
		this.tilte = tilte;
	}
	
	
	
	@Override
	public void sendMessage() {
		System.out.println("이메일을 보낸다.");
	}
	
}
