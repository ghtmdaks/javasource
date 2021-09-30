package com.hot.board.notice;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hot.board.BoardDAO;
import com.hot.board.BoardDTO;
import com.hot.util.page.BoardSearchInfo;
import com.hot.util.page.Pager;

@Repository
public class NoticeDAO implements BoardDAO {

	@Inject
	private SqlSession sqlSession;

	private String namespace = "noticeMapper.";
	
	public List<NoticeDTO> homeNoticeList() throws Exception {
		return sqlSession.selectList(namespace + "homeNoticeList");
	}
	
	public int hitUpdate(int b_num) throws Exception {
		return sqlSession.update(namespace + "hitUpdate", b_num);
	}
	
	@Override
	public int insert(BoardDTO boardDTO) throws Exception {
		System.out.println("NoticeDAO - insert");
		return sqlSession.insert(namespace + "insert", boardDTO);
	}

	@Override
	public int update(BoardDTO boardDTO) throws Exception {
		System.out.println("NoticeDAO - update");
		return sqlSession.update(namespace + "update", boardDTO);
	}

	@Override
	public int delete(int b_num) throws Exception {
		System.out.println("NoticeDAO - delete");
		return sqlSession.delete(namespace + "delete", b_num);
	}

	@Override
	public BoardDTO selectOne(int b_num) throws Exception {
		System.out.println("NoticeDAO - selectOne");
		return sqlSession.selectOne(namespace + "selectOne", b_num);

	}

	@Override
	public List<BoardDTO> selectList(BoardSearchInfo boardSearchInfo, Pager pager) throws Exception {
		System.out.println("NoticeDAO - selectList");
		HashMap<String, Object> search = new HashMap<String, Object>();
		search.put("pager", pager);
		search.put("searchInfo", boardSearchInfo);
		return sqlSession.selectList(namespace + "selectList", search);
	}

	@Override
	public int getCount(BoardSearchInfo boardSearchInfo) throws Exception {
		System.out.println("NoticeDAO - getCount");
		return sqlSession.selectOne(namespace + "getCount", boardSearchInfo);
	}

}
