package classTest;

public class Triangle {
	//삼각형 넓이 구하기
	//밑변 * 높이 / 2
	
	//속성 : 밑변, 높이 
	int b;
	int h;
	
	//생성자는 기본 생성자
	//Triangle(){} 기본생성자는 안만들어도 돼 자동으로 생성해주거든
	
	//기능(메소드) : 밑변 * 높이 / 2 결과 리턴
	int area(){
		return (b*h)/2;
	}

}
