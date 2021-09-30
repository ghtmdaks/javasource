package io;

import java.io.FileReader;
import java.io.Reader;

/* 처리할 파일이 "문자"라면 Reader, Writer 가 Stream 보다 편함 
 * byte 가 아니라 char 형태로 처리하기 때문이야
 * 
 * 
 */



public class FileReaderEx2 {
	public static void main(String[] args) {
		try(Reader reader = new FileReader("c:\\temp\\file1.txt")) {
			
			char[] cbuf = new char[100];
			int readcharNo;
			
			while ((readcharNo = reader.read(cbuf)) != -1) {
				String data = new String(cbuf, 0, readcharNo);
				System.out.println(cbuf);
			}
			reader.read();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
