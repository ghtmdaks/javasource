package poly;

public class Point {
	int x;
	int y;
	
	public Point() {
		this(0,0);
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	String getXY() {
		return"("+x+","+y+")";
	}
}
