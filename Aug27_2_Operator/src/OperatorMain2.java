
//	논리연산자
//	>	>=	==	!=		<=	<
//	초과	이상	같다	다르다	이하	미만

// 논리결합연산자
//	&& &	| ||	!		^
//	and		or		not		xor(eXclusive OR - 베타적 OR)

//


// 키 : 
// 나이 :
// -----------
// 키 cm, 나이 살

import java.util.Scanner;

public class OperatorMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("키 : ");
		double zl = k.nextDouble();
		
		System.out.print("나이 : ");
		int sk = k.nextInt();
		
		System.out.println("-----------");
		System.out.printf("키 %.1fcm, 나이 %d살\n", zl, sk);
		
		// 키가 150 넘나
		boolean a = (zl > 150);
		System.out.println(a);
		
		// 나이가 10살 이하
		boolean b = (sk <= 10); //부등호가 2개야 그래서 햇갈리면 괄호를 써줘 보기 좋으라고
		System.out.println(b);
		
		// 나이가 5살 이상이고, 키가 200cm 이상인가
		boolean c = (sk >= 5) && (zl >= 200);
		System.out.println(c);
		
		// 키가 200cm 이상이거나 나이가 5살 이상인가
		boolean d = (zl >= 200) || (sk >= 5);
		System.out.println(d);
		
		// d가 true 면 e는 false
		// d가 false 면 e는 true
		boolean e = !d; 			//!앞에다 넣으면 반대로 넣기
		System.out.println(e);

	}
}
