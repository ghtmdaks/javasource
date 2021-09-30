package object;

public class Value {
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) { 
		// value1.equals(value2)
		
		// Object obj = value2; obj.value(X) => 자식 객체로 형변환		
		Value v = (Value)obj;		
		
		if(this.value == v.value) {
			return true;
		}
		
		return false;
	}
	
	// int 값을 문자열로 변경 : int+"", String.valueOf(int)
	@Override
	public String toString() {		
		return value+"";
	}
	
}
















