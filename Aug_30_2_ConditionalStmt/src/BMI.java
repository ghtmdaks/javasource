import java.util.Scanner;

public class BMI {
	public static void main(String[] args) throws InterruptedException {
		Scanner k = new Scanner(System.in);
	
		System.out.println("비만 검사 센터");
		
		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.print("키(m) : ");
		double t = k.nextDouble();
			if (t >=3) {
				t /= 100;
			}

		System.out.print("몸무게 : ");
		double w = k.nextDouble();
		
		System.out.println("---------------");
		
		double bmi = w / (t * t);
		Thread.sleep(2000);
		System.out.printf("BMI = %.1f\n", bmi);
		
		if (bmi >= 35) {
			System.out.println("고도 비만");
		}else if (bmi >= 30) {
			System.out.println("중도 비만");
		}else if (bmi >= 25) {
			System.out.println("경도 비만");
		}else if (bmi >= 23) {
			System.out.println("과체중");
		}else if (bmi >= 18.5) {
			System.out.println("정상");
		}else {
			System.out.println("저체중");
		}
//------------------------------------------------------------------	
		String result = "저체중";
		if (bmi >= 35) {
			result = "고도 비만";
		}else if (bmi >= 30) {
			result = "중도 비만";
		}else if (bmi >= 25) {
			result = "경도 비만";
		}else if (bmi >= 23) {
			result = "과체중";
		}else if (bmi >= 18.5) {
			result = "정상";
		}
		Thread.sleep(3000);
		System.out.printf("%s는 %sn\", name, result");
	}
}
