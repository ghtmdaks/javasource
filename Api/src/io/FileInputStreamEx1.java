package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {
	public static void main(String[] args) {
		
//		InputStream in = null;  //�߻�Ŭ������ �� �־�
//		OutputStream out = System.out;
//		
//		//�о�� �� �� ���ϰ� �Ϸ��� ����Ʈ�迭�� ����
//		byte[] datas = new byte[100];
//		
//		try {
//			 //��ǲ��Ʈ���� ���Ͽ��� �ҷ��ðŴϱ� ���� ��ǲ��Ʈ���� ����
//			in = new FileInputStream("C:\\temp\\file1.txt");
//												//c�� temp�� file1�� �о�ðž�	
//			
//			while(in.read(datas)!=-1) { //�о� �ö� ����� ������ ���� �ƴҶ� ���� ���� -1�� ������ ���̶�� ���̾� 
//				out.write(datas);		//�ٷ� ȭ������ �������
//			}
//			
//		} catch (FileNotFoundException e) { //FileNotFoundException �����ߴ� �Ÿ� ���Ҿ�
//			e.printStackTrace();
//		} catch (IOException e) { //IOException �� FileNotFoundException ���� ū �����̾� �������� ������
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();// in�� �𸣰ڴ� �ֳĸ� Ʈ���� �ȿ� ������ �� �׷��� in�� ���� ���� �ʱ�ȭ ��Ű�� try/catch ���� ���
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} 

		
		// try-with-resources(JDK 7����) : �ڵ����� �ڿ� ����
		try(InputStream in = new FileInputStream("C:\\temp\\file1.txt"); //��ǲ�ϰ� �ƿ�ǲ �� �������� �ϰ� �˾Ƽ� �ݾƢa
				OutputStream out = System.out;) {
			
			byte[] datas = new byte[100];
			
			while(in.read(datas)!=-1) { //�о� �ö� ����� ������ ���� �ƴҶ� ���� ���� -1�� ������ ���̶�� ���̾� 
				out.write(datas);		//�ٷ� ȭ������ �������
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
