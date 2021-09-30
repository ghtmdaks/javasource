package io;

import java.io.File;
import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {
	public static void main(String[] args) {
		
		// ���ϰ� ������ �����ؼ� �غ���
		File temp = new File("c:\\temp");
		File dir = new File("c:\\temp\\dir");
		File file1 = new File("c:\\temp\\file1.txt");
		File file2 = new File("c:\\temp\\file2.txt");
		File file3 = new File(temp,"file3.txt");
		File file4 = new File("c:\\temp\\dir\\file4.txt");
		
		if(!temp.exists()) {//�� ������ �ֳľ��ķ� �Ҹ����� ���ðž� 
			//temp ������ �������� ������ c����̺꿡 temp ������ ������
			temp.mkdir(); //������ ������ ��� make directory
		}
		if(!dir.exists()) { //dir�� ������ �������� �ʴ´ٸ�
			dir.mkdir();	//������ֶ�!
		}
		// ������ ������ ����? ������ ����Ŵϱ� try/catch ������ �������
		try {
			if(!file1.exists()) {
				file1.createNewFile();
			}
			if(!file2.exists()) {
				file2.createNewFile();
			}
			if(!file3.exists()) {
				file3.createNewFile();
			}
			if(!file4.exists()) {
				file4.createNewFile();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//���� ���� ��� ������ �ѹ� �����غ��� 
		System.out.println("\t��¥\t�ð�\t����\tũ��\t�̸�");
		System.out.println("---------------------------------------------");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		File contents[] = temp.listFiles(); //���� �迭�� �������ִ� ���¾� 

		//�迭�� ���� �������� �� �� �־� �������� �迭Ÿ��  ������ �� �θ����� �迭��
		for(File f : contents) { 
			
			System.out.print(sdf.format(new Date(f.lastModified())));//1������ ��ȣ ���� ���ʺ��� ������
						//		new Date���ϸ� ����ý����� ��¥�� long������ �����ִ°� �̿��Ѱž�<=���� ������ ��¥
			
			//�� code�� Ǯ�� ���ٸ�
			//long access = f.lastModified();// ���� ���� ��¥ �������� ���� ���� ��¥�� ��Ÿ������ ���� 
											 // ��Ÿ���� 1970�� 1�� 1�� �������� ���� ���� ��¥�� ms������ ���� 1631845210351
			//Date date = new Date(access);  // �װŸ� Date�� �̱��� ��ü�� �̾��ִϱ� Fri Sep 17 11:20:10 KST 2021
			//String formatDate = sdf.format(date); ���� ���ϰ� date�� yyyy-MM-dd a HH:mm ���·� ����ִ°ž�		
			
			
			if (f.isDirectory()) { //���� �����Ѱ� ���丮���
				System.out.print("\t<DIR>\t\t"+f.getName()); //������ DIR ���� �̸��ϳ� �����
			}else {
				System.out.print("\t\t"+f.length()+"\t"+f.getName()); //������ ����ũ���
			}
			System.out.println();
		}
		
	}
}
