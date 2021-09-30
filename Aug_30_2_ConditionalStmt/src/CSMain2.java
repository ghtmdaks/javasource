import java.util.Scanner;

//중간고사 :
//기말고사 :
//---------
//평균 : 소수점 한자리
//평균이 90점 넘으면 수라고 출력, 아니면 야!라고 출력

//	if (A) {	
//		A를 만족시켰으면
//	}else if(B) {
//		A는 아니고 B를 만족시켰을 때
//	}else {
//	} 	위에 하나도 맞는거 없으면


public class CSMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("중간고사 : ");
		int mE = k.nextInt();

		System.out.print("기말고사 : ");
		int fE = k.nextInt();
		
		System.out.println("---------------");
		
		double aV = (mE + fE) / 2.0;
		System.out.printf("평균 : %.1f\n", aV);
		
		if (aV>=90) {
			System.out.println("수");
		}else if (aV>=80) {
			System.out.println("우");
		}else if (aV>=70) {
			System.out.println("미");
		}else if (aV>=60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
		
		
		
		if (aV >= 90) {
			System.out.println("수");
		}else {
			if (aV>=80) {
				System.out.println("우");
			}else {
				if (aV>=70) {
					System.out.println("미");
				}else {
					if (aV>=60) {
						System.out.println("양");
						
					}
				}
			}
		}

	}
}
