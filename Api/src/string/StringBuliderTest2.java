package string;

public class StringBuliderTest2 {
	public static void main(String[] args) {
		String str1 = "hello java!!!";
		//char 배열을 만든 다음에 12번 부터 꺼꾸로 찍어나가자
	
		//String 형태로 두고 거꾸로 출력
		char[] chArr=str1.toCharArray();
		
		//chArr.length => 13
		for (int i=chArr.length-1; i>=0; i--) {
			System.out.print(chArr[i]+" ");
		}
		System.out.println();
		
		//Stringbulider 거꾸로 출력
		StringBuilder builder = new StringBuilder(str1);
		System.out.println(builder.reverse());
	}
}
