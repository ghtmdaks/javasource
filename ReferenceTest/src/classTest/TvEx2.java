package classTest;

public class TvEx2 {

	public static void main(String[] args) {
		// ��ü ����, ����
		// �� ���赵 TV2�� ���ž�
		TV2 tv1 = new TV2("black", 8);
		//TV2 tv1 = new TV2
		//tv1.color="black";
		//tv1.channel=8;
		// �÷��� ���̰� Ƽ�� Ű�� ó���� ä��8������ ��������
		TV2 tv2 = new TV2();
		// 2��°�� �⺻ ������� �������
		tv2.color="white";
		


		System.out.println("ä�� ���� : " + tv1.channel);
		System.out.println("ä�� ���� : " + tv2.channel);
	}

}
