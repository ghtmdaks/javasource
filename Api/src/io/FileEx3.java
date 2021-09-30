package io;

import java.io.File;
import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {
	public static void main(String[] args) {
		
		// 파일과 폴더를 생성해서 해보자
		File temp = new File("c:\\temp");
		File dir = new File("c:\\temp\\dir");
		File file1 = new File("c:\\temp\\file1.txt");
		File file2 = new File("c:\\temp\\file2.txt");
		File file3 = new File(temp,"file3.txt");
		File file4 = new File("c:\\temp\\dir\\file4.txt");
		
		if(!temp.exists()) {//이 폴더가 있냐없냐로 불린으로 들어올거야 
			//temp 폴더가 존재하지 않으면 c드라이브에 temp 폴더를 만들자
			temp.mkdir(); //폴더를 생성해 줬어 make directory
		}
		if(!dir.exists()) { //dir에 폴더가 존재하지 않는다면
			dir.mkdir();	//만들어주라!
		}
		// 파일을 생성해 볼까? 여러개 만들거니까 try/catch 구문을 사용하자
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
		
		//파일 정보 출력 폴더에 한번 접근해보자 
		System.out.println("\t날짜\t시간\t형태\t크기\t이름");
		System.out.println("---------------------------------------------");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		File contents[] = temp.listFiles(); //파일 배열로 리턴해주는 형태야 

		//배열은 향상된 포문으로 쓸 수 있어 오른쪽은 배열타입  왼쪽은 뭘 부를건지 배열명
		for(File f : contents) { 
			
			System.out.print(sdf.format(new Date(f.lastModified())));//1순위는 괄호 제일 안쪽부터 돌려줘
						//		new Date를하면 현재시스템의 날짜를 long값으로 돌려주는걸 이용한거야<=최종 접근한 날짜
			
			//이 code를 풀어 쓴다면
			//long access = f.lastModified();// 최종 수정 날짜 가져오기 최종 수정 날짜는 롱타입으로 들어와 
											 // 롱타입은 1970년 1월 1일 기준으로 최종 수정 날짜가 ms단위로 나와 1631845210351
			//Date date = new Date(access);  // 그거를 Date로 미국식 객체로 뽑아주니까 Fri Sep 17 11:20:10 KST 2021
			//String formatDate = sdf.format(date); 보기 편하게 date는 yyyy-MM-dd a HH:mm 형태로 찍어주는거야		
			
			
			if (f.isDirectory()) { //현재 접근한게 디렉토리라면
				System.out.print("\t<DIR>\t\t"+f.getName()); //맞으면 DIR 찍어내고 이름하나 찍어줘
			}else {
				System.out.print("\t\t"+f.length()+"\t"+f.getName()); //랭쓰는 파일크기야
			}
			System.out.println();
		}
		
	}
}
