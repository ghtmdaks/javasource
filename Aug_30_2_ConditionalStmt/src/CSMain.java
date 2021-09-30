import java.util.Scanner;

//흐름제어
//	조건문
//	반복문

// 조건문 : 특정 조건 때만 흐름이 넘어오도록
// 	if
// 	switch

//마트
//가격 : 
//------------
//xxxx원 어치 구매함
//적립 포인트 : 가격 1%
//10000원 이상 구매 시 보너트 포인트 50점 더
//2만원 초과 5만원 미만이면 포인트 100점 더, 아니면 10점 추가
public class CSMain {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("호호마트");
		
		System.out.print("가격 : ");
		int p = k.nextInt();
		System.out.println("------------");
		System.out.printf("%d 원어치 구매\n", p);
		
		int point = p / 100;
		
		if (p >= 10000) {
			point += 50;
		}
		
		if ((p > 20000) && (p < 50000)) {
			point += 100;
			
		} else {
			point += 10;
		}
		
		System.out.printf("적립 포인트 : %d\n", point);
		
		
	}
}
