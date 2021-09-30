package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
		
		// System.in : 키보드 입력
		InputStream in = System.in; 
		int input=0;
		try {
			//int input = in.read();
			while((input=in.read())!=-1) {	// read 는 항상 1바이트씩 받아, 그래서 한글을 입력하면 깨져서 나와	
				System.out.print((char)input); //강제형변환 하지 않으면 아스키코드로 나와
			}		
		} catch (IOException e) {			
			e.printStackTrace();
		}
		

	}
}
















