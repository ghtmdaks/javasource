package classTest;

public class DataEX {
	public static void main(String[] args) {
		Data data = new Data();
		System.out.println("data"+data);
		//dataclassTest.Data@2a139a55
		
		//힙에 데이터를 잡아주고 데이터가 하나 만들어져
		
		//x의 값 10으로 지정
//		data.x=10;
//		change(data.x); //data 객체 안의 x멤버변수가 가지는 값을 보냄
//		System.out.println("after change()x = "+data.x);
//		//돌아왔을 때 우리의 x 는 10이 되버렸엉ㅜㅜ 
		
		System.out.println();
		//근데 나는 10000으로 바쿠고 시포
		change(data);
		System.out.println("after change()x = "+data.x);
		
	}
	static void change(int x) {//x를 받아서
		x = 10000; // x를 10000으로 변경했어
		System.out.println("change() x= "+x);
	}
	static void change(Data d) {
		//d 에는2a139a55이 주소가 들어가 있어 
		System.out.println(d);
		//자 이제 d가 넘어왔으 이제 10000으로 바꿔볼까?
		d.x = 10000;
		
		
		
	}
}
