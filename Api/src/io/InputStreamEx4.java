package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {
	public static void main(String[] args) {
		InputStream in = System.in;	//Ű����� �����ϰ� ������ ��
		OutputStream out = System.out; //����Ͷ� �����ϰ� ������ �ƿ�
		
		byte[] datas = new byte[100];
		
		//����ڷκ��� �̸��� �ϰ� ���� ���� �Է¹��� �Ŀ�
		//String ��ü�� ��ȯ
		
		System.out.print("�̸� : ");
		//Ű����� �Է��ϰ� �;�
		try {
			int nameBytes = in.read(datas); //�������̳��� try/catch
											// ����ڰ� �����Ʈ ��ŭ ����ߴ��� �˷���
			String name = new String(datas, 0, nameBytes-2); 		    //`�츮�� ����Ʈ �迭�� ������ �����ϱ� 
									//�迭 ,������ġ,�迭���̱��� ȫ�浿-2(Enter)���� ����?	//`������ �� ����Ʈ�迭 �ִ°ŷ� �����������
														//Enter : 2���� �ڵ�� �����Ǿ� �־� 
														//carriage return => �ƽ�Ű 13��, Line feed : �ƽ�Ű 10��
			System.out.println("�ϰ� ������ : ");
			int commentByte = in.read(datas);
			String comment = new String(datas,0,commentByte-2);
			
			System.out.println("�Է��� �̸� : "+name);
			System.out.println("�Է��� �ϰ� ���� �� : "+comment);
			
		} catch (IOException e) {
			e.printStackTrace();//exception�� ���� exception�� ���� code���� ���󰡸鼭 ��� error�� ������ ȭ�� �������
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
}
