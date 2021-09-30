

import java.util.Scanner;

public class OperatorMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("가로 : ");
		int x = k.nextInt();
		
		System.out.print("세로 : ");
		double y = k.nextDouble();
		
		System.out.print("높이 : ");
		int z = k.nextInt();
		
		System.out.print("무게 : ");
		double w = k.nextDouble();
		
		System.out.println("-----------------");
		
		double v = x * y * z;
		System.out.printf("부피 : %.1f\n", v);
		System.out.printf("무게 : %.1f\n", w);

		// &도 사용 가능함
		// && 처리속도가 빠르다. 컴퓨터 할 일을 줄여줄 수 있어
		// & 개발자가 편하다. 용량을 덜 차지해
		// 그래서 && 를 쓸 때는 확률이 낮은 것을 먼저 쓴다
		
		//부피가 10 이상이고, 무게가 1000 이상 이면 
		boolean a = (v >= 10) && (w >= 1000);
			//boolean a = (w >= 1000) && (v >= 10);
			System.out.println(a);
		
		// |도 사용가능 
		// || 쓸 때는 확률이 높은거를 먼저 쓴다.
		// 부피가 10 미만이거나, 무게가 1000미만이면
		boolean b = (v <= 10) || (w <= 1000);
			//boolean b = (w <= 1000) || (v <= 10);
			System.out.println(b);
			
		// 부피가 10 미만 이던지, 부피가 1000 미만이든지
		boolean d = (v < 10) ^ (v < 1000);
			System.out.println(d);
			
		// 무게가 20이상이고 무게가 30이상이면
		boolean c = (w >= 20) && (w >= 30);
			//boolean c = w>=20;
			System.out.println(c);
			
		 
	}
}
