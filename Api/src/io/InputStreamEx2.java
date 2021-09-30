package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
		
		 // Ű-> ��Ʈ�� -> ����Ͷ� �ϳ��� ��θ� ������ִ� �۾�
		InputStream in = System.in;
		OutputStream out = System.out;
		
		// ���Ͽ��� �޾ƿðž�
		//FileInputStream fis;
		
		// ������ ���ž�
		//FileOutputStream fos; 
		
		try {
			int input = in.read();
			out.write(input);
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
