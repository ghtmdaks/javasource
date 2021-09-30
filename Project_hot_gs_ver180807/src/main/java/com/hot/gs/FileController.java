package com.hot.gs;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hot.util.file.PhotoDTO;

@Controller
@RequestMapping(value = "/file/")
public class FileController {

	@RequestMapping("photoUpload")
	public String photoUpload(HttpSession session, PhotoDTO photoDTO) throws Exception {
		String path = session.getServletContext().getRealPath("resources/upload/images/se/"); // 저장 경로
		File file = new File(path);
		if (file.exists()) {
			file.mkdirs();
		}
		String oname = photoDTO.getFiledata().getOriginalFilename();
		String fname = UUID.randomUUID().toString(); // 저장될 이름
		fname = fname + "_" + oname;

		file = new File(file, fname); // 파일
		photoDTO.getFiledata().transferTo(file);

		String contextPath = session.getServletContext().getContextPath();

		String file_result = "&bNewLine=true&sFileName=" + oname;
		file_result = file_result + "&sFileURL=" + contextPath + "/resources/upload/images/se/" + fname;
		System.out.println(file_result);
		return "redirect:" + photoDTO.getCallback() + "?callback_func=" + photoDTO.getCallback_func() + file_result;

	}

}
