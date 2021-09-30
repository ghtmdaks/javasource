package io;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\InputStreamEx.java");//지금 이 파일 없어
		
		//파일 이름 가지고 올 수 있는지 해보자
		String fileName = file.getName(); //갖고올수있는거 get
		
		//돌려줄때 InputStreamEx.java 이거로 돌려줘
		System.out.println("파일명 : "+fileName);
		
		//확장자는 필요없고 순수파일명 InputStreamEx 만 가지고 오고 싶어
		//잘라내기 tokenizer 개념을 통해서 .기준으로 잘라내고 싶어
		//첫번째로 .위치를 파악하자 어떻게 찾을거야?
		//String 에보면 가지고있니 안가지고 있니가 있을거야
		int pos = fileName.lastIndexOf("."); // pos 가 .의 위치를 알려줄거야
		//substring 2번째껄로
		System.out.println("확장자를 제외한 파일명 : "+fileName.substring(0, pos));
																	//어디서부터 어디까지 짤라내서 보여줄까?
		//그러면 확장자만 뽑아볼까?
		//substring 1번째껄로
		System.out.println("확장자 : "+fileName.substring(pos+1));
														// 어디부터 짤라서 보여줄까?
		//전체 경로를 알려줄꺼야
		System.out.println("경로를 포함한 파일명 : " + file.getPath());//가져오고 싶으면 get 어쩌구 저쩌구를 찾아보자
		
		//앞에 경로만 뽑아볼까?
		System.out.println("파일이 속해 있는 파일명 : "+file.getParent());//속해 있으니까 부모를 생각해자
		
		//파일의 세퍼레이터(파일의 분리를 뭘로 하고있어?)  \로 분리하고 있어~
		System.out.println("File.separator : "+File.separator);
		
		// ;의 의미는 환경변수에서 여러개를 중복이 될때 ;으로 구별을 해줘 
		// 운영체제마다 달라서 그걸 뭘로 하는지 알려주는거야 
		System.out.println("File.pathSeparator : "+File.pathSeparator); 

	}
}
