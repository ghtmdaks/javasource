package object;

public class ObjectEx2 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//toString => 객체를 문자열로 표현
		System.out.println(obj1.toString()); // java.lang.Object@2a139a55
		System.out.println(obj2.toString()); // java.lang.Object@15db9742
		
		// String 사용하는 toString 을 오버라이딩 적용 => 객체가 가지고 있는 값 출력
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.toString()); 
		System.out.println(str2.toString());
		
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		//toString() => 10 값을 출력 오버라이딩
		System.out.println(value1.toString()); //object.Value@6d06d69c
		System.out.println(value2.toString()); //object.Value@7852e922
		
	}
}



























