package inheritance;

public class Account2 {
	private String acc;
	private int mon;
	private String name;
	
//	public Account2() {
//		super();
//	}
	public Account2(String acc, int mon, String name) {
		super();
		this.acc = acc;
		this.mon = mon;
		this.name = name;
	}
	
	public Account2(String acc, String name) {
		super();
		this.acc = acc;
		this.name = name;
	}
	
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMon(int mon) {
		this.mon = mon;
	}

	public int getMon() {
		return mon;
	}
	
	void addmon(int cash) {
		mon += cash;
	}
	
	int minmon(int cash) {
		if(mon > cash) {
			mon -= cash;
		}
		return mon;
	}
}
