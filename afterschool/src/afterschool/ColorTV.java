package afterschool;

public class ColorTV extends TV {
	
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public int getColor() {
		return color;
	}
	

	public void printPrioerty(){
		System.out.printf("%d인치 %d컬러",getSize(),color);
	}
}
