package test;

import java.io.IOException;

public class WhileTest3 {
	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		int keycode = 0, speed=0;
		
		while(run) {
				//13 => CR && 10 => LF : 엔터(\r\n);
			if(keycode!=13 && keycode != 10) { //다른값들을 들어오는걸 방지, 코드의 안정성 때문에 넣었다라고 보면 돼;
				System.out.println("======================");
				System.out.println("1. 증속 | 2. 감속| 3. 중지");
				System.out.println("======================");
				System.out.print("선택 : ");			
			}
			
			keycode = System.in.read(); // 1=> 49, 2=> 50 3=> 51 (아스키코드표 참조)
			
			if(keycode == 49) {
				speed++;
				System.out.println("현재속도 = "+speed);
			}else if (keycode==50) {
				speed--;
				System.out.println("현재속도 = "+speed);
			}else if (keycode==51) {
				run = false;
			}
			
			
		}
		System.out.println("프로그램 종료");
	}
}
