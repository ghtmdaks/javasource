package classTest;

public class Triangle2 {
	//삼각형 넓이 구하기
	//속성 : 밑변, 높이 
	private int b;
	private int h;
	

	
	//생성자는 기본 생성자
	//Triangle(){} 기본생성자는 안만들어도 돼 자동으로 생성해주거든
	
	//Triangle2() is undefined
	
	Triangle2(int b, int h){
		this.b = b;
		this.h = h;
	}
	
	//기능(메소드) : 밑변 * 높이 / 2 결과 리턴
	int area(){
		return (b*h)/2;
		
	}

}
