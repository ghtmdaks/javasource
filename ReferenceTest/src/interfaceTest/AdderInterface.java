package interfaceTest;

/*1)상수 필드만 가짐;
 *2) 모든 메소드가 추상메소드만 가져서 abstract 를 안붙여도돼
 */

public interface AdderInterface {
	//Illegal modifier for the interface field AdderInterface.x; only public, static & final are permitted
	public static final int X=100;
	
	//Abstract methods do not specify a body
	void method1();
	
	//1.8 부터 
	//static 메소드와 default 메소드 들어올 수 있음
	static void method2() {
		
	}
	default void method3() {
		
	}
	
}












