package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx2 {
	public static void main(String[] args) {
		
		//file1 을 text1 안에 집어넣어 보자
		
//		FileInputStream fis = null;
//		FileOutputStream fos = null; //파일로 출력하고 싶어요
//		try {
//			 fis = new FileInputStream(new File("c:\\temp\\file1.txt"));
//			 fos = new FileOutputStream("c:\\temp\\test1.txt"); //위 파일을 읽어다가 새로운 파일에 쓸거야
//			 
//			 byte datas[]=new byte[100];
//			 while (fis.read(datas)!=-1) {
//				fos.write(datas);
//			}
//			 
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		try(FileInputStream fis = new FileInputStream(new File("c:\\temp\\file1.txt"));
				FileOutputStream fos =  new FileOutputStream("c:\\temp\\test1.txt")) {
			
				byte datas[]=new byte[100];
				while (fis.read(datas)!=-1) {
					fos.write(datas);
				}
			
		}catch (FileNotFoundException e) {
				e.printStackTrace();
		}catch (IOException e) {
				e.printStackTrace();
		}
		
	}
}
