package string;

public class StringBuliderTest2 {
	public static void main(String[] args) {
		String str1 = "hello java!!!";
		//char �迭�� ���� ������ 12�� ���� ���ٷ� ������
	
		//String ���·� �ΰ� �Ųٷ� ���
		char[] chArr=str1.toCharArray();
		
		//chArr.length => 13
		for (int i=chArr.length-1; i>=0; i--) {
			System.out.print(chArr[i]+" ");
		}
		System.out.println();
		
		//Stringbulider �Ųٷ� ���
		StringBuilder builder = new StringBuilder(str1);
		System.out.println(builder.reverse());
	}
}
