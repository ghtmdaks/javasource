package io;

import java.io.File;

/* File
 * 파일을 다루기 위한클래스
 * 폴더(디렉토리) : / 또는 \ 표현하는 형태가 있어
 * 
 * \를 붙이면 이스케이프문자로 인식해
 * 이스케이프 문자가 뭐냐면 \t \n \b.... 당연히 이런애들이 올거라고 기대를 해
 * 그래서 하나를 더 붙여 이스케이프 문자가 아니고 실제문자 역슬래쉬야 즉, \\ = \ 컴퓨터가 하나로 인식하게끔 
 * 
 */

public class FileEx1 {
	public static void main(String[] args) {
		//우리의 하드디스크에 있는 파일을 어떻게 접근해서 처리를 할꺼냐
		
		//객체생성
		
		//File 컨트롤스페이스 첫번째꺼
		File file1 = new File("c:\\temp\\test1.txt"); //c드라이브에 템프 폴더에 테스트1텍스트 파일을 생성해볼까?
														//c드라이브에 템프 폴더가 없다고 해도 에러가 나지않아 아직 접근하지 않았거든
		//4번째까
		File file2 = new File("c:\\temp", "test1.txt"); 
		
		File file3 = new File("c:\\temp");
		//3번째꺼
		File file4 = new File(file3, "test1.txt");
		// File file4 = new File(new File("c:\\temp"), "test1.txt"); file3,4 합쳐서 만들기
														
	}
}
