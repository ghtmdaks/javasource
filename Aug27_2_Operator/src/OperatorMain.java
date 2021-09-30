
//	대입연산자
//		=
//			모든 연산자 중 가장 늦게 발동

//	산술연산자
//		+
//			String + 문자 => 붙여서 String 으로
//		-
//		*
//		/ 
//			나누기 할 때 int 로 사용하면 소수점이 없어져, 살리고 싶으면 double 근데 소수점이 0이돼
//			그래서 나눗셈 할 때 신경 써줘야 해
//			int / int => 나눠서 int 로
//			둘 중에 하나라도 실수형이 어야해 int / double , double / int, double/double
//		%	나누기 할 때 나머지 구하는 거

//	결합형연산자(대입+산술연산자)
//		+=
//		-=
//		*=
//		/=
//		%=

//	증감연산자
//		++
//		--

import java.util.Scanner;

public class OperatorMain {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.print("x : ");
		int xx = c.nextInt();
		System.out.print("y : ");
		int yy = c.nextInt();
		System.out.println("----------");
		System.out.printf("x는 %d, y는 %d\n", xx, yy);
	
		String laugh = "ㅋ";
		
		int a = xx + yy;
		String aa = xx + laugh;
		
		int b = xx - yy;
		String bb = "차는" + b;
		
		int g = xx * yy;
		
		int h = xx / yy;
		double hh = xx / yy;
		double hhh = xx / (double) yy;
		
		int e = xx % yy; 
		
		System.out.println(a);
		System.out.println(aa);
		System.out.println(bb);
		System.out.println("차는 " + b); //변수를 조금이라도 덜 써보자 
		System.out.println(g);
		System.out.println(h);
		System.out.println(hh);
		System.out.println(hhh);
		System.out.println(e);
		System.out.println("-----------");
		
		//xx = xx + 5;
		xx += 5; //위에 하고 기능이 같은 대신에 용량이 적다
		System.out.println(xx); // 좌항 + 5 만큼 우항에 넣는다
		
		//yy = yy - 3;
		yy -= 3;
		System.out.println(yy); // 좌항 -3 만큼 우항에 넣는다
		
		xx *= 3;
		System.out.println(xx);
		
		yy /= 6;
		System.out.println(yy);
		
		xx %= 5;
		System.out.println(xx);
		System.out.println("-------------");
		
		// xx = xx + 1;
		// xx += 1;
		xx++; //하나 올리고 하나 내리고 할때
		System.out.println(xx++);
		System.out.println(++xx); 
		System.out.println(xx++ + yy); //이거 쓰지마 이거 실무에서 쓰면 개터져 교수들이 괴롭힐라고 하는거
	}
}

