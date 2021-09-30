package string;

// String => Immutable

public class Replace {
	public static void main(String[] args) {
		String str1 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		
		// 자바 => Java
		//str1 = str1.replace("자바", "java");
		
		str1 = str1.replaceFirst("자바", "Java");
		
		System.out.println(str1);

	}
}
