package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx4 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(new File("c:\\temp\\Rolling.mp3"));
			fos = new FileOutputStream("c:\\temp\\Rolling_copy.mp3");
			
			byte[] datas = new byte[1024]; //파일의 크기와 상관없이 1024바이트 씩 읽어오는거야
										    // 그래서  파일의 크기가 0이 될 때까지 읽어오는거야 
											 // 읽어오려는 파일의 크기가 40000바이트면 1024바이트씩  
			while (fis.read(datas)!=-1) { 	  // 와일문을 통해 반복해서 계속 읽어올거야 다 읽어오면 0이 되겠
				fos.write(datas);			   // 그래서 -1이 파일의 끝이라고 하는거야
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
