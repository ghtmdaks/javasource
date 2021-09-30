package test;

public class TypeTest1 {
	public static void main(String[] args) {
		// 타입 -1) 기본 탑입	2) 참조 타입
		// 변수의 메모리 사용되는 방식이 달리짐
		
		//기본타입 => stack에 생성
		int age = 25; 
		double price = 299.3; 
		
		
		//참조타입 => heap에 생성 / 참조타입만 null 로 초기화가 가능해 /
		//문자열 생성할 때 원래는 이렇게 써야해 String name = new String("java");
		String name = "java";
		String name2 = new String("java");
		String hobby = null; //null은 아직 힙 영역이 할당되지 않은 것을 의미
		
		// String 에서 값 비교 하고 싶어
		// 값비교 ==, != 
		// String 에서 값비교 할때는 이거 equals() 써야해
		// String 도 Stack 에 번지로 저장 Heap 영역의 번지로 가서 쟤가 누군지 확인을 하고 와야해 
		// 확인을 할 때도 stack 영역이 아닌 heap 영역에서 확인을 해서 값이 다르게 나와
		System.out.println(name==name2 ? "동일함" : "다름");
		System.out.println(name.equals(name2) ? "동일함" : "다름");
		System.out.println(hobby);
		System.out.println(hobby.length());
		
		
	}
}
