package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
		
		 // 키-> 스트림 -> 모니터랑 하나의 통로를 만들어주는 작업
		InputStream in = System.in;
		OutputStream out = System.out;
		
		// 파일에서 받아올거야
		//FileInputStream fis;
		
		// 파일을 쓸거야
		//FileOutputStream fos; 
		
		try {
			int input = in.read();
			out.write(input);
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //exception 이 발생하던 발생하지 않던 무조건 실행되는 구문이야
			//자원해제 (사용했던 것들을 닫아주는 작업)
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
