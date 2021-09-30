package exam;

public class CastingEx1 {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		double d = 3.14;
		//Type mismatch: cannot convert from double to int 
		//intValue = d; 큰그릇에 있는 걸 작은 그릇에 넣으려고 하니까 안되는거얌
		intValue = (int) d; 
		System.out.println(intValue);
		
	}
}
