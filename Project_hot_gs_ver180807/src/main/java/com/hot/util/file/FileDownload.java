package com.hot.util.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

public class FileDownload extends AbstractView {

	public FileDownload() {
		this.setContentType("application/download;charset=UTF-8");
	}

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("FileDownload:");

		File file = (File) model.get("file");
		String oname = (String) model.get("oname");

		response.setCharacterEncoding(this.getContentType()); // 한글 나오도록 위에서 설정한 콘텐츠 타입 받아오기
		response.setContentLength((int) file.length()); // 파일의 크기
		String fname = URLEncoder.encode(oname, "UTF-8"); // 실제 파일명을 UTF-8로
		System.out.println("fname: ++" + fname);
		response.setHeader("Content-Disposition", "attatchment;filename=\""+fname+"\"");
		response.setHeader("Content-Transfer-Encoding", "binary");

		OutputStream outputStream = response.getOutputStream(); // client stream
		FileInputStream fileInputStream = new FileInputStream(file);

		FileCopyUtils.copy(fileInputStream, outputStream);

		fileInputStream.close();
		outputStream.close();

	}

}
