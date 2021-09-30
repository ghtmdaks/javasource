package abstractTest;

public class Marine extends Unit {
	
	void stimpack() {
	}
	@Override
	void move(int x, int y) {
		System.out.printf("%d,%d 지점으로 이동",x,y);
	}

}
