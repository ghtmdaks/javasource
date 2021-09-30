package inheritance;

public class PolyEx {
	public static void main(String[] args) {
		
		Parent2 p2 = new Child3();
		
		p2.field1="";
		p2.method1();
		p2.method2(); //오버라이딩 된 상태라면 자식 클래스의 메소드가 실행
		
		//method3 실행 어떻게 하지?
		Child3 c = (Child3)p2;
		c.method3();
		
//		java.lang.ClassCastException 실행시켰는데 안됐어 18번라인 아니야 ㅠ		
//		Parent2 obj = new Parent2(); //생성을 부모껄로 했잖아 (해결방식은 똑같이 나오는데 그래도 안돼 ㅠ)
//		Child3 c2 = (Child3) obj; 
//		c2.method3();
		
		
	}

}
