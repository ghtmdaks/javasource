package com.hot.game;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hot.util.page.Pager;
import com.hot.util.page.GameSearchInfo;

@Repository
public class GameDAO {
	
	@Inject
	private SqlSession sqlSession;
	private final String NAMESPACE = "gameMapper.";
	
	public int downCntUpdate(ArrayList<Integer> g_nums) {
		return sqlSession.update(NAMESPACE + "downCntUpdate", g_nums);
	}
	
	public Timestamp getCurDate () {
		return sqlSession.selectOne(NAMESPACE + "curDate");
	}
	
	public List<GameDTO> saleGameList () {
		return sqlSession.selectList(NAMESPACE + "saleGameList");
	}
	
	public List<GameDTO> recommendGameList () {
		return sqlSession.selectList(NAMESPACE + "recommendGameList");
	}
	
	public List<GameDTO> newGameList () {
		return sqlSession.selectList(NAMESPACE + "newGameList");
	}
	
	public List<GameDTO> hotGameList () {
		return sqlSession.selectList(NAMESPACE + "hotGameList");
	}
	
	public int gameCancelSale(int g_num) {
		return sqlSession.update(NAMESPACE + "gameCancelSale", g_num);
	}
	
	// 세일입니다...
	public int gameSale(GameDTO gameDTO) {
		return sqlSession.update(NAMESPACE + "gameSale", gameDTO);
	}
	
	// 추천 게임에서 삭제
	public int gameCancelRecommend (int g_num) {
		return sqlSession.update(NAMESPACE + "gameCancelRecommend", g_num);
	}
	
	// 추천 게임으로 지정
	public int gameRecommend (int g_num) {
		return sqlSession.update(NAMESPACE + "gameRecommend", g_num);
	}
	
	// 게임 정보 삭제
	public int delete(int g_num) {
		System.out.println("GameDAO - delete");
		return sqlSession.delete(NAMESPACE + "delete", g_num);
	}

	// 게임 정보 수정
	public int update(GameDTO gameDTO) {
		System.out.println("GameDAO - update");
		return sqlSession.update(NAMESPACE + "update", gameDTO);
	}
	
	// 게임 정보 보기
	public GameDTO selectOne(int g_num){
		System.out.println("GameDAO - selectOne");
		return sqlSession.selectOne(NAMESPACE + "selectOne", g_num);
	}
	
	// 게임 정보 리스트
	public List<GameDTO> selectList(Pager pager, GameSearchInfo gameSearchInfo) {
		HashMap<String, Object> listInfo = new HashMap<String, Object>();
		listInfo.put("pager", pager);
		listInfo.put("searchInfo", gameSearchInfo);
		return sqlSession.selectList(NAMESPACE + "selectList", listInfo);
	}
	
	// 게임 정보의 총 갯수
	public int getTotalRow(GameSearchInfo gameSearchInfo) {
		return sqlSession.selectOne(NAMESPACE + "getTotalRow", gameSearchInfo);
	}
	
	// 게임 정보 등록
	public int insert(GameDTO gameDTO) {
		return sqlSession.insert(NAMESPACE + "insert", gameDTO);
	}
	
}
