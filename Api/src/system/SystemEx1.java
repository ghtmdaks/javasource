package system;

public class SystemEx1 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.print(i+"\t");
			
			if(i==5) {
				System.exit(0);
			}
		}
		
		//System.arraycopy(src, srcPos, dest, destPos, length);

	}
}
