package exception;

public class WorngPasswordException extends Exception {

	public WorngPasswordException() {
		super();
	}

	public WorngPasswordException(String message) {
		super(message);
	}
	//생성자 2개(default, String)
	
}
