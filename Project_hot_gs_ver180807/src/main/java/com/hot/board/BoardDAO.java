package com.hot.board;

import java.util.List;

import com.hot.util.page.BoardSearchInfo;
import com.hot.util.page.Pager;

public interface BoardDAO {

	public int insert(BoardDTO boardDTO) throws Exception;

	public int update(BoardDTO boardDTO) throws Exception;

	public int delete(int b_num) throws Exception;

	public BoardDTO selectOne(int b_num) throws Exception;

	public List<BoardDTO> selectList(BoardSearchInfo noticeSearchInfo, Pager pager) throws Exception;

	public int getCount(BoardSearchInfo noticeSearchInfo) throws Exception;

}
