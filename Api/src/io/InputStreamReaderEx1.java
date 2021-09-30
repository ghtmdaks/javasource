package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;

// 문자 변환 보조 스트림
// 바이트기반 스트림 => Reader or Writer 로 변환해서 사용
// 인코딩 방식을 지정 할 수 있어 예를 들어 한글이 깨지는 현상을 맞춰 줄 수 있어
// 인코딩 방식이 뭐지? 문자를 주고 받는 방식이야 인코딩 방식에는 여러개가 있어
// utf-8, euc-kr, ms949, ascii .... 등등 많아


public class InputStreamReaderEx1 {
	public static void main(String[] args) {
		
		try(InputStreamReader reader = new InputStreamReader
				(new FileInputStream("c:\\temp\\file1.txt"),"ms949");
			FileWriter writer = new FileWriter("c:\\temp\\test3.txt")){
			
			char cbuf[]=new char[100];
			
			while(reader.read(cbuf)!=-1) {
				writer.write(cbuf);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
