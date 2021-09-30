package exam;

public class PrintTest {
	public static void main(String[] args) {
		
		
		int a = 3;
		int b = 4;
		
		System.out.print(true);
		// + : 문자열과 앞이든 뒤든 같이 사용을 하게되면 연결의 의미로 사용됨
		System.out.println("여기다가는 마음대로"+a); //괄호 안 공백 허용 => 그리고 엔터한번 넣어줘 라는 의미
										//+ 는 연결해서 a를 넣어줘
		//여기서는 산술 연산
		System.out.println(a+b);
		
		//System.out.printf();
		
		String str="abc"+3;
		System.out.println(str);
	}
}
