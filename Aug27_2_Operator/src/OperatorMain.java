
//	���Կ�����
//		=
//			��� ������ �� ���� �ʰ� �ߵ�

//	���������
//		+
//			String + ���� => �ٿ��� String ����
//		-
//		*
//		/ 
//			������ �� �� int �� ����ϸ� �Ҽ����� ������, �츮�� ������ double �ٵ� �Ҽ����� 0�̵�
//			�׷��� ������ �� �� �Ű� ����� ��
//			int / int => ������ int ��
//			�� �߿� �ϳ��� �Ǽ����� ����� int / double , double / int, double/double
//		%	������ �� �� ������ ���ϴ� ��

//	������������(����+���������)
//		+=
//		-=
//		*=
//		/=
//		%=

//	����������
//		++
//		--

import java.util.Scanner;

public class OperatorMain {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.print("x : ");
		int xx = c.nextInt();
		System.out.print("y : ");
		int yy = c.nextInt();
		System.out.println("----------");
		System.out.printf("x�� %d, y�� %d\n", xx, yy);
	
		String laugh = "��";
		
		int a = xx + yy;
		String aa = xx + laugh;
		
		int b = xx - yy;
		String bb = "����" + b;
		
		int g = xx * yy;
		
		int h = xx / yy;
		double hh = xx / yy;
		double hhh = xx / (double) yy;
		
		int e = xx % yy; 
		
		System.out.println(a);
		System.out.println(aa);
		System.out.println(bb);
		System.out.println("���� " + b); //������ �����̶� �� �Ẹ�� 
		System.out.println(g);
		System.out.println(h);
		System.out.println(hh);
		System.out.println(hhh);
		System.out.println(e);
		System.out.println("-----------");
		
		//xx = xx + 5;
		xx += 5; //���� �ϰ� ����� ���� ��ſ� �뷮�� ����
		System.out.println(xx); // ���� + 5 ��ŭ ���׿� �ִ´�
		
		//yy = yy - 3;
		yy -= 3;
		System.out.println(yy); // ���� -3 ��ŭ ���׿� �ִ´�
		
		xx *= 3;
		System.out.println(xx);
		
		yy /= 6;
		System.out.println(yy);
		
		xx %= 5;
		System.out.println(xx);
		System.out.println("-------------");
		
		// xx = xx + 1;
		// xx += 1;
		xx++; //�ϳ� �ø��� �ϳ� ������ �Ҷ�
		System.out.println(xx++);
		System.out.println(++xx); 
		System.out.println(xx++ + yy); //�̰� ������ �̰� �ǹ����� ���� ������ �������� ��������� �ϴ°�
	}
}

