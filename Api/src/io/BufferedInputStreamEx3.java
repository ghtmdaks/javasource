package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx3 {
	public static void main(String[] args) {
		
		//FileInputStream �� ����ϴ� ���
		try(FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg")){
			Long start = System.currentTimeMillis();
			while(fis.read()!=-1) {}
			Long end = System.currentTimeMillis();
			System.out.println("FileInputStream ���� "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//FileInputStream + BufferedInputStream ����ϴ� ���
		try(FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis)){
			Long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			Long end = System.currentTimeMillis();
			System.out.println("FileInputStream+BufferedInputStream ���� "+(end-start));
				
		}
			
		catch (Exception e) {
			e.printStackTrace();
	
		}
	}
}
