package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx4 {
	public static void main(String[] args) {
		
		//FileInputStream �� ����ϴ� ��� + byte �迭
		try(FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg")){
			
			byte data[] = new byte[1024];
			
			Long start = System.currentTimeMillis();
			while(fis.read(data)!=-1) {}
			Long end = System.currentTimeMillis();
			System.out.println("FileInputStream  + byte ���� "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//FileInputStream + BufferedInputStream + byte �迭 ����ϴ� ���
		try(FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis)){
			
			byte data [] = new byte[1024];
			
			Long start = System.currentTimeMillis();
			while(bis.read(data)!=-1) {}
			Long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream + byte ���� "+(end-start));
				
		}
			
		catch (Exception e) {
			e.printStackTrace();
	
		}
	}
}
