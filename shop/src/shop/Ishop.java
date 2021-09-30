package shop;

// 완전추상화 => 상수필드, 추상메서드만 가짐
// jdk8 => default, static 메서드 가질 수 있기는 함

public interface Ishop {
	void setTitle(String title); // public abstract 부분이 생략됨
	void genUser();
	void genProduct();
	void start();	
}
