package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {
	public static void main(String[] args) {
		InputStream in = System.in;	//키보드랑 연결하고 싶으면 인
		OutputStream out = System.out; //모니터랑 연결하고 싶으면 아웃
		
		byte[] datas = new byte[100];
		
		//사용자로부터 이름과 하고 싶은 말을 입력받은 후에
		//String 객체로 변환
		
		System.out.print("이름 : ");
		//키보드로 입력하고 싶어
		try {
			int nameBytes = in.read(datas); //빨간줄이나면 try/catch
											// 사용자가 몇바이트 만큼 사용했는지 알려줘
			String name = new String(datas, 0, nameBytes-2); 		    //`우리는 바이트 배열을 가지고 있으니까 
									//배열 ,시작위치,배열길이까지 홍길동-2(Enter)값을 빼줘?	//`생성할 때 바이트배열 있는거로 생성해줘야해
														//Enter : 2가지 코드로 구성되어 있어 
														//carriage return => 아스키 13번, Line feed : 아스키 10번
			System.out.println("하고 싶은말 : ");
			int commentByte = in.read(datas);
			String comment = new String(datas,0,commentByte-2);
			
			System.out.println("입력한 이름 : "+name);
			System.out.println("입력한 하고 싶은 말 : "+comment);
			
		} catch (IOException e) {
			e.printStackTrace();//exception이 나면 exception이 나는 code들을 따라가면서 어디서 error가 났는지 화면 출력해줘
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
}
