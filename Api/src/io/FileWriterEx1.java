package io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {
	public static void main(String[] args) {
		
		try(FileWriter writer = new FileWriter(new File("c:\\temp\\text2.txt"),true)) {
			
			writer.write("FileWriter는 문자열로 바로\r\n");
			writer.write("출력할 수 있다\r\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
