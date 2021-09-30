package io;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\InputStreamEx.java");//���� �� ���� ����
		
		//���� �̸� ������ �� �� �ִ��� �غ���
		String fileName = file.getName(); //����ü��ִ°� get
		
		//�����ٶ� InputStreamEx.java �̰ŷ� ������
		System.out.println("���ϸ� : "+fileName);
		
		//Ȯ���ڴ� �ʿ���� �������ϸ� InputStreamEx �� ������ ���� �;�
		//�߶󳻱� tokenizer ������ ���ؼ� .�������� �߶󳻰� �;�
		//ù��°�� .��ġ�� �ľ����� ��� ã���ž�?
		//String ������ �������ִ� �Ȱ����� �ִϰ� �����ž�
		int pos = fileName.lastIndexOf("."); // pos �� .�� ��ġ�� �˷��ٰž�
		//substring 2��°����
		System.out.println("Ȯ���ڸ� ������ ���ϸ� : "+fileName.substring(0, pos));
																	//��𼭺��� ������ ©�󳻼� �����ٱ�?
		//�׷��� Ȯ���ڸ� �̾ƺ���?
		//substring 1��°����
		System.out.println("Ȯ���� : "+fileName.substring(pos+1));
														// ������ ©�� �����ٱ�?
		//��ü ��θ� �˷��ٲ���
		System.out.println("��θ� ������ ���ϸ� : " + file.getPath());//�������� ������ get ��¼�� ��¼���� ã�ƺ���
		
		//�տ� ��θ� �̾ƺ���?
		System.out.println("������ ���� �ִ� ���ϸ� : "+file.getParent());//���� �����ϱ� �θ� ��������
		
		//������ ���۷�����(������ �и��� ���� �ϰ��־�?)  \�� �и��ϰ� �־�~
		System.out.println("File.separator : "+File.separator);
		
		// ;�� �ǹ̴� ȯ�溯������ �������� �ߺ��� �ɶ� ;���� ������ ���� 
		// �ü������ �޶� �װ� ���� �ϴ��� �˷��ִ°ž� 
		System.out.println("File.pathSeparator : "+File.pathSeparator); 

	}
}
