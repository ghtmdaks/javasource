package classTest;

public class Circle {
	//원의 면적 구하기
	//반지름 * 반지름 * 3.14
	
	//속성 : 반지름
	double rad;
	//double pi;
	
	//기능 : 면적을 구한다.(입력값:없음, 반환값:실수형(double))
	double area() {
		return rad*rad*3.14;
		//return rad*rad*pi;
		
	}
}
