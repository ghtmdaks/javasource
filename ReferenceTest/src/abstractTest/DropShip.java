package abstractTest;

public class DropShip extends Unit {
	
	void load() {}
	void upload() {}
	
	@Override
	void move(int x, int y) {
		System.out.printf("%d,%d 지점으로 이동",x,y);
	}
}
