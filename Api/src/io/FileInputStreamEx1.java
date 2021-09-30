package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {
	public static void main(String[] args) {
		
//		InputStream in = null;  //추상클래스로 들어가 있어
//		OutputStream out = System.out;
//		
//		//읽어온 걸 좀 편하게 하려면 바이트배열을 쓰자
//		byte[] datas = new byte[100];
//		
//		try {
//			 //인풋스트림을 파일에서 불러올거니까 파일 인풋스트림을 넣자
//			in = new FileInputStream("C:\\temp\\file1.txt");
//												//c에 temp에 file1을 읽어올거야	
//			
//			while(in.read(datas)!=-1) { //읽어 올때 리드로 파일의 끝이 아닐때 까지 읽자 -1은 파일의 끝이라는 뜻이야 
//				out.write(datas);		//바로 화면으로 출력해줘
//			}
//			
//		} catch (FileNotFoundException e) { //FileNotFoundException 오류뜨는 거를 막았어
//			e.printStackTrace();
//		} catch (IOException e) { //IOException 은 FileNotFoundException 보다 큰 개념이야 먼저오면 오류떠
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();// in을 모르겠대 왜냐면 트라이 안에 있으니 까 그래서 in을 위로 빼서 초기화 시키고 try/catch 구문 썼어
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} 

		
		// try-with-resources(JDK 7부터) : 자동으로 자원 해제
		try(InputStream in = new FileInputStream("C:\\temp\\file1.txt"); //인풋하고 아웃풋 다 쓴다음에 니가 알아서 닫아줭
				OutputStream out = System.out;) {
			
			byte[] datas = new byte[100];
			
			while(in.read(datas)!=-1) { //읽어 올때 리드로 파일의 끝이 아닐때 까지 읽자 -1은 파일의 끝이라는 뜻이야 
				out.write(datas);		//바로 화면으로 출력해줘
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
