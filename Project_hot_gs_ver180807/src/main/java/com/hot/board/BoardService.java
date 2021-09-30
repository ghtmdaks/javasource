package com.hot.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hot.util.page.BoardSearchInfo;
import com.hot.util.page.Pager;

public interface BoardService {

	public String insert(HttpSession session, RedirectAttributes redirectAttributes, BoardDTO boardDTO, List<MultipartFile> files) throws Exception;

	public String update(HttpSession session, RedirectAttributes redirectAttributes, List<MultipartFile> files,
			BoardDTO boardDTO) throws Exception;

	public int delete(HttpSession session, int b_num) throws Exception;

	public ModelAndView selectOne(int b_num) throws Exception;

	public ModelAndView selectList(BoardSearchInfo noticeSearchInfo, Pager pager) throws Exception;

}
