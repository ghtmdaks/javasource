package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx3 {
	public static void main(String[] args) {
		
		// 그림 파일을 복사해 보자
		
		//컴퓨터 입장에서는 모두 2진수로 처리해버려서 
		//이미지 파일이든 음악 파일이든 다 0101010101010 로 바꿔버려
		//그래서 나는 인풋 스트림이랑 아웃풋 스트림을 써서 01010101010로 바꿔버리겠다
		
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		
//		try {
//			fis = new FileInputStream(new File("c:\\temp\\picture.jpg")); //파일을 불러오자
//			fos = new FileOutputStream("c:\\temp\\picture_copy.jpg");     //불러온 파일을 복사해보자
//			
//			byte[] datas = new byte [1024];
//			while (fis.read(datas)!=-1) { //fis 를 읽어올거야 파일의 끝이 아닐때 까지
//				fos.write(datas); 		  //읽어온 데이터를 써보자
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				fos.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
		
		try(FileInputStream fis = new FileInputStream(new File("c:\\temp\\picture.jpg"));
				FileOutputStream fos = new FileOutputStream("c:\\temp\\picture_copy.jpg")) {
			
			byte[] datas = new byte [1024];
			while (fis.read(datas)!=-1) { //fis 를 읽어올거야 파일의 끝이 아닐때 까지
			fos.write(datas); 		  //읽어온 데이터를 써보자
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
