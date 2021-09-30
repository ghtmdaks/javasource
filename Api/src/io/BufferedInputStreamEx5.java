package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx5 {
	public static void main(String[] args) {
		
		//FileInputStream 만 사용하는 경우 + byte 배열
		//FileOutputStream
		try(FileInputStream fis = new FileInputStream("c:\\temp\\Rolling.mp3");
				FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy4.mp3")){
			
			byte data[] = new byte[1024];
			
			Long start = System.currentTimeMillis();
			while(fis.read(data)!=-1) {
				fos.write(data);
			}
			Long end = System.currentTimeMillis();
			System.out.println("FileInputStream + byte + FileOutputStream 사용시 "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//FileInputStream + BufferedInputStream + byte 배열 사용하는 경우
		//FileOutputStram + BufferedOutPutStream
		try(FileInputStream fis = new FileInputStream("c:\\temp\\Rolling.mp3");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy4.mp3");
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			byte data [] = new byte[1024];
			
			Long start = System.currentTimeMillis();
			while(bis.read(data)!=-1) {
				bos.write(data);
			}
			bos.flush();
			Long end = System.currentTimeMillis();
			System.out.println("FileInputStream+BufferedInputStream+byte 사용시 "+(end-start));
				
		}
			
		catch (Exception e) {
			e.printStackTrace();
	
		}
	}
}
