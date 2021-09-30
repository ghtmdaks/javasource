package string;

public class StringBuilderTest {
	public static void main(String[] args) {
//		String data = "ABC";
//		data += "DEF";
//		data += "";		
		// 기존 문자열 제거한 후 새롭게 문자열 생성 => StringBuffer, StringBuilder 개선
		
		
		//멀티 스레드 지원
		//StringBuffer buffer = new StringBuffer();
		
		//단일 스레드 지원
		StringBuilder builder = new StringBuilder();
		
		//추가
		builder.append("ABC");
		builder.append("DEF");
		System.out.println(builder);
		
		//삽입
		builder.insert(3, "34");
		System.out.println(builder);
		
		//삭제
		builder.delete(1, 3);
		System.out.println(builder);
		
		
		String str1 = "Java Programming";
		StringBuilder builder1 = new StringBuilder(str1);
		builder1.append(3.14);
		
		builder1.deleteCharAt(1);
		System.out.println(builder1);
	}
}




























