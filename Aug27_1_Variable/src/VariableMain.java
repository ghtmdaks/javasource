//변수 (Variable)
//		데이터를 담는 그릇
//		프로그램 진행 중에 만들어진 데이터를 저장할 때

//		어디다가 저장되냐??
//		CPU - 연산장치 => 계산하는 애가 좋으면 빠름 
//		RAM - 저장장치 => 좋으면 많이 저장(변수를 많이 만들 수 있어)
//		변수형태, 임시저장(자동삭제 ex)_재부팅)
//		물리적으로 3곳으로 나뉜게 아니라 window 가 나눈다;
//		다 썼으면 그 공간은 반납해야해
//		static
//		stack - 프로그램 종료시 자동 반납 -> 수동으로 반납 불가능
//		heap - 자동 반납되지 않음 -> 개발자가 수동으로 반납
//			java 에는 Garbagecollection 기능이 있어
//				heap 영역 자동정리 시스템
//		SSD/HDD - 저장장치 => 좋으면 많이 저장 
//		파일형태, 영구저장 -> 발전 -> DB
//		GPU - 그래픽을 표현하는데 필요한(CPU+RAM+HDD)

//문법
//	그릇종류  				그릇이름;
//	어떤데이터저장			그릇이름;
//	자료형(data type)		변수명;

//	자료형
//		기본형
//			정수 -	byte(1byte : -100~100)
//					short(2 : -6만~6만)
//					int(4 : -21억~21억) - 주력
//					long(8 : 큼) (그릇의 크기 차이);
//						ex) 사람 나이 데이터를 임시 저장할 때 너는 뭐 쓸꺼야?
//								bite/ short 사용하는게 옳다
//								근데 회사가면 int 써 byte 쓰면 욕먹어
//			실수 - 0.000 float(4), double(8)-주력 (그릇의 크기 차이);
//			한글자 - char(2)
//			논리 - boolean(1)
//			없다 - void
//		참조형
//			여러글자 - string
//			기타등등...
//그릇	종류	이름
//		int efd  = 230; // 그릇의 종류가 안맞어 내용물이 너무 커서 안들어가
//		int efwd  = "ㅋㅋㅋ"; // 그릇의 종류가 안맞어 내용물이 안맞어 안들어가
//		1bit = 0, 1
//		1byte = 8bit 2^8
//		byte a = 1;

public class VariableMain {
	public static void main(String[] args) {

//		국어점수가 80점인거를 임시로 저장할 수 있게
// 변수명 
//		마음대로 	(영어+숫자 조합으로, 뜻을 알기 좋게, 변수명 길어도 컨트롤 스페이스)
//					(언더바 쓰는것도 괜찮아 : 뱀체, 띄어쓰기 대신 대문자 활용해서 가독성 좋게 : 낙타채)
//				(숫자로 시작하면 안돼 a1은 되는데 1a는 안돼, IT문화가 그래 전반적으로 숫자로 시작하는 걸 피해)
//					(특수문자 안돼 예외 : _,	$)
//					(자바문법 안돼 int, syso) 써보고 안되면 안쓰면 돼
//					(첫글자 한글, 대문자도 안돼 해도 되는데 소문자로 시작해야해 회사가서 혼나)

// 	=	 같다 x
//		오른쪽에 있는거를 왼쪽에 넣어라

// 기본자료형
//		아무처리도 안하고 값만 있으면 
		//456456 -> int 로 인식 
		//234324.332 -> double 로 인식
		
		int kS; // 변수 만들기, 변수명 변경시 변수명 범위 지정하고 refactor > rename
		kS = 80; // 변수에 값 저장 , 바꾸면 바꾼 수대로 또 출력가능
		
		System.out.println("ks"); //""를 쓰면 글자를 출력
		System.out.println(kS); //ks변수에 들어있는 값을 출력
		System.out.println(kS); //ks변수에 들어있는 값을 출력
		System.out.println(kS); //ks변수에 들어있는 값을 출력
		System.out.println(kS); //ks변수에 들어있는 값을 출력
		System.out.println(kS); //ks변수에 들어있는 값을 출력
		
		float temp;
		//temp = 24.38; //왼쪽에 있는거 float = 오른쪽에 있는거 double 그래서 값이 안맞어
		temp = (float) 24.38; 	//형변환(casting)
								//		(자료형) 값
		System.out.println(temp);
		
		// ㅋ라는 글자를 임시 저장
		char kor;
		kor = 'ㅋ';
		System.out.println(kor);
		
		// 32bit / 64bit 참조형 변수 사이즈
		
		// ㅋㅋ라는 글자를 임시 저장
		String kor2; // string 첫글자 대문자로
		kor2 = "ㅋㅋ";
		System.out.println(kor2);
		
		// 배고픈가를 임시 저장
		boolean isHungry;
		isHungry = false;
		System.out.println(isHungry);
		
		// java지역변수를 만들고 값을 안넣으면 사용 불가능 못써
		int age; // 변수 생성
		age = 19;
		System.out.println(age);
		
		int age1 = 19;
		System.out.println(age1);
	}
}
