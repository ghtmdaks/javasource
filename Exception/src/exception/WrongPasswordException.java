package exception;

public class WrongPasswordException extends Exception {

	//생성자 2개(default, String)
	public WrongPasswordException() {
		super();		
	}

	public WrongPasswordException(String message) {
		super(message);		
	}
	
}
