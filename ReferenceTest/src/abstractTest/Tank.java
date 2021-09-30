package abstractTest;

public class Tank extends Unit {
	
	void changMode() {
	}
	@Override
	void move(int x, int y) {
		System.out.printf("%d,%d 지점으로 이동",x,y);
	}

}
