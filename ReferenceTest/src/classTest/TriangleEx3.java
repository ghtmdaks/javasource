package classTest;

public class TriangleEx3 {
	private static int i;
	public static void main(String[] args) {
		//���̰� ���� �ٸ� �ﰢ�� 5���� ������ �־��.
		//���� ���ϱ�
		
		Triangle3 triArr[] = new Triangle3[5];
		
		triArr[0] = new Triangle3(5, 3);
		triArr[1] = new Triangle3(7, 9);
		triArr[2] = new Triangle3(4, 1);
		triArr[3] = new Triangle3(10, 2);
		triArr[4] = new Triangle3(6, 8);
		
		triArr(triArr);
		
		
		
	}
	static void triArr(Triangle3 triArr[]){
		//���� ���ϱ�
		for(int i=0; i<triArr.length; i++);{
			System.out.println("���� " +triArr[i].area());
			
		}
 	}
}
