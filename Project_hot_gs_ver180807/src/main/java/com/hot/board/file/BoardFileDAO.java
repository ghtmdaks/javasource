package com.hot.board.file;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardFileDAO {

	@Inject
	private SqlSession sqlSession;

	private final String namespace = "boardFileMapper.";
	
	public int fileCnt(int b_num) throws Exception {
		return sqlSession.selectOne(namespace + "fileCnt", b_num);
	}

	public BoardFileDTO selectOne(int bf_num) throws Exception {
		return sqlSession.selectOne(namespace + "selectOne", bf_num);
	}

	public int deleteFileWithFname(String fname) throws Exception {
		return sqlSession.delete(namespace + "deleteFileWithFname", fname);

	}

	public int delteFilesWithB_num(int b_num) throws Exception {
		return sqlSession.delete(namespace + "delteFilesWithB_num", b_num);
	}

	public List<BoardFileDTO> selectList(int b_num) throws Exception {
		return sqlSession.selectList(namespace + "selectList", b_num);
	}

	// 파일 업로드
	public int insert(BoardFileDTO boardFileDTO) throws Exception {
		return sqlSession.insert(namespace + "insert", boardFileDTO);
	}

}
