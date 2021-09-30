package afterschool;

public abstract class MessageSender {
	private String receiverName;
	private String message;
	private String senderName;
	
	public MessageSender() {
		super();
	}

	public MessageSender(String receiverName, String message, String senderName) {
		super();
		this.receiverName = receiverName;
		this.message = message;
		this.senderName = senderName;
	}
	
	//������ => 1�� ���
	//public void sendMessage() {
	//	System.out.println("������");
	//}
	
	//2�� ���
	public abstract void sendMessage();
	
}
