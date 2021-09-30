package com.hot.game.file;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class GameFileDAO {

	@Inject
	private SqlSession sqlSession;
	private final String NAMESPACE = "gameFileMapper.";
	
	// 게임 이미지 변경
	public int imgUpdate(GameFileDTO gameFileDTO) {
		return sqlSession.update(NAMESPACE + "imgUpdate", gameFileDTO);
	}
	
	// fname으로 게임 이미지 삭제
	public int subImgDeleteWithFname(String fname) {
		return sqlSession.delete(NAMESPACE + "subImgDeleteWithFname", fname);
	}
	
	// 게임 이미지 전부 삭제
	public int imgsDeleteWithG_num(int g_num) throws Exception {
		return sqlSession.delete(NAMESPACE + "imgsDeleteWithG_num", g_num);
	}
	
	// 게임 서브 이미지 카운트
	public int subImgCnt(int g_num) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "subImgCnt", g_num);
	}

	// 게임 이미지 리스트
	public List<GameFileDTO> selectImgs(int g_num) throws Exception {
		return sqlSession.selectList(NAMESPACE + "selectImgsWithG_num", g_num);
	}

	// gf_num 으로 게임 이미지 검색
	public GameFileDTO selectImgWithGf_num(int gf_num) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "selectImgWithGf_num", gf_num);
	}
	
	// g_num 과 kind로 게임 이미지 검색 
	public GameFileDTO selectImg(GameFileDTO gameFileDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "selectImgsWithKind", gameFileDTO);
	}
	
	// 게임 이미지 리스트
	public List<GameFileDTO> selectImgs(GameFileDTO gameFileDTO) throws Exception {
		return sqlSession.selectList(NAMESPACE + "selectImgsWithKind", gameFileDTO);
	}

	// 이미지 정보 입력
	public int insert(GameFileDTO gameFileDTO) throws Exception {
		return sqlSession.insert(NAMESPACE + "imgInsert", gameFileDTO);
	}

}
