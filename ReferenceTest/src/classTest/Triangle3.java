package classTest;

public class Triangle3 {
	//삼각형 넓이 구하기
	//속성 : 밑변, 높이 
	private int b;
	private int h;
	
	//생성자는 기본 생성자
	//Triangle(){} 기본생성자는 안만들어도 돼 자동으로 생성해주거든
	
	//Triangle2() is undefined
	
	Triangle3(int b, int h){
		this.b = b;
		this.h = h;
	}
	
	
	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getH() {
		return h;
	}


	public void setH(int h) {
		this.h = h;
	}


	//기능(메소드) : 밑변 * 높이 / 2 결과 리턴
	int area(){
		return (b*h)/2;
		
	}

}
