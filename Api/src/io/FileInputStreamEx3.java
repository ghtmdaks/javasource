package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx3 {
	public static void main(String[] args) {
		
		// �׸� ������ ������ ����
		
		//��ǻ�� ���忡���� ��� 2������ ó���ع����� 
		//�̹��� �����̵� ���� �����̵� �� 0101010101010 �� �ٲ����
		//�׷��� ���� ��ǲ ��Ʈ���̶� �ƿ�ǲ ��Ʈ���� �Ἥ 01010101010�� �ٲ�����ڴ�
		
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		
//		try {
//			fis = new FileInputStream(new File("c:\\temp\\picture.jpg")); //������ �ҷ�����
//			fos = new FileOutputStream("c:\\temp\\picture_copy.jpg");     //�ҷ��� ������ �����غ���
//			
//			byte[] datas = new byte [1024];
//			while (fis.read(datas)!=-1) { //fis �� �о�ðž� ������ ���� �ƴҶ� ����
//				fos.write(datas); 		  //�о�� �����͸� �Ẹ��
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
			while (fis.read(datas)!=-1) { //fis �� �о�ðž� ������ ���� �ƴҶ� ����
			fos.write(datas); 		  //�о�� �����͸� �Ẹ��
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
