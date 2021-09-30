package com.hot.util.file;

import java.io.File;
import java.util.Calendar;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.hot.file.FileDTO;

@Component
public class FileUploader {
	
	public FileDTO upload(MultipartFile multipartFile, String path) throws Exception {
		
		File file = new File(path);
		if (!file.exists()) { // 해당 경로가 존재하지 않는다면
			file.mkdirs(); // 해당경로 만들기
		}
		
		String oname = multipartFile.getOriginalFilename(); // 업로드시 파일이름
		String fname = this.getNameByCalendar(oname); // 서버에 저장된 파일이름
		
		file = new File(file, fname);
		
		// 파일 업로드
		byte[] data = multipartFile.getBytes();
		FileCopyUtils.copy(data, file);

		FileDTO fileDTO = new FileDTO();
		fileDTO.setOname(oname); // oname을 FileDTO에 저장
		fileDTO.setFname(fname); // fname을 FileDTO에 저장
		
		return fileDTO;
	}

	private synchronized String getNameByCalendar(String oname) {
		Calendar calendar = Calendar.getInstance();
		long timeInMillis = calendar.getTimeInMillis();
		String fname = oname.substring(0, oname.lastIndexOf('.')) + "_" + String.valueOf(timeInMillis)
				+ oname.substring(oname.lastIndexOf('.'));
		return fname;
	}

}
