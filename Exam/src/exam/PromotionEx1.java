package exam;

public class PromotionEx1 {

	public static void main(String[] args) {
		// 변수 선언
		// 정수 타입 => byte(1byte=8bit) < char(2byte) < short(2byte) < int(4byte) < long(8byte)
		//			  2^8 = 256
		//			   -128 ~ 127
		// 실수 타입 => float(4byte) < double(8byte)
		
		byte bytevalue = 10;
		
		// 자동 형변환 = promotion 작은걸 큰데다 담고 또 그걸 더 큰데다 담고
		int intvalue = bytevalue;
		System.out.println(intvalue);
		
		intvalue = 500;
		long longvalue=intvalue;
		
		char charvalue = 'A';
		char chatvalue2 = 1;
		
		int chavalue3 = charvalue+chatvalue2; // 'A' + 1
		
		System.out.println(chavalue3); // 66 아스키 코드표에 나와서 'A' = 65 그래서 +1 하기때문에 66 이 나와
		
		// 강제 형변환 (casting)
		System.out.println((char)chavalue3); // ()가 강제로 변환시켜줘 라는 뜻이야
											 //강제형변환 casting 이라고해 아스키 코드표에 의해서 B가 나왕
		
		
	}

}
