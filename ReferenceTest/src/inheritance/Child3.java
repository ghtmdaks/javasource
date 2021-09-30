package inheritance;

public class Child3 extends Parent2 {
	String field2;
	
	@Override
	public void method2() {
		System.out.println("Parent-method2()");
	}
	
	public void method3() {
		System.out.println("Parent-method3()");
	}
}
