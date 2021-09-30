package abstractTest;

public abstract class Unit {
	
	int x, y;

	abstract void move(int x, int y);
	void stop() {
		System.out.println("지정된 위치에서 stop");
	}
	
}
