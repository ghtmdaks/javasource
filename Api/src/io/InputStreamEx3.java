package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class InputStreamEx3 {
	public static void main(String[] args) {
		
		 // Ű-> ��Ʈ�� -> ����Ͷ� �ϳ��� ��θ� ������ִ� �۾�
		InputStream in = System.in;
		PrintStream out = System.out;
		
		// ���Ͽ��� �޾ƿðž�
		//FileInputStream fis;
		
		// ������ ���ž�
		//FileOutputStream fos; 
		
		
		byte b[] = new byte[100]; //read�� �������ڸ� �ޱ�����  �迭�� ������� 
		
		try {
			//�Է� ��Ʈ������ ������ byte �� ��ŭ �о����
		  while(in.read(b)!=-1) {
				out.write(b);
		  }
		  
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //exception �� �߻��ϴ� �߻����� �ʴ� ������ ����Ǵ� �����̾�
			//�ڿ����� (����ߴ� �͵��� �ݾ��ִ� �۾�)
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
