package classTest;

public class MethodTestEx {

	public static void main(String[] args) {
		MethodTest1 obj = new MethodTest1();
		
		//메소드 호출 시 리턴되는 값이 있는 경우
		// print()
		// 리리턴되는 값 받기
		System.out.println(obj.isRedirect());
		// 리턴되는 값 받기
		boolean result=obj.isRedirect(); // 1. 제어 넘어간디~
		//	   3. result로 받는디~
		
		
		int var1 = obj.sum();
		
		System.out.println(obj.add(25,35));
		
		
	}

}
