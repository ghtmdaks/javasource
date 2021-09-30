package exception;

public class NotExistIDException extends Exception {
	//생성자 2개(default, String)

	public NotExistIDException() {
		super();		
	}

	public NotExistIDException(String message) {
		super(message);		
	}
	
}
