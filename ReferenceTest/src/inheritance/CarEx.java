package inheritance;

public class CarEx {

	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
		//f = a; 아무 상관없는 놈들끼리는 대입이 안돼! 부모가 같은데 상속관계가 안돼
		//			즉, 상속 관계가 아닌 클래스간의 형변환 불가
		
		f = new FireEngine();
		
		//Car car = new FireEngine();
		Car car = f; //이거는 부모자식 관계야 
					 //상속관계가 있는 상태에서는 형변환이 가능해 upcasting (괄호 형변환이 생략 가능해)
		
		FireEngine f2;
		f2 = (FireEngine) car; //문법적으로 아예 틀렸어
								//괄호로 뭔가 들어오면 캐스팅이라고해 Downcasting(생략불가)
		f2.water(); //Car(부모)도 호출할 수 있고 자신꺼도 호출할 수 있어
		
		
	}

}
