package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
		
		// System.in : Ű���� �Է�
		InputStream in = System.in; 
		int input=0;
		try {
			//int input = in.read();
			while((input=in.read())!=-1) {	// read �� �׻� 1����Ʈ�� �޾�, �׷��� �ѱ��� �Է��ϸ� ������ ����	
				System.out.print((char)input); //��������ȯ ���� ������ �ƽ�Ű�ڵ�� ����
			}		
		} catch (IOException e) {			
			e.printStackTrace();
		}
		

	}
}
















