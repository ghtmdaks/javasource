package test;

import java.io.IOException;

public class WhileTest3 {
	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		int keycode = 0, speed=0;
		
		while(run) {
				//13 => CR && 10 => LF : ����(\r\n);
			if(keycode!=13 && keycode != 10) { //�ٸ������� �����°� ����, �ڵ��� ������ ������ �־��ٶ�� ���� ��;
				System.out.println("======================");
				System.out.println("1. ���� | 2. ����| 3. ����");
				System.out.println("======================");
				System.out.print("���� : ");			
			}
			
			keycode = System.in.read(); // 1=> 49, 2=> 50 3=> 51 (�ƽ�Ű�ڵ�ǥ ����)
			
			if(keycode == 49) {
				speed++;
				System.out.println("����ӵ� = "+speed);
			}else if (keycode==50) {
				speed--;
				System.out.println("����ӵ� = "+speed);
			}else if (keycode==51) {
				run = false;
			}
			
			
		}
		System.out.println("���α׷� ����");
	}
}
