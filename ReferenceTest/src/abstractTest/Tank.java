package abstractTest;

public class Tank extends Unit {
	
	void changMode() {
	}
	@Override
	void move(int x, int y) {
		System.out.printf("%d,%d �������� �̵�",x,y);
	}

}
