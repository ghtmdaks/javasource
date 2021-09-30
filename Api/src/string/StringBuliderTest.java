package string;

public class StringBuliderTest {
	public static void main(String[] args) {
		String data = "ABC";
		data += "DEF"; //ABC에 DEF를 추가하는게 하니라 ABC를 삭제하고 아싸리 ABCDEF를 새로 만들어
						//즉, 기존 문자열 제거한 후 새롭게 문자열 생성 => StringBuffer, StringBuilder 개선
		
		
		//멀티 스레드 지원
		//StringBuffer buffer = new StringBuffer();

		//단일 스레드 지원
		StringBuilder builder = new StringBuilder();
		
		//추가 개념의 메소드가 하나있어
		builder.append("ABC");
		builder.append("DEF");
		System.out.println(builder);
		
		//삽입
		builder.insert(3, "34"); //3번째 위치에 34를 넣어주세요
		System.out.println(builder);

		builder.delete(1, 3);//시작위치, 끝위치
		System.out.println(builder);
		
		String str1 = "Java Programing"; // 이미 str1으로 선언해 버렸는데 수정할게 너무 많아
		StringBuilder builder1 = new StringBuilder(str1); // 그러면 이렇게 만들어줘서 잠깐 작업해줘
		builder1.append(3.14);
		
		builder1.deleteCharAt(1); //1번꺼 삭제해줘
		System.out.println(builder1);
	}
}
