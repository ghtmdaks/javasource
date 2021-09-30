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
			
			byte[] datas = new byte[1024]; //������ ũ��� ������� 1024����Ʈ �� �о���°ž�
										    // �׷���  ������ ũ�Ⱑ 0�� �� ������ �о���°ž� 
											 // �о������ ������ ũ�Ⱑ 40000����Ʈ�� 1024����Ʈ��  
			while (fis.read(datas)!=-1) { 	  // ���Ϲ��� ���� �ݺ��ؼ� ��� �о�ðž� �� �о���� 0�� �ǰ�
				fos.write(datas);			   // �׷��� -1�� ������ ���̶�� �ϴ°ž�
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
