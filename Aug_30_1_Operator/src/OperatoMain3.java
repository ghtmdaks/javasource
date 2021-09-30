//표준체중 = (키-100) * 0.9
//비만도 = (몸무게 / 표준체중) * 100
//비만도 120 초과하면 비만, 아니면 정상





import java.util.Scanner;

public class OperatoMain3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
			
			System.out.println("비만도검사");
			
			System.out.print("이름 : ");
			String name = k.next();
			
			System.out.print("키 : ");
			double h = k.nextDouble();
			
			System.out.print("몸무케 : ");
			double w = k.nextDouble();
			
			System.out.println("----------");
		
			
			double sW = (h-100) * 0.9;
			System.out.printf("표중체중 : %.2f kg\n", sW);
			
			double bC = (w / sW) * 100;
			System.out.printf("비만도 : %.2f %%\n", bC);
			
			String say = (bC > 120) ? "비만" : "정상";
			System.out.printf("%s씨는 %s\n", name, say);
			
			System.out.println("끄고 싶으면 뭐라도 쳐요");
			String t = k.next();
			
					
	}
}
