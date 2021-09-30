package classTest;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	//공통으로 사용하는 상수
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * EARTH_RADIUS * EARTH_RADIUS * Math.PI;
	}
	
}
