package io;

import java.io.File;

/* File
 * ������ �ٷ�� ����Ŭ����
 * ����(���丮) : / �Ǵ� \ ǥ���ϴ� ���°� �־�
 * 
 * \�� ���̸� �̽����������ڷ� �ν���
 * �̽������� ���ڰ� ���ĸ� \t \n \b.... �翬�� �̷��ֵ��� �ðŶ�� ��븦 ��
 * �׷��� �ϳ��� �� �ٿ� �̽������� ���ڰ� �ƴϰ� �������� ���������� ��, \\ = \ ��ǻ�Ͱ� �ϳ��� �ν��ϰԲ� 
 * 
 */

public class FileEx1 {
	public static void main(String[] args) {
		//�츮�� �ϵ��ũ�� �ִ� ������ ��� �����ؼ� ó���� �Ҳ���
		
		//��ü����
		
		//File ��Ʈ�ѽ����̽� ù��°��
		File file1 = new File("c:\\temp\\test1.txt"); //c����̺꿡 ���� ������ �׽�Ʈ1�ؽ�Ʈ ������ �����غ���?
														//c����̺꿡 ���� ������ ���ٰ� �ص� ������ �����ʾ� ���� �������� �ʾҰŵ�
		//4��°��
		File file2 = new File("c:\\temp", "test1.txt"); 
		
		File file3 = new File("c:\\temp");
		//3��°��
		File file4 = new File(file3, "test1.txt");
		// File file4 = new File(new File("c:\\temp"), "test1.txt"); file3,4 ���ļ� �����
														
	}
}
