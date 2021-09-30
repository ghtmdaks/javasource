package com.hot.review;

import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hot.util.page.Pager;

@Repository
public class ReviewDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "reviewMapper.";

	
	// 리플 달기
	public int reviewReply(ReviewDTO reviewDTO) {
		return sqlSession.insert(namespace + "reviewReply", reviewDTO);
	}

	// 리플 ref,step,depth 업데이트
	public int reviewReplyUpdate(ReviewDTO reviewDTO) {
		System.out.println("dao");
		return sqlSession.update(namespace + "reviewReplyUpdate", reviewDTO);
	}

	// 글 작성
	public int reviewWrite(ReviewDTO reviewDTO) {
		return sqlSession.insert(namespace + "reviewWrite", reviewDTO);
	}

	// 리뷰의 갯수
	public int getTotalRow(int g_num) {
		return sqlSession.selectOne(namespace + "getTotalRow", g_num);
	}
	
	// 리뷰 리스트
	public List<ReviewDTO> reviewList(int g_num, Pager pager) {
		HashMap<String, Object> listInfo = new HashMap<String, Object>();
		listInfo.put("pager", pager);
		listInfo.put("g_num", g_num);
		return sqlSession.selectList(namespace + "reviewList", listInfo);
	}
	
	// 리뷰 리스트
	public List<ReviewDTO> reviewMore(int g_num) {
		HashMap<String, Object> listInfo = new HashMap<String, Object>();
		listInfo.put("g_num", g_num);
		return sqlSession.selectList(namespace + "reviewMore", listInfo);
	}
	

	// 글 하나
	public ReviewDTO reviewOne(int r_num) {
		return sqlSession.selectOne(namespace + "reviewOne", r_num);
	}

	// 글 수정
	public int reviewUpdate(ReviewDTO reviewDTO) {
		return sqlSession.update(namespace + "reviewUpdate", reviewDTO);
	}

	// 글 삭제
	public int reviewDelete(ReviewDTO reviewDTO) {
		return sqlSession.update(namespace+"reviewDelete", reviewDTO);
	}

}
