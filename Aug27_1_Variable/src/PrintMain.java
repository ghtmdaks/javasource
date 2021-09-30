import java.util.Scanner;

//제품명 : 
//가격 : 
//무게 : 

public class PrintMain {
	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
			System.out.print("제품명 : ");
			String name = b.next();
			
			System.out.print("가격 : ");
			int price = b.nextInt();
			
			System.out.print("무게 : ");
			double weight = b.nextDouble();
			
			Double pct = 88.5;
			
			System.out.println("-------");
			System.out.println(name);
			System.out.println(price);
			System.out.println(weight);
			
			//형식지정
			//	특수문자 
			//		%s : String 들어올 자리
			//		%d : 정수 들어올 자리
			//		%d를 쓸대 %05d를 쓰면 5자리로 자리수 맞춰서 나옮 100 -> 00100
			//		%f : float 실수 들어올 자리
			//		%f를 쓸때 %.3f를 쓰면 반올림 소수점 3자리 이하로 나옮
			//		%b : boolean
			
			// \ 문자로 쓰려면 \\ 두개 써야돼
			// % 도 %% 두개 써야돼
			
			System.out.printf("-품명 : %s-\n", name);
			System.out.printf("-가격 : %d-\n", price);
			System.out.printf("-가격 : %05d-\n", price);
			System.out.printf("-무게 : %f-\n", weight);
			System.out.printf("-무게 : %.3f-\n", weight);
			System.out.printf("-%.2f%%-\n", pct);
			System.out.printf("%s[%d원] - %fg", name, price, weight);
	}
}

