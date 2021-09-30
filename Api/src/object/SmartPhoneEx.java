package object;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone("삼성", "안드로이드");
		SmartPhone phone2 = new SmartPhone("애플", "ios");
		
		System.out.println(phone1); //phone1.toString()
		System.out.println(phone2); //phone2.toString()

	}

}
